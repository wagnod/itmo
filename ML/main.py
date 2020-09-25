import math
import pandas as pd
import numpy as np
from enum import Enum
from numpy.random.mtrand import randint
from matplotlib import pyplot


class DistFunc(Enum):
    manhattan = "manhattan"
    euclidean = "euclidean"
    chebyshev = "chebyshev"


class KernelType(Enum):
    uniform = "uniform"
    triangular = "triangular"
    epanechnikov = "epanechnikov"
    quartic = "quartic"
    triweight = "triweight"
    tricube = "tricube"
    gaussian = "gaussian"
    cosine = "cosine"
    logistic = "logistic"
    sigmoid = "sigmoid"


class WidthType(Enum):
    fixed = "fixed"
    variable = "variable"


def distance(dist, a, b):
    res = 0.0
    temp = min(len(a), len(b))
    if dist == DistFunc.manhattan:
        for i in range(temp):
            res += abs(a[i] - b[i])
    elif dist == DistFunc.euclidean:
        for i in range(temp):
            res += pow((a[i] - b[i]), 2)
        res = math.sqrt(res)
    elif dist == DistFunc.chebyshev:
        for i in range(temp):
            res = max(res, abs(a[i] - b[i]))
    return res


def knn(kernel, dist, h):
    u = dist / h
    if kernel == KernelType.uniform:
        if u < 1:
            return 0.5
        else:
            return 0.0
    elif kernel == KernelType.triangular:
        if u < 1:
            return 1 - u
        else:
            return 0.0
    elif kernel == KernelType.epanechnikov:
        if u < 1:
            return 0.75 * (1 - (u * u))
        else:
            return 0.0
    elif kernel == KernelType.quartic:
        if u < 1:
            return (15.0 / 16.0) * pow(1 - pow(u, 2), 2)
        else:
            return 0.0
    elif kernel == KernelType.triweight:
        if u < 1:
            return (35.0 / 32.0) * pow(1 - pow(u, 2), 3)
        else:
            return 0.0
    elif kernel == KernelType.tricube:
        if u < 1:
            return (70.0 / 81.0) * pow(1 - pow(u, 3), 3)
        else:
            return 0.0
    elif kernel == KernelType.gaussian:
        return 1 / math.sqrt(2 * math.pi) * (math.exp(-0.5 * pow(u, 2)))
    elif kernel == KernelType.cosine:
        if u < 1:
            return (math.pi / 4) * math.cos((math.pi / 2) * u)
        else:
            return 0.0
    elif kernel == KernelType.logistic:
        return 1 / (math.exp(u) + 2 + math.exp(-u))
    elif kernel == KernelType.sigmoid:
        return 2 / (math.pi * (math.exp(u) + math.exp(-u)))


def minmax(dataset):
    minmax = list()
    for i in range(len(dataset[0])):
        if i == len(dataset[0]) - 1:
            continue
        value_min = dataset[:, i].min()
        value_max = dataset[:, i].max()
        minmax.append([value_min, value_max])
    return minmax


def normalize(dataset, minmax):
    for row in dataset:
        for i in range(len(row)):
            if i == len(row) - 1:
                continue
            row[i] = (row[i] - minmax[i][0]) / (minmax[i][1] - minmax[i][0])

    return dataset


def f_score(conf, k=3):
    f_score = [0] * k
    precision = [0] * k
    recall = [0] * k
    sum_i = [0] * k
    sum_j = [0] * k

    for i in range(k):
        for j in range(k):
            sum_i[i] += conf[i][j]
            sum_j[i] += conf[j][i]

    accuracy = 0
    a = sum(sum_i)

    for i in range(k):
        accuracy += conf[i][i]

    accuracy /= a

    for c in range(k):
        precision[c] = 0 if sum_i[c] == 0 else (conf[c][c]) / (sum_i[c])
        recall[c] = 0 if sum_j[c] == 0 else (conf[c][c]) / (sum_j[c])
        if (precision[c] + recall[c] == 0):
            f_score[c] += 0.0
        else:
            f_score[c] += 2 * (precision[c] * recall[c]) / (precision[c] + recall[c])

    micro = sum([f_score[i] * sum_i[i] for i in range(k)]) / a
    macro_prec = sum([precision[i] * sum_i[i] for i in range(k)]) / a
    macro_rec = sum([recall[i] * sum_i[i] for i in range(k)]) / a

    if (macro_prec + macro_rec == 0):
        macro = 0.0
    else:
        macro = 2 * macro_prec * macro_rec / (macro_prec + macro_rec)

    return macro


def params_generate():
    for kernel in KernelType:
        for func in DistFunc:
            for width in WidthType:
                if width == WidthType.fixed:
                    h = np.linspace(0.1, 4, 10)
                else:
                    h = range(1, 101, 10)
                for par in h:
                    yield kernel, func, width, par


def cross_v(kernel, dist, width, h):
    matrix = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
    for indx in range(210):
        target = data_n[indx][:7]
        expected = data_n[indx][7]
        train = list(data_n.copy())
        del train[indx]
        found = k_func(dist, kernel, width, h, target, train)
        matrix[round(expected) - 1][round(found) - 1] += 1
    return matrix


def k_func(disFunc, kernelT, wType, h, target, data):
    dis_es = []
    for i in range(len(data)):
        dis_es.append([distance(disFunc, data[i], target), i, data[i][7]])
    dis_es.sort(key=lambda x: x[0])
    res = 0
    a = 0
    b = 0
    if wType == WidthType.variable:
        h = dis_es[h][0]
    if h == 0:
        if data[dis_es[0][1]][:7] in target:
            idx = 0
            for i in range(len(dis_es)):
                if data[dis_es[i][1]][:7] in target:
                    res += dis_es[i][2]
                    idx += 1
            res /= idx
            return res
        else:
            for i in range(len(dis_es)):
                res += dis_es[i][2]
            res /= 210
            return res
    else:
        for i in range(len(dis_es)):
            a += 7 * (dis_es[i][2] * knn(kernelT, dis_es[i][0], h))
            b += 7 * knn(kernelT, dis_es[i][0], h)
        if b == 0:
            for i in range(len(dis_es)):
                res += dis_es[i][2]
            res /= 210
        else:
            res = a / b
    return res


dataset = pd.read_csv('seismic-bumps.csv', sep=',')
min_max = minmax(dataset.values)

data_n = normalize(dataset.values, min_max)

target = np.array([13.07, 13.92, 0.848, 5.472, 2.994, 5.304, 5.395])
for i in range(target.size):
    target[i] = (target[i] - min_max[i][0]) / (min_max[i][1] - min_max[i][0])

max_f = -1
best_kernel = None
best_dist = None
best_width = None
best_h = None
for kernel, dist, width, h in list(params_generate()):
    conf_m = cross_v(kernel, dist, width, h)
    f_s = f_score(conf_m)
    if f_s > max_f:
        max_f = f_s
        best_kernel = kernel
        best_dist = dist
        best_width = width
        best_h = h
print(max_f, best_kernel, best_dist, best_width, best_h, sep=' ')

target_class = k_func(best_dist, best_kernel, best_width, best_h, target, data_n)

f_scs = []
if best_width == WidthType.fixed:
    n_h = np.linspace(0.1, 4, 10)
else:
    n_h = range(1, 101, 2)
for i in n_h:
    conf_m= cross_v(best_kernel, best_dist, best_width, i)
    temp_f = f_score(conf_m)
    f_scs.append(temp_f)

pyplot.plot(n_h, f_scs)