### Урок 1

**Try-with-resources** - это один из нескольких try в Java, 
призванный освободить разработчиков от обязанности освобождать ресурсы, 
используемые в блоке try. Первоначально он был представлен в Java 7, 
и вся идея заключалась в том, 
что разработчику не нужно беспокоиться об управлении ресурсами для 
ресурсов, которые они используют только в одном блоке try-catch-finally.

[Заявление try-with-resources в Java](https://rukovodstvo.net/posts/id_1114/#:~:text=Try-with-resources%20-%20это%20один%20из,только%20в%20одном%20блоке%20try-catch-finally "Обработка исключений")    
[Оператор try with resources - javarush](https://javarush.com/quests/lectures/questsyntaxpro.level15.lecture00 "Оператор try with resources")   
[Исключения (Exception): checked, unchecked и свои собственные](https://javarush.com/groups/posts/1944-iskljuchenija-checked-unchecked-i-svoi-sobstvennihe)

В Try-with-resources используются только экземпляры классов которые наследуются от интерфейса AutoClosable

---

### Урок 2

