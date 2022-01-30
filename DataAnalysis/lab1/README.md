# Лабораторная №1

## 1. Предобработка

Выберите набор данных из списка в конце задания. Обработайте данные в нём:

- Обработайте недостающие данные в датасете - удалить/заменить/etc, обоснуйте своё решение
- Постройте как минимум по 1 графику каждого типа из представленных на лекции. Для каждого построенного графика
  объясните почему отображённые данные лучше всего представимы именно этим типом графика\n",
- Сохраните датасет
- Создайте новую колонку, отображающую характеристику набора данных. Новая колонка должна обладать смысловой нагрузкой.

Например, для набора данных о прямоугольниках с двумя колонками width и height будет корректно придумать колонку area,
равную width * height или perimeter. Некорректно будет придумать колонку width2, равную width * 2, потому что эта
информация не будет нести полезную информацию о фигурах.

Не оценивается баллами, но даёт очки уважения:

- Выдвиньте 2 гипотезы о данных. Например, для датасета codeforces достаточно интересной гипотезой может быть простые
  задачи (рейтинг меньше 1500) почти всегда решаются больше 5000 раз.

Наборы данных:

1. [Spotify Tracks DB](https://www.kaggle.com/zaheenhamidani/ultimate-spotify-tracks-db) - характеристики треков в
   spotify
2. [VKontakte Dataset of Users' Textual Data](https://www.kaggle.com/oldaandozerskaya/vkontakte-dataset-of-users-textual-data)
3. основная информация 10к профилей ВК
4. [Data Science for COVID-19](https://www.kaggle.com/kimjihoo/coronavirusdataset) - информация о распространении
   коронавируса в Южной Корее в 2020 году
5. [Dota 2 - Pro Players Matches Results 2019 ~ 2021](https://www.kaggle.com/devinanzelmo/dota-2-matches?select=player_ratings.csv)
    - информация матчей игроков DoTA 2. Если данные не влезают в память, можно
      воспользоваться [аналогом pandas](https://dask.org/) для обработки вне RAM
6. [GPS Data of Seabirds](https://www.kaggle.com/saurabhshahane/predicting-animal-behavior-using-gps) - данные о
   миграции птиц
7. [FAANG Historical Stock Price Data](https://www.kaggle.com/specter7/amazon-amzn-historical-stock-price-data) - данные
   о биржевых котировках компаний FAANG c 2016 по 2021 год
8. [NBA 2k20 player dataset](https://www.kaggle.com/isaienkov/nba2k20-player-dataset) - информация об игроках NBA
9. [Anime dataset](https://www.kaggle.com/thunderz/anime-dataset?select=user_data.csv) - данные о просмотре аниме
   пользователями с сайта myAnimeList

## 2. Интерполяция

С помощью библиотеки scipy примените один из
её [алгоритмов интерполяции](https://docs.scipy.org/doc/scipy/reference/interpolate.html) к сгенерированным данным.
Изучите математический подход метод выбранного алгоритма интерполяции в scipy. Найдите и продемонстрируйте при сдаче
реализацию метода в исходном коде библиотеки scipy. Найти можно
в [github репозитории проекта](https://github.com/scipy/scipy). Выберите среди методов интерполяции в scipy любой другой
метод интерполяции (кроме линейной интерполяций). Реализуйте выбранный метод без использования сторонних библиотек.
Разрешается использовать numpy для упрощения математичеких вычислений. Визуализируйте кривую интерполяции библиотечного
и вашего алгоритмов с помощью matplotlib. Сравните качество интерполяции своего и библиотечного методов, объясните
разницу в качестве.

## 3. Быстрая гистограмма

Иногда хочется получить дискретное распределение из N колонок. Но пока что для этого у нас есть только `plt.hist()`,
которая тратит много времени на отрисовку графика. Вам предлагается реализовать свою функцию построения дискретного
распределения.

* Алгоритм должен получать на вход список чисел и количество колонок гистограммы. Возвращать нужно значения столбцов (
  ось абсцисс гистограммы) и количество значений, принадлежащее столбцу (ось ординат гистограммы). Пример с
  использованием plt показан ниже, сигнатура функции также показана ниже.
* Изучите функцию [plt.bar](https://matplotlib.org/stable/api/_as_gen/matplotlib.pyplot.bar.html). Это такая же
  гистограмма как plt.hist, но в отличие от hist требуется явно указывать высоту колонок и их название.
* С помощью результатов своего алгоритма и plt.bar постройте гистограмму по массиву из 50+ случайных чисел. Графики
  plt.bar по вашему алгоритму и plt.hist() должны совпадать, что подтвердит корректность работы вашего алгоритма.
* Сравните скорость построения распределения по массиву чисел с помощью своего алгоритма и с помощью plt.hist. В jupyter
  рекомендуется использовать built-in magic commands, а именно timeit. Но можно обойтись и ручными измерениями времени
  выполнения"

# Пример гистограммы с помощью plt.hist()

```python
import matplotlib.pyplot as plt

array = [1, 1, 2, 3, 4, 1, 2, 3, 4]
value_counts, bins_names, visual_figure = plt.hist(array, bins=len(set(array)), rwidth=0.9)
```

**Параметр rwidth и визуализацию в своей функции реализовывать не требуется**

```python
from typing import List, Tuple, Union


def fast_hist(array: List[Union[int, float]], bins: int) -> Tuple[List[int], List[float]]:
    "Builds bins' labels and bins' value counts for given array"
    ":param array: array with numeric values"
    ":param bins:  number of bins in result distribution"
    ":return: Two lists:"
    "first contains value counts of each bin"
    "second contains list of bins' labels"
    raise NotImplemented
```