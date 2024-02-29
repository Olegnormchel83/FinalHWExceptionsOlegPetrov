package HomeWork.Exceptions;

public class UserDataSizeException extends ArrayIndexOutOfBoundsException {
    public UserDataSizeException() {
        super("Информация о пользователе должна содержать 6 значений, введенных через пробел. \n" +
                "Фамилия Имя Отчество ДатаРождения НомерТелефона Пол");
    }
}
