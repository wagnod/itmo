#pragma once

template<class T, class Comp>
T minimum(Array<T>& array, Comp comp) {
    T min = array[0];
    for (int i = 1; i < array.size(); i++) {
        if (comp(array[i], min))
            min = array[i];
    }
    return min;
}

template<class T>
void flatten(T& element) {
    std::cout << element << " ";
}

template<class T>
void flatten(Array<T>& array) {
    for (int i = 0; i < array.size(); i++) {
        flatten(array[i]);
    }
}