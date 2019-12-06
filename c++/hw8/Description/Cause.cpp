#include "Cause.h"

std::string Cause::printDetails() const
{
    return "Cause's name: " + mName + "\nDescription: " + mDescription + "\nMoney awarded: " + std::to_string(mAmount);
}

Cause::Cause(std::string name, int amountAwarded, std::string description) :
        Description::Description("cause", name, amountAwarded, description) {}