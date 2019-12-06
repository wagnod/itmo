#pragma once

#include <iostream>
#include "Description.h"

class Cause : public Description
{
public:
    std::string printDetails() const override;
    Cause(std::string name, int amountAwarded, std::string description = "---");
};
