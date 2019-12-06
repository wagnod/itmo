#include "Secretary.h"
Secretary::Secretary(std::string name, std::string address, std::string id, int salary) :
        Employee::Employee(name, address, id, salary, "Secretary") {}