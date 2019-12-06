#pragma once

#include <iostream>
#include "Description.h"

class Event : public Description
{
public:
    std::string printDetails() const override;
    Event(std::string name, int amountPaid, std::string description = "---");
};