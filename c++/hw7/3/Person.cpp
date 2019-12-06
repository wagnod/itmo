#include <utility>

#include <utility>

#include "Person.h"

Person::Person(std::string firstName, std::string secondName, Date birthday, bool isMale) : mBirthday(birthday) {
    this->mFirstName = firstName;
    this->mSecondName = secondName;
    this->mIsMale = isMale;
}

std::string Person::GetInfo() const {
    return mSecondName + " " + mFirstName + ": " + (mIsMale ? "male" : "female") + " born on " + mBirthday.getInfo();
}

std::ostream& operator<<(std::ostream& os, const Person& person) {
    os << person.GetInfo();
    return os;
}