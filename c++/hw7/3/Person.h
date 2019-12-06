#pragma once

#include "Date.h"
#include <iostream>

class Person {

public:
    Person(std::string firstName, std::string secondName, Date birthday, bool isMale);

    ~Person() = default;

    friend std::ostream& operator<<(std::ostream& os, const Person& at);

protected:
    virtual std::string GetInfo() const;

private:
    Date `mBirthday;
    bool mIsMale;
    std::string mFirstName;
    std::string mSecondName;
};