#pragma once

#include <string>

class Description
{
public:
    virtual std::string printDetails() const;
    Description(std::string type, std::string name, int amount, std::string description = "---");
    int getResults() const;
protected:
    int mAmount;
    std::string mType;
    std::string mName;
    std::string mDescription;
};