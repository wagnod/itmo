#include <iostream>
#include "Array.cpp"
#include "Functions.h"

using namespace std;

struct Greater {
    bool operator()(int a, int b) { return b < a; }
};

struct Less {
    bool operator()(int a, int b) { return a < b; }
};


int main() {
    Array<int> ints(3);
    ints[0] = 10;
    ints[1] = 2;
    ints[2] = 15;
    Array<double> doubles(2);
    doubles[0] = 2.6;
    doubles[1] = 3.9;
    Array<int> eints = ints;

    Array<Array<int>> array_of_ints(2, ints);
    Array<Array<double>> array_of_doubles(3, doubles);

    cout << "First task:" << endl;
    for (int i = 0; i < doubles.size(); i++) {
        cout << "Element number " << i << " in array is " << doubles[i] << endl;
    }
    for (int i = 0; i < eints.size(); i++) {
        cout << "Element number " << i << " in eints is " << eints[i] << endl;
    }

    int max = minimum(ints, Greater());
    int min = minimum(ints, Less());
    cout << "Second task:" << '\n' << "Maximum is: " << max << '\n' << "Minimum is: " << min << endl;

    cout << "Third task" << endl;
    flatten(ints); // выводит на экран строку "10 2 15"
    cout << endl;
    flatten(array_of_ints); // выводит на экран строку "10 2 15 10 2 15"
    cout << endl;
    flatten(doubles); //работает не только с int, выводит строку "2.6 3.9"
    cout << endl;
    flatten(array_of_doubles);  //выводит строку "2.6 3.9 2.6 3.9"

    return 0;
}