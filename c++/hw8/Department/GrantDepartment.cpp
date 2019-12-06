#include "GrantDepartment.h"
#include "../Message/Event.h"

bool GrantDepartment::checkBudget() const {
    return Department::mBudget.printDetails() > 0;
}

void GrantDepartment::payMoney(std::string name, int amountPaid, std::string description) {
    Event* event = new Event(name, amountPaid, description);
    mDescriptions.emplace_back(event);
    Department::mBudget.payMoney(event);
    delete event;
}

std::string GrantDepartment::printDetails() const {
    return Department::printDetails();
}

GrantDepartment::GrantDepartment(Employee* employee, Office office) : Department(employee, office) {
    Department::mDepartmentName = "Grant department";
}

GrantDepartment::GrantDepartment(std::vector<Employee*> employees, std::vector<Office> offices) :
        Department(employees, offices) {
    Department::mDepartmentName = "Grant department";
}