#include <iostream>
#include <string>

using namespace std;

int cnt_pos[1000];

int main()
{
    //ios_base::sync_with_stdio(0);
    string str;
    cin >> str;
    if (str.size() == 1) {
        cout << 1 << "\n" << str;
        return 0;
    }
    int cnt = 0;
    for (int i = 0; i < str.size() - 1; ++i) {
        cnt_pos[i] = (int)(str[i] - '0');
        cnt += cnt_pos[i] * 2;
    }
    if (str[str.size() - 1] != '0') {
        cout << cnt + 1 << "\n" << str[str.size() - 1] << " ";
    } else {
        cout << cnt << "\n";
    }
    string nines = "";
    int pos = str.size() - 1;
    while (pos > 0) {
        pos--;
        nines += "9";
        for (int i = 0; i < cnt_pos[pos]; i++) {
            cout << 1 << " " << nines << " ";
        }
    }
    return 0;
}
