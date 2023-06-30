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

Error - гарантированно роняют Java машину и потребуется только перезапуск приложения.

Exception - наследник всех исключений, который мы можем обработать.

Проверяемые(Checked) - исключения которые необходимо обработать 
принудительно еще на этапе компиляции проекта. Если их не обработать
код не скомпилируется.

Не проверяемые(Unchecked) - RuntimeException исключения 
которые необязательно перехватывать. Они не должны возникать в идеале,
в системе которая правильно написана.

Порядок обработки Exception - сначала обрабатываются самые узкие, 
потом самые общие.

[Поймать множественные исключения в Java](https://www.delftstack.com/ru/howto/java/java-catch-multiple-exceptions/)     
[Исключения в Java: catch под лупой. Часть 3](https://skillbox.ru/media/base/isklyucheniya-v-java-catch-pod-lupoy-chast-3/)

ClassCastException - Unchecked: класс RuntimeException  
StackOverflowError - Error  
IOError - Error  
IOException - Checked: класс Exception  
NullPointerException - Unchecked: класс RuntimeException  
ConcurrentModificationException - Unchecked: класс RuntimeException
illegalArgumentException - Unchecked: класс RuntimeException  
EOFException - Checked: класс Exception  
ClassNotFoundException - Checked: класс Exception    
ThreadDeath </aside> - Error

[ThreadDeath error](https://runebook.dev/ru/docs/openjdk/java.base/java/lang/threaddeath)

---

### Урок 3

#### Блок try-with-resources:

Можно использовать без блока catch исключительно, 
для того чтобы освободить занятые ресурсы.

#### Обработка исключений на уровне выше по стеку

Пример:  

public void save() throws IOException

**throws** - ключевое слово, используется на уровне метода.  
И перечисляет те обрабатываемые(checked) исключения,
которые могут быть выброшены за пределы данного метода.

#### Собственные типы исключений  