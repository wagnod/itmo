#include <iostream>
#include <cstdlib>
#include "mylib.h"

void show(int** array, int numOfStr, int lengthOfStr) {
    for (int i = 0; i < numOfStr; ++i) {
        for (int k = 0; k < lengthOfStr; ++k) {
            std::cout << array[i][k] << " ";
        }
        std::cout << std::endl;
    }
    std::cout << std::endl;
}

int main() {
    int** array = new int* [3];
    for (int i = 0; i < 3; ++i) {
        array[i] = new int[5];
    }
    for (int i = 0; i < 3; ++i) {
        for (int k = 0; k < 5; ++k) {
            array[i][k] = rand() % 10 + 1;
        }
    }
    array[2][4] = 0;
    show(array, 3, 5);
    swapMin(array, 3, 5);
    show(array, 3, 5);
    for (int i = 0; i < 3; ++i) {
        delete[] array[i];
    }
    delete[] array;

    char* str = getLine();
    std::cout << str;
    delete [] str;

    unsigned int new_size;
    std::cin >> new_size;

    char* string = new char[26];
    for (int i = 0; i < 26; ++i) {
        string[i] = i + 65;
    }
    string = resize(string, 26, new_size);
    for (int i = 26; i < new_size; ++i) {
        string[i] = '+';
    }
    for (int i = 0; i < new_size; ++i) {
        std::cout << string[i];
    }
    std::cout << std::endl;
    delete[] string;
    return 0;
}
