#include "FundRaisingDepartment.h"
#include "../Message/Cause.h"

std::string FundRaisingDepartment::printDetails() const
{
    std::string result;
    for (auto message: mDescriptions)
    {
        result += message->printDetails() + "\n";
    }
    return result;
}

void FundRaisingDepartment::awardMoney(std::string name, int amountAwarded, std::string description)
{
    Description* cause = new Cause(name, amountAwarded, description);
    Department::mBudget.awardMoney(cause);
    mDescriptions.emplace_back(cause);
}

FundRaisingDepartment::FundRaisingDepartment(Employee* employee, Office office) : Department(employee, office)
{
    Department::mDepartmentName = "Fund raising department";
}

FundRaisingDepartment::FundRaisingDepartment(std::vector <Employee*> employees, std::vector <Office> offices)
        : Department(employees, offices)
{
    Department::mDepartmentName = "Fund raising department";
}