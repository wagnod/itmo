#include <iostream>
#include "String.h"

int main() {
    String s = String("Hello");
    String word = String("world");
    String str = String("How are you?");
    std::cout << "Starting with strings: \n";
    s.printString();
    word.printString();
    str.printString();

    String a = "flower";
    s.append(word);
    std::cout << "\n s.append(word)\n";
    s.printString();

    std::cout << "\nstr = word\n";
    str = word;
    str.printString();

    std::cout << "\ns.append(s)\n";
    s.append(s);
    s.printString();
    return 0;
}