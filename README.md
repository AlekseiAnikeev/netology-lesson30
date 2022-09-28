![HTTP](https://cdn0.iconfinder.com/data/icons/digital-marketing-1-10/50/10-256.png)

# *HTTP*

# Задача 1 (обязательная)

[По адресу](https://raw.githubusercontent.com/netology-code/jd-homeworks/master/http/task1/cats)
находится список фактов о кошках. Наша задача - сделать запрос
к этому ресурсу и отфильтровать факты, за которые никто
не проголосовал (поле upvotes). Формат каждой записи следующий:

```java 
{
"id": "5b4910ae0508220014ccfe91",
"text": "Кошки могуть создавать более 100 разных звуков, тогда как собаки только около 10.",
"type": "cat",
"user": "Alex Petrov",
"upvotes": null
}
```

id - уникальный идентификатор записи

text - сообщение

type - тип животного

user - имя пользователя

upvotes - голоса

Программа должна прочитать весь список и вернуть только те факты, у которых поле upvotes не равно null или нулю.

Создайте класс, в который будем преобразовывать json ответ от сервера. Преобразуйте json в список java объектов.
Отфильтруйте список - например, средствами stream api. Выведите результат на экран.

## Описание

Данная версия программы организует запрос к серверу, преобразует полученные 
сведения в список и фильтрует его.

## Принцип работы на данном этапе:

- Создает запрос по url
- получает данные
- преобразует в список
- фильтрует
- выводит список на экран