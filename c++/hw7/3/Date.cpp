#include "Date.h"
#include <string>

Date::Date(int day, int month, int year) {
    this->mDay = day;
    this->mMonth = month;
    this->mYear = year;
}

std::string Date::getInfo() const {
    return std::to_string(this->mDay) + "/" + std::to_string(this->mMonth) + "/" + std::to_string(this->mYear);
}

std::ostream& operator<<(std::ostream& os, const Date& date) {
    os << date.getInfo();
    return os;
}