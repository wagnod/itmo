#include <iostream>

using namespace std;

bool check(int matrix[9][9]) {
    for (int i = 0; i < 9; ++i) {
        int check[10] = {};
        int checkR[10] = {};
        for (int j = 0; j < 9; ++j) {
            if ((check[matrix[i][j]] == 0) && (checkR[matrix[j][i]] == 0)) {
                check[matrix[i][j]] = 1;
                checkR[matrix[j][i]] = 1;
            } else {
                return false;
            }
        }
    }
    return true;
}

bool checkSpecial(int l, int k, int matrix[9][9]) {
    for (int i = l; i < l + 3; ++i) {
        int check[10] = {};
        for (int j = k; j < k + 3; ++j) {
            if (check[matrix[i][j]] == 0) {
                check[matrix[i][j]] = 1;
            } else {
                return false;
            }
        }
    }
    return true;
}

int main() {
    int matrix[9][9];
    for (int i = 0; i < 9; ++i) {
        for (int j = 0; j < 9; ++j) {
            cin >> matrix[i][j];
        }
    }
    bool checkL = check(matrix);
    bool checkS = false;
    for (int i = 0; i < 3; ++i) {
        for (int j = 0; j < 3; j++) {
            checkS = checkSpecial(i * 3, j * 3, matrix);
        }
    }
    if (checkL && checkS) {
        cout << "Yes";
    } else {
        cout << "No";
    }

    return 0;
}