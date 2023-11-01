cmake_minimum_required(VERSION 3.26)
project(Practice_31 C)

set(CMAKE_C_STANDARD 11)

# Agrega el subdirectorio src
add_subdirectory(src)

# Agrega el subdirectorio tests
add_subdirectory(tests)

include_directories(.)
