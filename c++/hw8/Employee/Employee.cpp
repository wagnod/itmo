#include "Employee.h"

std::string Employee::printDetails() const
{
    return "Name: " + mName + "\nAddress: " + mAddress + "\nID: " + mId + "\nSalary: " + std::to_string(mSalary) +
           "\nJobType: " + mJobType + "\n";
}

Employee::Employee(std::string name, std::string address, std::string id, int salary, std::string jobType)
{
    mName = name;
    mAddress = address;
    mId = id;
    mSalary = salary;
    mJobType = jobType;
}

void Employee::changeSalary(int newSalary)
{
    mSalary = newSalary;
}

void Employee::changeAddress(std::string newAddress)
{
    mAddress = newAddress;
}

void Employee::changeId(std::string newId)
{
    mId = newId;
}

Employee::Employee() = default;