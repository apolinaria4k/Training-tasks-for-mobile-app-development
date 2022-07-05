Работа со списком

Цель работы:
•	Знакомство с элементом <ListView>
•	Знакомство со стандартным адаптером
•	Блокировка кнопок

Требования:
  
Внешний вид активности: 
  
•	розоватым цветом выделен элемент ListView, предназначенный для вывода элементов списка.
•	синеватым цветом выделен элемент EditText
•	в нижнем ряду – 4 кнопки
  
  ![image](https://user-images.githubusercontent.com/91782001/177372536-375b5948-a41c-4907-a493-ac5cc9f0d830.png)

•	при щелчке по Add строка из EditText должна добавиться в ListView
•	при щелчке по пункту списка этот пункт должен подкрашиваться другим цветом (меняем цвет фона), 
  если при этом ранее какой-то другой пункт списка был выбран и выделен цветом, для этого пункта восстанавливается первоначальный цвет
•	при щелчке по пункту списка соответствующая строка должна скопироваться в EditText, 
  где ее можно будет впоследствии редактировать
•	при щелчке по Edit находящаяся в EditText отредактированная строка замещает текущий элемент списка, 
  если такой имеется (текущий элемент списка – это выделенный цветом элемент, по которому ранее щелкали).
•	при щелчке по Del текущий элемент списка (если он имеется) удаляется
•	при щелчке по Clear список очищается
  
  ![image](https://user-images.githubusercontent.com/91782001/177372627-f51e477c-dd49-468f-8e12-a91962948670.png)

