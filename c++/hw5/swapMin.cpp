#include <limits>

void swapMin(int** arr, int lines, int columns) {
    int minimum = std::numeric_limits<int>::max();
    int minLine = 0;

    for (int i = 0; i < lines; ++i) {
        for (int j = 0; j < columns; ++j) {
            if (arr[i][j] < minimum) {
                minimum = arr[i][j];
                minLine = i;
            }
        }
    }
    int* cur = arr[0];
    arr[0] = arr[minLine];
    arr[minLine] = cur;
}