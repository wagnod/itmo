#include <iostream>
#include <cmath>
#include <iomanip>
#include <cstdio>
#include "Integer.h"

int main()
{
    Integer num;
    num.print();
    num = Integer(2);
    num.print();
    num = num + 6;
    num.print();
    num -= Integer(3);
    num.print();
    num++;
    num.print();
    ++num;
    num.print();
    Integer num1 = num[6];
    num1->print();
    num1 = num(3);
    num1->print();
    Integer num2;
    std::cout << "Insert number" << "\n";
    std::cin >> num2;
    std::cout << num2 + 1 << "\n";
    Integer num3 = *num2;
    num3.print();
    num3 = ~num2;
    num3.print();
    Integer num4 = num3->getValue();
    std::cout << num4 << "\n";
    bool flag = num3 & Integer(55);
    std::cout << flag << "\n";
    Integer num5 = 6;
    num5,5;
    std::cout << "integer: " << (int)num5 << "\n";
    std::cout << "integer: " << int(num5) << "\n";
    std::cout << num5 << "\n";
    return 0;
}
