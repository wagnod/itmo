#pragma once

#include <cstddef>

template<class T>
class Array {
public:
    explicit Array(size_t size = 0, const T& value = T());

    Array(const Array& copy);

    ~Array();

    Array& operator=(const Array& copy);

    T& operator[](size_t index);

    const T operator[](size_t index) const;

    size_t size() const;

private:
    size_t mSize;
    T* mData;
};