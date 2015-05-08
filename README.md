Тесты к курсу «Парадигмы программирования»
====

[Условия домашних заданий](http://www.kgeorgiy.info/courses/java-intro/homeworks.html)

Домашнее задание 12. Выражения на Clojure
---
 * *Базовая*
    * Код должен находиться в файле `expression.clj`.
    * [Исходный код тестов](clojure/test/ClojureFunctionExpressionTest.java)
        * Запускать c аргументом `easy` или `hard`

Исходный код к лекции по Clojure
----
* [Скрипт с примерами](clojure/script.clj)
    * [Введение](clojure/examples/intro.clj)
    * [Функции](clojure/examples/functions.clj)
    * [Списки](clojure/examples/lists.clj)
    * [Отображения](clojure/examples/maps.clj)
    * [Разбор](clojure/examples/read.clj)
    * [Функции высшего порядка](clojure/examples/functions-2.clj)
    * [Операции над векторам и матрицами](clojure/examples/vector-operations.clj)
* Запуск из консоли [под Windows](clojure/RunClojure.cmd), 
    [под *nix](clojure/RunClojure.sh)

            RunClojure script.clj


Домашнее задание 11. Обработка ошибок на JavaScript
---
 * *Модификация*. Дополнительное реализовать поддержку:
    * унарных операций:
        * `Exp` (`exp`) — экспонента, `(exp 0)` равно 1;
        * `ArcTan` (`atan`) — арктангенс, `(atan 0)` равно 0;
    * [Исходный код тестов](javascript/test/ModifiedPrefixParserTest.java)
        * Запускать c аргументом `easy` или `hard`
 * *Базовая*
    * Код должен находиться в файле `objectExpression.js`.
    * [Исходный код тестов](javascript/test/PrefixParserTest.java)
        * Запускать c аргументом `easy` или `hard`

Домашнее задание 10. Объектные выражения на JavaScript
---
 * *Модификация*. Дополнительное реализовать поддержку:
    * унарных операций:
        * `Sin` (`sin`) — синус, `4846147 sin` примерно равно 1;
        * `Cos` (`cos`) — косинус, `5419351 cos` примерно равно 1;
    * [Исходный код тестов](javascript/test/ModifiedObjectExpressionTest.java)
        * Запускать c аргументом `easy`, `hard` или `bonus`
 * *Базовая*
    * Код должен находиться в файле `objectExpression.js`.
    * [Исходный код тестов](javascript/test/ObjectExpressionTest.java)
        * Запускать c аргументом `easy`, `hard` или `bonus`

Домашнее задание 9. Функциональные выражения на JavaScript
---
 * *Модификация*. Дополнительное реализовать поддержку:
    * унарных операций:
        * `abs` — абсолютная величина числа, `-5 abs` равно 5;
        * `log` — натуральный логарифм, `5 log` примерно равно 1.6;
    * бинарных операций:
        * `mod` (`%`) — взятие по модулю, `5 2 %` равно 1;
        * `power` (`**`) — взятие по модулю, `5 2 **` равно 25.
    * [Исходный код тестов](javascript/test/ModifiedExpressionTest.java)
        * Запускать c аргументом `hard` или `easy`
 * *Базовая*
    * Код должен находиться в файле `expression.js`.
    * [Исходный код тестов](javascript/test/ExpressionTest.java)
        * Запускать c аргументом `hard` или `easy`
        * Решение должно называться `expression.js`

Исходный код к лекции по JavaScript
----
* [Скрипт с примерами](javascript/script.js)
* [Запуск в браузере](javascript/RunJS.html)
* [Запуск из консоли](javascript/RunJS.java) (на Java)
* [Запуск из консоли](javascript/RunJS.js) (на node.js)

Домашнее задание 8. Вычисление в различных типах
---
 * *Простая*
    * Дополнительно реализовать унарные операции:
        * `abs` — модуль числа, `abs -5` равно 5;
        * `square` — возведенеи в квадрат, `square 5` равно 25.
    * Дополнительно реализовать бинарную операцию (максимальный приоритет):
        * `mod` — взятие по модулю, приоритет как у умножения (`1 + 5 mod 3` равно `1 + (5 mod 3)` равно `3`).
    * [Исходный код тестов](java/expression/generic/GenericEasyTest.java)
 * *Усложненная*
    * Реализовать операции из простого варианта.
    * Дополнительно реализовать поддержку режимов:
        * `u` — вычисления в `int` без проверки на переполнение;
        * `b` — вычисления в `byte` без проверки на переполнение;
        * `f` — вычисления в `float` без проверки на переполнение.
    * [Исходный код тестов](java/expression/generic/GenericHardTest.java)
 * *Базовая*
    * Класс `GenericTabulator` должен реализовывать интерфейс 
      [Tabulator](java/expression/generic/Tabulator.java) и
      сроить трехмерную таблицу значений заданного выражения.
        * `mode` — режим вычислений:
           * `i` — вычисления в `int` с проверкой на переполнение;
           * `d` — вычисления в `double` без проверки на переполнение;
           * `bi` — вычисления в `BigInteger`.
        * `expression` — выражение, для которого надо построить таблицу;
        * `x1`, `x2` — минимальное и максимальное значения переменной `x` (включительно)
        * `y1`, `y2`, `z1`, `z2` — аналогично для `y` и `z`.
        * Результат: элемент `result[i][j][k]` должен содержать
          значение выражения для `x = x1 + i`, `y = y1 + j`, `z = z1 + k`.
          Если значение не определено (например, по причине переполнения),
          то соответствующий элемент должен быть равен `null`.
    * [Исходный код тестов](java/expression/generic/GenericTest.java)


Домашнее задание 7. Обработка ошибок
---
 * *Простая*
    * Дополнительно реализовать унарные операции:
        * `abs` — модуль числа, `abs -5` равно 5;
        * `sqrt` — квадратный корень, `sqrt 25` равно 5.
    * [Исходный код тестов](java/expression/exceptions/ExceptionsEasyTest.java)
 * *Усложненная*
    * Реализовать операции из простого варианта.
    * Дополнительно реализовать бинарные операции (максимальный приоритет):
        * `**` — возведение в степень, `2 ** 3` равно 8;
        * `//` — логарифм, `8 // 2` равно 3.
    * [Исходный код тестов](java/expression/exceptions/ExceptionsHardTest.java)
 * *Базовая*
    * Класс `CheckedParser` должен реализовывать интерфейс 
        [Parser](java/expression/Parser.java)
    * Классы `CheckedAdd`, `CheckedSubtract`, `CheckedMultiply`, 
        `CheckedDivide` и `CheckedNegate` должны реализовывать интерфейс 
        [TripleExpression](java/expression/TripleExpression.java)
    * Нельзя использовать типы `long` и `double`
    * Нельзя использовать методы классов `Math` и `StrictMath`
    * [Исходный код тестов](java/expression/exceptions/ExceptionsTest.java)


Домашнее задание 6. Разбор выражений
---
 * *Простая*
    * Дополнительно реализовать бинарные операции:
        * `mod` — взятие по модулю, приоритет как у умножения (`1 + 5 mod 3` равно `1 + (5 mod 3)` равно `3`);
        * `<<` — сдвиг влево, минимальный приоритет (`1 << 5 + 3` равно `1 << (5 + 3)` равно 256);
        * `>>` — сдвиг вправо, минимальный приоритет (`1024 >> 5 + 3` равно `1024 >> (5 + 3)` равно 4);
    * [Исходный код тестов](java/expression/ParserEasyTest.java)
 * *Усложненная*
    * Реализовать операции из простого варианта.
    * Дополнительно реализовать унарные операции (приоритет как у унарного минуса):
        * `abs` — модуль числа, `abs -5` равно 5;
        * `square` — возведение в квадрат, `square -5` равно 25.
    * [Исходный код тестов](java/expression/ParserHardTest.java)
 * *Базовая*
    * Реализовать интерфейс [Parser](java/expression/Parser.java)
    * [Исходный код тестов](java/expression/ParserTest.java)


Домашнее задание 5. Вычисление выражений
---
 * *Простая*
    * Реализовать интерфейс [DoubleExpression](java/expression/DoubleExpression.java)
    * [Исходный код тестов](java/expression/DoubleExpressionTest.java)
 * *Усложненная*
    * Реализовать интерфейс [TripleExpression](java/expression/TripleExpression.java)
    * [Исходный код тестов](java/expression/TripleExpressionTest.java)
 * *Базовая*
    * Реализовать интерфейс [Expression](java/expression/Expression.java)
    * [Исходный код тестов](java/expression/ExpressionTest.java)

Домашнее задание 4. Очередь на связном списке
---
 * *Простая*
    * Добавить в интерфейс очереди и реализовать метод
      `toArray`, возвращающий массив,
      содержащий элементы, лежащие в очереди в порядке
      от головы к хвосту
    * Исходная очередь должна остаться неизменной
    * Дублирования кода быть не должно
    * [Исходный код тестов](java/QueueToArrayTest.java)
    * [Откомпилированные тесты](artifacts/QueueToArrayTest.jar)
 * *Усложненная*
    * Добавить в интерфейс очереди и реализовать методы
        * `filter(predicate)` – создать очередь, содержащую элементы, удовлетворяющие 
            [предикату](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)
        * `map(function)` – создать очередь, содержащую результаты применения 
            [функции](https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html)
    * Исходная очередь должна остаться неизменной
    * Тип возвращаемой очереди должен соответствовать типу исходной очереди
    * Взаимный порядок элементов должен сохраняться
    * Дублирования кода быть не должно
    * [Исходный код тестов](java/FQueueTest.java)
    * [Откомпилированные тесты](artifacts/FQueueTest.jar)
 * *Базовая*
    * [Исходный код тестов](java/QueueTest.java)
    * [Откомпилированные тесты](artifacts/QueueTest.jar)

Домашнее задание 3. Очередь на массиве
---
Модификации
 * *Простая*
    * Реализовать метод `toArray`, возвращающий массив,
      содержащий элементы, лежащие в очереди в порядке
      от головы к хвосту.
    * [Исходный код тестов](java/ArrayQueueToArrayTest.java)
    * [Откомпилированные тесты](artifacts/ArrayQueueToArrayTest.jar)
 * *Усложненная*
    * Реализовать методы
        * `push` – добавить элемент в начало очереди
        * `peek` – вернуть последний элемент в очереди
        * `remove` – удалить последний элемент из очереди 
    * [Исходный код тестов](java/ArrayQueueDequeTest.java)
    * [Откомпилированные тесты](artifacts/ArrayQueueDequeTest.jar)
 * *Базовая*
    * [Исходный код тестов](java/ArrayQueueTest.java)
    * [Откомпилированные тесты](artifacts/ArrayQueueTest.jar)

Домашнее задание 2. Бинарный поиск
----
Модификации
 * *Простая*
    * Если в массиве `a` отсутствует элемент, равный `x`, то требуется
      вывести индекс вставки в формате, определенном в 
      [`Arrays.binarySearch`](http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#binarySearch-int:A-int-).
    * Класс должен иметь имя `BinarySearchMissing`
    * [Исходный код тестов](java/BinarySearchMissingTest.java)
    * [Откомпилированные тесты](artifacts/BinarySearchMissingTest.jar)
 * *Усложненная*
    * Требуется вывести два числа: начало и длину диапазона элементов,
      равных `x`. Если таких элементов нет, то следует вывести
      пустой диапазон, у которого левая граница совпадает с местом
      вставки элемента `x`.
    * Не допускается использование типов `long` и `BigInteger`.
    * Класс должен иметь имя `BinarySearchSpan`
    * [Исходный код тестов](java/BinarySearchSpanTest.java)
    * [Откомпилированные тесты](artifacts/BinarySearchSpanTest.jar)
 * *Базовая*
    * [Исходный код тестов](java/BinarySearchTest.java)
    * [Откомпилированные тесты](artifacts/BinarySearchTest.jar)

Домашнее задание 1. Сумма чисел
----

Модификации
 * *Простая*
    * Входные данные помещаются в тип `long`
    * Класс должен иметь имя `SumLong`
    * [Исходный код тестов](java/SumLongTest.java)
    * [Откомпилированные тесты](artifacts/SumLongTest.jar)
 * *Усложненная*
    * Входные данные помещаются в тип `long`
    * На вход подаются десятичные и шестнадцатеричные числа
    * Шестнадцатеричные числа имеют префикс `0x`
    * Ввод регистронезависим
    * Класс должен иметь имя `SumLongHex`
    * [Исходный код тестов](java/SumLongHexTest.java)
    * [Откомпилированные тесты](artifacts/SumLongHexTest.jar)

Для того, чтобы протестировать исходную программу:

 1. Скачайте тесты ([SumTest.jar](artifacts/SumTest.jar))
 * Откомпилируйте `Sum.java`
 * Проверьте, что создался `Sum.class`
 * В каталоге, в котором находится `Sum.class` выполните команду 
    ```
       java -jar <путь к SumTest.jar>
    ```
	* Например, если `SumTest.jar` находится в текущем каталоге, выполните команду 
    ```
    	java -jar SumTest.jar
	```
    
Исходный код тестов: 

* [SumTest.java](java/SumTest.java), 
* [SumChecker.java](java/SumChecker.java)
