#include "Event.h"

std::string Event::printDetails() const
{
    return "Event's name: " + mName + "\nDescription: " + mDescription + "\nMoney paid: " + std::to_string(mAmount);
}

Event::Event(std::string name, int amountPaid, std::string description) :
        Description::Description("event", name, amountPaid, description) {}
