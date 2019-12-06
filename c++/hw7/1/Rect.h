#pragma once

#include <iostream>
#include "PlaneFigure.h"

class Rect : public PlaneFigure {
public:
    Rect(double w, double h);

    ~Rect() override = default;

    double getArea() override;

    double getPerimeter() override;

private:
    double mWidth;
    double mHeight;
};