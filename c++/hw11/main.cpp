#include <iostream>
#include "LinkedPointer_impl.h"

template<class T>
void isUnique(LinkedPtr <T>& ptr ) {
    if(ptr.unique()) {
        std::cout << "Ptr1 is unique. " << std::endl;
    } else {
        std::cout << "Ptr1 is not unique. " << std::endl;
    }
}

void firstTest() {
    std::cout << "Create linked pointer to int:" << std::endl;
    LinkedPtr<int> ptr(new int(123));
    std::cout << "First it was like: " << *ptr << std::endl;
    *ptr = 909;
    std::cout << "But then: " << *ptr << std::endl;
    std::cout << std::endl;
}


void secondTest() {
    std::cout << "Using linked pointer with string //here comes any type: " << std::endl;
    LinkedPtr<std::string> ptr(new std::string("Tired Potato"));
    std::cout << "ptr is: " << *ptr << std::endl;
    LinkedPtr<std::string> ptr1(new std::string("I am hungry"));
    std::cout << "And another one ptr1: " << *ptr1 << std::endl;
    std::cout << (ptr.unique() ? "Ptr unique" : "Ptr not unique") << std::endl;
    ptr = ptr1;
    std::cout << "Now first pointer = second pointer, so first pointer returns: " << *ptr << ". And became ";
    std::cout << (ptr.unique() ? "unique" : "not unique") << std::endl;
    std::cout << std::endl;
}

void thirdTest() {
    LinkedPtr<int> ptr(new int(33));
    LinkedPtr ptr1(ptr);
    LinkedPtr<int> ptr2(nullptr);
    std::cout << *ptr << " " << *ptr1 << std::endl;
    *ptr = 35;
    std::cout << "Changing ptr value. ptr became: " << *ptr << ". And ptr1 became: " << *ptr1 << std::endl;
    *ptr1 = 47;
    std::cout << "Changing ptr1 value. ptr1 became: " << *ptr1 << ". And ptr became: " << *ptr << std::endl;
    isUnique(ptr1);
    ptr1 = ptr2;
    std::cout << "ptr1 = ptr2 (which is nullptr)" << std::endl;
    isUnique(ptr1);
}

using namespace std;

int main() {
    firstTest();
    secondTest();
    thirdTest();
    return 0;
}