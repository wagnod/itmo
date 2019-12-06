#pragma once

#include <vector>
#include "../Description/Description.h"

class Budget
{
public:
    Budget();
    explicit Budget(int budget);
    std::vector <int> fundActivity() const;
    int printDetails() const;
    void awardMoney(const Description* cause);
    void payMoney(const Description* event);
private:
    std::vector <int> mChanges;
    int mBudget;
};
