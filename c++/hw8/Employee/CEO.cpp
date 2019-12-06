#include <utility>
#include "CEO.h"

CEO::CEO(std::string name, std::string address, std::string id, int salary) :
        Employee::Employee(name, address, id, salary, "CEO") {}