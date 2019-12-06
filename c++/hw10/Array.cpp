#include "Array.h"
#include <ostream>

template<class T>
Array<T>::Array(size_t size, const T& value) : mSize(size), mData(new T[size]) {
    for (int i = 0; i < mSize; i++) {
        new(mData + i) T(value);
    }
}

template<class T>
Array<T>::Array(const Array& obj) : mSize(obj.mSize), mData(new T[obj.mSize]) {
    for (int i = 0; i < mSize; i++) {
        new(mData + i) T(obj.mData[i]);
    }
}

template<class T>
Array<T>::~Array() {
    delete[](mData);
}

template<class T>
Array<T>& Array<T>::operator=(const Array& obj) {
    if (this != &obj) {
        delete[] mData;
        mSize = obj.mSize;
        mData = new T[mSize];
        for (size_t i = 0; i < mSize; ++i) {
            mData[i] = obj.mData[i];
        }
    }
    return *this;
}

template<class T>
T& Array<T>::operator[](size_t i) {
    return mData[i];
}

template<class T>
const T Array<T>::operator[](size_t i) const {
    return mData[i];
}

template<class T>
size_t Array<T>::size() const {
    return mSize;
}