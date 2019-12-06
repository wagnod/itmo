char* resize(const char* string, int size, int newSize)
{
    char* newString = new char[newSize];
    for (int i = 0; i < size; ++i) {
        newString[i] = string[i];
    }
    delete[] string;
    return newString;
}