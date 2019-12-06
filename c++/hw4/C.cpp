#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <sstream>

using namespace std;

int main() {
    vector<int> cards;
    vector<int> partitions;
    int partition, n;
    string s;
    string card;

    getline(cin, card);
    getline(cin, s);
    istringstream iss(s);
    istringstream isstr(card);

    while (iss >> partition) {
        partitions.push_back(partition - 1);
    }
    while (isstr >> n) {
        cards.push_back(n);
    }
    if (partitions.front() != 0) {
        partitions.insert(partitions.begin(), -1);
    }

    partitions.push_back(cards.size() - 1);
    for (int i = partitions.size() - 1; i > 0; --i) {
        for (int j = partitions[i - 1] + 1; j <= partitions[i]; j++) {
            cout << cards[j] << " ";
        }
    }
    return 0;
}