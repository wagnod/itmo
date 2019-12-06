#include <iostream>
#include <set>
#include <vector>

using namespace std;

int main() {
    freopen("broken-keyboard.in", "r", stdin);
    freopen("broken-keyboard.out", "w", stdout);
    vector<string> files;
    string name;
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> name;
        files.push_back(name);
    }
    cout << "YES" << endl;
    string str = files[0];
    for (int i = 1; i < n; i++) {
        name = files[i];
        int tmp = 0;
        set<char> words = {};
        while (!words.count(name[tmp]) && tmp < name.length()) {
            words.insert(name[tmp]);
            tmp++;
        }
        if (tmp == name.length()) {
            cout << "YES" << endl;
        } else if (str.substr(0, tmp) < name.substr(0, tmp)) {
            cout << "YES" << endl;
        } else if (tmp > str.length()) {
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
        str = name;
    }

    return 0;
}