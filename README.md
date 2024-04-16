# В данном репозитории размещены задачи на тему Exceptions. Задачи в пакете *practice*

:white_check_mark: 1) Написать программу, которая считывает два целых числа от пользователя и делит первое на второе. Если второе целое число равно нулю, перехватить возникающее исключение ArithmeticException и вывести сообщение об ошибке.
___
:white_check_mark: 2) Написать программу, которая считывает имя файла от пользователя и пытается открыть и прочитать содержимое файла. Если файл не существует или не может быть открыт, перехватить возникающее исключение FileNotFoundException и вывести сообщение об ошибке.
___
:white_check_mark: 3) Написать программу, которая считывает строку от пользователя и пытается преобразовать ее в целое число с помощью метода Integer.parseInt(). Если строка не может быть преобразована, перехватить возникающее исключение NumberFormatException и вывести сообщение об ошибке.
___
:white_check_mark: 4) Написать программу, которая считывает массив целых чисел от пользователя и вычисляет среднее значение чисел в массиве. Если пользователь вводит массив с нулевым количеством элементов, перехватить возникающее исключение ArrayIndexOutOfBoundsException и вывести сообщение об ошибке.
___
:white_check_mark: 5) Написать программу, которая считывает список строк от пользователя и пытается конвертировать каждую строку в число. Если какая-то строка не может быть преобразована в число, программа должна игнорировать эту строку и продолжать конвертировать оставшиеся строки. В конце работы программа должна вывести сумму всех сконвертированных чисел и количество строк, которые не были конвертированы.
___
:white_check_mark: 6) Написать программу, которая считывает две строки от пользователя и пытается выполнить математическую операцию с указанными значениями. Если операция не может быть выполнена из-за некорректных данных, программа должна выводить соответствующее сообщение об ошибке. Допустимые операции: "+", "-", "*", "/", "%".
___
:white_check_mark: 7) Написать программу, которая считывает массив целых чисел от пользователя и пытается найти все пары чисел, которые в сумме дают определенное значение. Если в массиве нет таких пар, программа должна вывести сообщение об ошибке.
___
:white_check_mark: 8) Написать программу, которая считывает список строк от пользователя и пытается выполнить определенные операции над каждой строкой. Возможные операции: "замена", "удаление", "добавление". Если некоторые операции не могут быть выполнены из-за некорректных данных или других ошибок, программа должна выводить соответствующее сообщение об ошибке и продолжать работу с оставшимися строками.
___
:white_check_mark: 9) Написать программу, которая считывает список имен из файла и пытается отсортировать их с помощью метода Collections.sort(). Если список содержит пустые значения, перехватить возникающее исключение NullPointerException и вывести сообщение об ошибке.
___
:white_check_mark: 10) Написать программу, которая считывает строку от пользователя и пытается преобразовать ее в число с плавающей запятой с помощью метода Double.parseDouble(). Если строка равна null или пустая, перехватить возникающее исключение NullPointerException или NumberFormatException и вывести сообщение об ошибке.
___
:white_check_mark: 11) Создайте программу, которая принимает ввод от пользователя его возраста. Если введенный возраст меньше 18 лет, программа должна генерировать исключение, указывающее на то, что пользователь слишком молод. Если введенный возраст больше 100 лет, программа должна генерировать исключение, указывающее на то, что возраст недопустим.
___
:white_check_mark: 12) Создайте программу, которая имитирует банковский счет. Если пользователь пытается снять больше денег, чем у него есть на счету, программа должна генерировать исключение, указывающее на то, что операция не может быть выполнена из-за недостаточных средств.
___
:white_check_mark: 13) Создайте программу, которая принимает ввод от пользователя URL-адреса. Если URL-адрес недействителен, программа должна генерировать исключение, указывающее на то, что URL-адрес недопустим.
___
:white_check_mark: 14) Создайте программу, которая принимает ввод от пользователя пути к файлу. Если путь к файлу недействителен, программа должна генерировать исключение, указывающее на то, что путь к файлу недопустим.
___
:white_check_mark: 15) Создать статический метод который принимет на вход три параметра: login,password, confirmPassword. Login должен содержать только латинские буквы, цифры и знак подчеркивания. Длина login должна быть меньше 20 символов. Если логин не соответствует этим требованиям, необходимо выбросить WrongLoginException. Password должен содержать только латинские бувы, цифры, знак подчеркивания. Длина password должна быть не меньше 20 символов.Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException. WrongPassword и WrongLoginException - пользовательские классы исключения с двумя конструкторами - один по умолчанию, второй принимает сообщние исключения и передает его в конструктор класса Exception. Обработка исключения проводится внутри метода. Используем multi-catch block. Метод возвращает true, если значения верны или false  другом случае.
___