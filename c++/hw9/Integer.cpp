#include <iostream>
#include <cmath>
#include "Integer.h"

Integer::Integer()
{
    mValue = 0;
}

Integer::Integer(int value)
{
    mValue = value;
}

void Integer::print()
{
    std::cout << "number " << mValue << "\n";
}

Integer& Integer::operator=(const Integer& other)
{
    if (this == &other) {
        return *this;
    }
    mValue = other.mValue;
    return *this;
}
Integer Integer::operator+() const
{
    return Integer(mValue);
}
Integer Integer::operator-() const
{
    return Integer(-mValue);
}

Integer Integer::operator+(const Integer& other) const {
    return Integer(mValue + other.mValue);
}
int Integer::operator+(int k) const {
    return mValue + k;
}
Integer Integer::operator-(const Integer& other) const {
    return Integer(mValue - other.mValue);
}
Integer Integer::operator*(const Integer& other) const {
    return Integer(mValue * other.mValue);
}
Integer Integer::operator/(const Integer& other) const {
    return Integer(mValue / other.mValue);
}
Integer Integer::operator%(const Integer& other) const {
    return Integer(mValue % other.mValue);
}

Integer& Integer::operator+=(const Integer& other) {
    mValue += other.mValue;
    return *this;
}
Integer& Integer::operator-=(const Integer& other) {
    mValue -= other.mValue;
    return *this;
}
Integer& Integer::operator*=(const Integer& other) {
    mValue *= other.mValue;
    return *this;
}
Integer& Integer::operator/=(const Integer& other) {
    mValue /= other.mValue;
    return *this;
}
Integer& Integer::operator%=(const Integer& other) {
    mValue %= other.mValue;
    return *this;
}

Integer& Integer::operator++() {
    mValue += 1;
    return *this;
}
Integer& Integer::operator--() {
    mValue -= 1;
    return *this;
}
const Integer Integer::operator++(int) {
    Integer prev = *this;
    ++*this;
    return prev;
}
const Integer Integer::operator--(int) {
    Integer prev = *this;
    --*this;
    return prev;
}

int Integer::operator[](int j) const {
    return (mValue + j) % 5;
}
int Integer::operator()(int j) const {
    return abs(mValue - j) % 3;
}

Integer* Integer::operator&()
{
    return this;
}
Integer& Integer::operator*()
{
    return *this;
}
Integer* Integer::operator->() const
{
    return const_cast<Integer *>(this);
}
int Integer::operator->*(int k) const
{
    return mValue - (mValue % k);
}
Integer Integer::operator~() const
{
    return Integer(mValue * 2);
}
Integer& Integer::operator,(const int k)
{
    mValue = k;
    return *this;
};

bool Integer::operator&(const Integer& other) const
{
    return (mValue + 1 == other.mValue);
}
bool Integer::operator|(const Integer& other) const
{
    return (mValue - 1 == other.mValue);
}
bool Integer::operator^(const Integer& other) const
{
    return (mValue * 2 == other.mValue);
}

Integer& Integer::operator&=(const Integer &other) {
    mValue %= (other.mValue * 2);
    return *this;
}

Integer& Integer::operator^=(const Integer& other) {
    mValue += mValue * other.mValue;
    return *this;
}

Integer& Integer::operator|=(const Integer& other) {
    mValue = (other.mValue % mValue);
    return *this;
}

bool Integer::operator==(const Integer& other) const
{
    return mValue == other.mValue;
}
bool Integer::operator!=(const Integer& other) const
{
    return mValue != other.mValue;
}
bool Integer::operator<=(const Integer& other) const
{
    return mValue <= other.mValue;
}
bool Integer::operator>=(const Integer& other) const
{
    return mValue >= other.mValue;
}
bool Integer::operator<(const Integer& other) const
{
    return mValue < other.mValue;
}
bool Integer::operator>(const Integer& other) const
{
    return mValue > other.mValue;
}

bool Integer::operator!() const
{
    return mValue % 2 == 0;
}
bool Integer::operator&&(const Integer& other) const
{
    return mValue % 2 == other.mValue % 3;
}
bool Integer::operator||(const Integer& other) const
{
    return (mValue % 2 == 0) || (other.mValue % 2 == 0);
}

Integer::operator int()
{
    return mValue;
}

int Integer::getValue() const
{
    return mValue;
}

void Integer::setValue(int val)
{
    mValue = val;
}

std::istream& operator>>(std::istream& is, const Integer& other)
{
    int t;
    is >> t;
    other->setValue(t);
    return is;
}
std::ostream& operator<<(std::ostream& os, const Integer& other)
{
    os << other->getValue();
    return os;
}
