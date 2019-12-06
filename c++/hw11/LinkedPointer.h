#pragma once

#include <cstddef>

template<class T>
class LinkedPtr {
public:
    LinkedPtr();
    explicit LinkedPtr(T* pointer = nullptr);
    LinkedPtr(LinkedPtr& other);
    LinkedPtr(LinkedPtr&& other) noexcept;
    explicit LinkedPtr(std::nullptr_t aNullptr);
    ~LinkedPtr();
    LinkedPtr& operator=(LinkedPtr& other);
    LinkedPtr& operator=(LinkedPtr&& other) noexcept;

    void reset(T* ptr);
    bool unique() const;
    explicit operator bool() const;

    T* get() const;
    T& operator*();
    T* operator->();

    bool operator>(const LinkedPtr& other) const;
    bool operator<(const LinkedPtr& other) const;
    bool operator>=(const LinkedPtr& other) const;
    bool operator<=(const LinkedPtr& other) const;
    bool operator==(const LinkedPtr& other) const;
    bool operator!=(const LinkedPtr& other) const;
private:
    void link(LinkedPtr& linkedPtr);
    LinkedPtr* mPrev;
    LinkedPtr* mNext;
    T* mValue;
};
