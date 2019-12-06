#include <iostream>

struct Foo {
    void say() const {
        std::cout << "Foo says: " << msg << "\n";
    }

protected:
    Foo(const char* msg) : msg(msg) {}

private:
    const char* msg;
};

struct Bar : Foo {
    explicit Bar(const char* msg) : Foo(msg) {};
};

Foo get_foo(const char* msg){
    return Bar(msg);
}

void foo_says(const Foo& foo) {
    foo.say();
}

int main() {
    foo_says(get_foo("Look, what you have done."));
    return 0;
}