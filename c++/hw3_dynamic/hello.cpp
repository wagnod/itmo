#include <iostream> 
#include "mylib.h" 

#define PRINT(x) #x 
#define PRINTNAME(y) PRINT(y) 

void hello() { 
#ifdef NAME 
std::cout << "Hello, " << PRINTNAME(NAME) << "\n"; 
#else 
std::cout << "Hello!" << "\n"; 
#endif 
return; 
}