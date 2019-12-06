CXX      	 ?= g++
COMP		 ?= -c -o

DEFINE_NAME  	 := -DNAME=Wagnod
LIB_NAME	 := mylib
OBJS     	 := hello.o here.o bye.o
MAIN_OBJ	 := main.o

main.o: main.cpp
	${CXX} ${COMP} $@ $^

here.o: here.cpp
	${CXX} ${COMP} lib/$@ $^

bye.o: bye.cpp
	${CXX} ${COMP} lib/$@ $^

hello.o: hello.cpp
	${CXX} ${DEFINE_NAME} ${COMP} lib/$@ $^

mylib.a: ${OBJS}
	ar rcs lib/lib$@ lib/*.o

main: ${MAIN_OBJ} mylib.a
	${CXX} main.cpp -Llib -l${LIB_NAME} -o $@

test:
	make main
	./main

clean:
	rm -rf lib/*.o
	rm -rf main