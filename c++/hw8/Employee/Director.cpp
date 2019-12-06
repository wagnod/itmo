#include "Director.h"

Director::Director(std::string name, std::string address, std::string id, int salary) :
        Employee::Employee(name, address, id, salary, "Director") {}