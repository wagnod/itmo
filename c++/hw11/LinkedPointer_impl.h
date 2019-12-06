#include "LinkedPointer.h"

template<class T>
LinkedPtr<T>::LinkedPtr() : mValue(nullptr) {
    mPrev = mNext = this;
}

template<class T>
LinkedPtr<T>::LinkedPtr(T* pointer) : mValue(pointer) {
    mPrev = mNext = this;
}

template<class T>
LinkedPtr<T>::LinkedPtr(LinkedPtr& other) : mValue(other.mValue) {
    if (mValue)
        link(other);
    else
        mPrev = mNext = this;
}

template<class T>
LinkedPtr<T>::LinkedPtr(LinkedPtr&& other) noexcept: mValue(other), mPrev(this), mNext(this) {
    other.mValue = nullptr;
}

template<class T>
LinkedPtr<T>::LinkedPtr(std::nullptr_t nullPtr) : mValue(nullPtr) {
    mPrev = mNext = this;
}

template<class T>
LinkedPtr<T>& LinkedPtr<T>::operator=(LinkedPtr& other) {
    if (this != &other) {
        reset(other.mValue);
        if (other.mValue) {
            link(other);
        }
    }
    return *this;
}

template<class T>
LinkedPtr<T>& LinkedPtr<T>::operator=(LinkedPtr&& other) noexcept {
    if (this != &other) {
        reset(other.mValue);
        if (other.mValue) {
            other.mValue = nullptr;
        }
    }
    return *this;
}

template<class T>
LinkedPtr<T>::~LinkedPtr() {
    if (mValue)
        reset(nullptr);
}

template<class T>
void LinkedPtr<T>::reset(T* ptr) {
    if (unique())
        delete mValue;
    else {
        mPrev->mNext = mNext;
        mNext->mPrev = mPrev;
    }
    mNext = mPrev = this;
    mValue = ptr;
}

template<class T>
bool LinkedPtr<T>::unique() const {
    return this == mNext && this == mPrev;
}

template<class T>
T* LinkedPtr<T>::get() const {
    return mValue;
}

template<class T>
LinkedPtr<T>::operator bool() const {
    return mValue != nullptr;
}

template<class T>
T* LinkedPtr<T>::operator->() {
    return this;
}

template<class T>
T& LinkedPtr<T>::operator*() {
    return *mValue;
}

template<class T>
void LinkedPtr<T>::link(LinkedPtr& linkedPtr) {
    if (linkedPtr.unique()) {
        linkedPtr.mNext = linkedPtr.mPrev = this;
        mNext = mPrev = &linkedPtr;
    } else {
        mNext = linkedPtr.mNext;
        mPrev = &linkedPtr;
        linkedPtr.mNext = this;
    }
}

template<class T>
bool LinkedPtr<T>::operator<(const LinkedPtr& other) const {
    return mValue < other.mValue;
}

template<class T>
bool LinkedPtr<T>::operator>(const LinkedPtr& other) const {
    return other < *this;
}

template<class T>
bool LinkedPtr<T>::operator>=(const LinkedPtr& other) const {
    return !(*this < other);
}

template<class T>
bool LinkedPtr<T>::operator<=(const LinkedPtr& other) const {
    return !(*this > other);
}

template<class T>
bool LinkedPtr<T>::operator==(const LinkedPtr& other) const {
    return mValue == other.mValue;
}

template<class T>
bool LinkedPtr<T>::operator!=(const LinkedPtr& other) const {
    return !(*this == other);
}