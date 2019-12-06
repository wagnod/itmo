#include <iostream> 
#include "mylib.h" 

//#define hasname(x) #x
//#define printname(y) hasname(y)

void hello() { 
#ifdef NAME 
std::cout << "Hello, " << NAME/*printname(NAME)*/ << "\n";
#else 
std::cout << "Hello!" << "\n"; 
#endif 
return; 
}