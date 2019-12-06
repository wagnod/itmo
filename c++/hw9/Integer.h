struct Integer {
public:
    Integer();

    Integer(int value);

    void print();

    Integer& operator=(const Integer& other);
    Integer operator+() const;
    Integer operator-() const;

    Integer operator+(const Integer& other) const;
    int operator+(int k) const;
    Integer operator-(const Integer& other) const;
    Integer operator*(const Integer& other) const;
    Integer operator/(const Integer& other) const;
    Integer operator%(const Integer& other) const;

    Integer& operator+=(const Integer& other);
    Integer& operator-=(const Integer& other);
    Integer& operator*=(const Integer& other);
    Integer& operator/=(const Integer& other);
    Integer& operator%=(const Integer& other);

    Integer& operator++();
    Integer& operator--();
    const Integer operator++(int);
    const Integer operator--(int);

    int operator[](int j) const;
    int operator()(int j) const;

    operator int();

    Integer* operator&();
    Integer& operator*();
    Integer* operator->() const;
    int operator->*(int k) const;
    Integer operator~() const;
    Integer& operator,(const int k);

    bool operator&(const Integer& other) const;
    bool operator|(const Integer& other) const;
    bool operator^(const Integer& other) const;

    Integer& operator&=(const Integer& other);
    Integer& operator^=(const Integer& other);
    Integer& operator|=(const Integer& other);

    bool operator==(const Integer& other) const;
    bool operator!=(const Integer& other) const;
    bool operator>(const Integer& other) const;
    bool operator<(const Integer& other) const;
    bool operator>=(const Integer& other) const;
    bool operator<=(const Integer& other) const;

    bool operator!() const;
    bool operator&&(const Integer& other) const;
    bool operator||(const Integer& other) const;

    int getValue() const;
    void setValue(int val);

private:
    int mValue;
};

std::istream& operator>>(std::istream& is, const Integer& other);
std::ostream& operator<<(std::ostream& os, const Integer& other);