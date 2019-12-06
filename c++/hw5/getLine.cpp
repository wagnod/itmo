#include <iostream>
#include "mylib.h"

char* getLine()
{
    char ch;
    unsigned int length = 1;
    char* str = new char[length];
    int counter = 0;
    while (std::cin.get(ch) && ch != '\n') {
        str = resize(str, length, length + 1);
        length++;
        str[counter] = ch;
        counter++;
    }
    str[counter] = '\0';
    return str;
}


