Использование уведомлений Notification.  Создание собственной разметки для Notification

Требования:

 - На главной активности находятся 3 кнопки и 1 EditText
 - В классе определены 3 целые константы – идентификаторы уведомлений (Notification).  
По первым двум кнопкам отправляются уведомления, которым соответствуют две разные константы. 
У этих двух уведомлений – одинаковые иконки и они используют одинаковые разметки как для сообщения, так для открываемой активности.
Для отправления этих двух уведомлений можно использовать один и тот же метод showNotification(int id, String text), вызываемый с разными параметрами.
Кроме id уведомления этому методу в качестве параметра передается текст сообщения.  
Текст сообщения взять из EditText.
 - По третьей кнопке должно передаваться 3-е уведомление, для которого используются другие иконки, 
другая разметка для сообщения и другая открываемая активность,
соответственно для отправки уведомления понадобится другой метод, аналогичный showNotification.
