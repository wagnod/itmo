#include "Description.h"

Description::Description(std::string type, std::string name, int amount, std::string description)
{
    mType = type;
    mName = name;
    mDescription = description;
    mAmount = amount;
}

std::string Description::printDetails() const
{
    return "Type: " + mType + "\nDescription: " + mDescription;
}

int Description::getResults() const
{
    return mAmount;
}