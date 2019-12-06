cmake_minimum_required(VERSION 3.14)
project(hw8)

set(CMAKE_CXX_STANDARD 17)

add_executable(hw8 main.cpp Budget/Budget.cpp Budget/Budget.h Office/Office.cpp Office/Office.h Employee/CEO.cpp Employee/CEO.h Employee/Employee.cpp Employee/Employee.h Employee/Director.cpp Employee/Director.h Employee/Secretary.cpp Employee/Secretary.h Department/Department.cpp Department/Department.h Department/GrantDepartment.cpp Department/GrantDepartment.h Department/FundRaisingDepartment.cpp Department/FundRaisingDepartment.h Department/Trust.cpp Department/Trust.h FundsBalance/FundsBalance.cpp FundsBalance/FundsBalance.h Description/Cause.cpp Description/Cause.h Description/Event.cpp Description/Event.h Description/Description.cpp Description/Description.h)