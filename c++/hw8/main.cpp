#include <iostream>
#include "Department/Department.h"
#include "Employee/CEO.h"
#include "Employee/Director.h"
#include "Department/GrantDepartment.h"
#include "Department/FundRaisingDepartment.h"
#include <vector>

int main()
{
    Employee* employee1 = new CEO("Varia Simonovich", "Agnst", "239239239", 10000);
    Employee* employee2 = new Director("Nina Lynch", "Fluff", "30303030", 10000);
    Office office("Ficbook", 1234567);
    std::vector <Employee*> employees = {employee1, employee2};
    std::vector <Office> offices = {office};

    FundRaisingDepartment fundRaisingDepartment(employees, offices);
    fundRaisingDepartment.awardMoney("Request", 12000, "Fanfic");
    std::cout << fundRaisingDepartment.printDetails();

    GrantDepartment grantDepartment(employee1, office);
    std::cout << "\n\n";
    grantDepartment.payMoney("Grant", 1000, "for junior's best project");
    std::cout << grantDepartment.printDetails() << "\n\n";

    delete employee1;
    delete employee2;

    return 0;
}