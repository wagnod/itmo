#include <iostream>
#include "Rect.h"
class Driver {
public:
    void test(PlaneFigure* pf) const {
        std::cout << "Area is: " << pf->getArea() << " square meters." << '\n';
        std::cout << "Perimeter is: " << pf->getPerimeter() << " meters." << '\n';
    }
};

int main() {
    Driver driver;
    PlaneFigure* pf = new Rect(2, 3);
    driver.test(pf);
    delete pf;
    return 0;
}