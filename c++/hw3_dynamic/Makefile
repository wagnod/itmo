CXX      	 ?= g++
COMP		 ?= -std=c++17 -Wall -fPIC -c -o

DEFINE_NAME  	 := -DNAME=Pren
LIB_NAME	 := mylib
VERSION		 := 5
MINOR        	 := 1
RELEASE      	 := 10
OBJS     	 := hello.o here.o bye.o
MAIN_OBJ	 := main.o

main.o: main.cpp
	${CXX} ${COMP} $@ $^

here.o: here.cpp
	${CXX} ${COMP} $@ $^

bye.o: bye.cpp
	${CXX} ${COMP} $@ $^

hello.o: hello.cpp
	${CXX} -std=c++17 -Wall -fPIC ${DEFINE_NAME} -c -o $@ $^

mylib.a: $(OBJS)
	ar rcs $@ $^

dyn_lib: $(OBJS)
	${CXX} -shared -o lib${LIB_NAME}.so.${LIBVER} -Wl,-soname,lib${LIB_NAME}.so $^

main: $(MAIN_OBJ) dyn_lib
	ln -s lib${LIB_NAME}.so.${LIBVER} lib${LIB_NAME}.so
	${CXX} -std=c++17 -o main ${MAIN_OBJ} -L. -l${LIB_NAME} -Wl,-rpath,.

test:
	make main
	./main

clean:
	rm -rf *.o
	rm -rf *.a
	rm -rf lib${LIB_NAME}.*
	rm -rf main qq