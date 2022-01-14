# Лабораторная работа №2. Ручное построение нисходящих синтаксических анализаторов

## Введение

Цель данной лабораторной работы — научиться разрабатывать грамматики для заданных неформально языков с учетом
семантического смысла и приоритета операторов, разрабатывать лексические анализаторы, разрабатывать вручную нисходящие
синтаксические анализаторы, разрабатывать подробные тестовые наборы для анализаторов. Форма отчетности: программа и
текстовый отчет. Программа может быть написана на любом языке программирования общего назначения.

# Вариант 8. Описание лямбда функции в Python

Описание лямбда функции в Python. Описание начинается ключевым словом `lambda`, далее идет множество аргументов через
запятую, двоеточие, выражение. Используйте логические и/или арифметические операции. Используйте один терминал для всех
имен переменных. Используйте один терминал для ключевых слов `lambda` и т. п. (не несколько ‘l’, ‘a’, ‘m’ и т. д.).
Пример: `lambda n : n + 2`

## 1. Разработка грамматики
В данной грамматике не представлены арифметические операции.
```
S -> lambda PARAM : S'

PARAM  -> `String` PARAM' | ε
PARAM' -> , PARAM | ε

S' -> OR

OR  -> AND OR'
OR' -> or OR | ε

AND  -> NOT AND'
AND' -> and AND | ε

NOT  -> not EQ | EQ

EQ  -> CONST EQ'
EQ' -> == EQ | ε

CONST  -> `String` | `Number` | True | False | (S')
```

|Нетерминал|Описание|
|---------|---------|
|S|lambda-функция в Python|
|S'|либо S, либо выражение|
|PARAM|список параметров|
|OR|или|
|AND|и|
|NOT|не|
|EQ|равенство|
|CONST|константное выражение, переменная или число|
|EOL|конец строки|

## 2. Построение лексического анализатора

|Терминал|Токен|
|---------|---------|
|and|AND|
|or|OR|
|not|NOT|
|==|EQ|
|lambda|LAMBDA|
|:|SEMICOLON|
|,|COMMA|
|(|LPAREN|
|)|RPAREN|
|$|EOL|

[Реализация лексического анализатора](https://github.com/wagnod/itmo/blob/master/MT/TopDownParser/src/main/java/LexicalAnalyzer.kt)

## 3. Построение синтаксического анализатора

|Нетерминал| FIRST| FOLLOW|
|----------|------|-------|
|S|	lambda |	), EOL|
|PARAM|	`String`, `ε`	|:|
|PARAM'|`,`, `ε`	|:|
|S'|	lambda, `String`, `not`, `Number`, True, False, (	|), EOL|
|OR|	`String`, not, `Number`, True, False, (	|), EOL|
|OR'|	or, ε	|), EOL|
|AND|	`String`, not, `Number`, True, False, (	|or, ), EOL|
|AND'|	and, ε	|or, ), EOL|
|NOT|	`String`, not, `Number`, True, False, (	|or, and, ), EOL|
|EQ|	`String`, `Number`, True, False, (	|or, and, ), EOL|
|EQ'|	==, ε	|or, and, ), EOL|
|CONST|	`String`, `Number`, True, False, (	|or, and, ==, ), EOL|

[Парсер](https://github.com/wagnod/itmo/blob/master/MT/TopDownParser/src/main/java/Parser.kt)

## 4. Визуализация дерева разбора
Дерево разбора реализовано с помощью [GraphViz](https://github.com/nidi3/graphviz-java)
В данном дереве для каждого токена существует не больше одной вершины (если токен повторяется в выражении несколько раз,
новая вершина создаваться не будет). Зеленым цветом выделены вершины терминалов.

Дерево разбора для выражения `lambda n : n and true`

<img src="https://github.com/wagnod/itmo/blob/master/MT/TopDownParser/example/tree.png" width="40%" />

## 5. Тесты
[Тесты реализованы с помощью JUnit.](https://github.com/wagnod/itmo/blob/master/MT/TopDownParser/src/test/java/ParserTest.kt)
