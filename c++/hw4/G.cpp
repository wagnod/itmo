#include <iostream>
#include <fstream>

std::ifstream fin("reverse.in");
std::ofstream fout("reverse.out");

void reverse(int n) {
    if (n != 0) {
        long long tmp;
        fin >> tmp;
        reverse(--n);
        fout << tmp << " ";
    }
}

int main() {
    int n;
    fin >> n;
    reverse(n);
    return 0;
}