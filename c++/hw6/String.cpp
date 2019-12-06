#include <cstring>
#include <iostream>
#include "String.h"

String::String(const char* str) : mSize(strlen(str)) {
    mString = new char[mSize];
    strcpy(mString, str);
    mString[mSize] = '\0';
}

String::~String() {
    delete[] mString;
}

void String::append(const String& str) {
    mSize += str.mSize;
    char* append = strcat(strcpy(new char[mSize + 1], mString), str.mString);
    delete[] mString;
    mString = append;
}

size_t String::getSize() const {
    return mSize;
}

String& String::operator=(const String& data) {
    delete[] mString;
    mSize = data.mSize;
    mString = new char[data.mSize + 1];
    for (size_t i = 0; i <= data.mSize; ++i) {
        mString[i] = data.mString[i];
    }
    return *this;
}

void String::printString() {
    std::cout << "length:" << " " << getSize() << "\n";
    int i = 0;
    while (mString[i] != '\0') {
        std::cout << mString[i];
        i++;
    }
    std::cout << '\n';
}
