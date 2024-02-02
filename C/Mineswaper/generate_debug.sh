# sudo chmod +x generate_debug.sh
gcc -g -o ./build/debug_program ./src/*.c
gdb ./build/debug_program
run