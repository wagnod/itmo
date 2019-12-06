#include <cstddef>

class String {
public:
    explicit String(const char* str = "");

    ~String();

    void append(const String& other);

    void printString();

    size_t getSize() const;

    String& operator=(const String& data);

private:
    size_t mSize;
    char* mString;
};