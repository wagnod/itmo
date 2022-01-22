# Лабораторная работа №3. Использование автоматических генераторов анализаторов Bison и ANTLR

## Введение

Цель данной лабораторной работы — научиться пользоваться автоматическими генераторами анализаторов Bison и ANTLR. Форма
отчетности: программа и текстовый отчет. Средство автоматической генерации вы можете выбрать самостоятельно.
Рекомендуемые источники:
[Bison](http://www.gnu.org/software/bison)
[ANTLR](http://www.antlr.org)

# Вариант 5. Идеальное форматирование

Выберите подмножества языка C++, Java или Kotlin и напишите преобразование программы на заданном подмножестве этого
языка в идеально отформатированную программу. Для Java следует использовать Java Coding Conventions. Для C++ вы можете
выбрать способ форматирования на свое усмотрение, например Google C++ Style Guide. Для Kotlin можете выбрать разумный
аналог. Пример:

```cpp
int
    main( )
{
    printf( "Hello world"
    )
; return 0
;}
```

Вывод:

```cpp
int main() {
    printf("Hello world");
    return 0;
}
```