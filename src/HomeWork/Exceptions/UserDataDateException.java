package HomeWork.Exceptions;

public class UserDataDateException extends IllegalArgumentException {
    public UserDataDateException() {
        super("Некорректно введена дата рождения. \n" +
                "Корректный формат: ДД.ММ.ГГГГ");
    }
}
