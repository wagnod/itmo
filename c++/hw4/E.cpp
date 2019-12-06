#include <iostream>
#include <vector>

using namespace std;

long long gcd(long long a, long long b) {
    if (b == 0)
        return a;
    else
        return gcd (b, a % b);
}

int main() {
    freopen("gcd.in", "r", stdin);
    freopen("gcd.out", "w", stdout);
    long long a, b;
    cin >> a >> b;
    cout << gcd(a, b);

    return 0;
}