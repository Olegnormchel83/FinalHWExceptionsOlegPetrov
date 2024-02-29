package HomeWork.Exceptions;

public class UserDataNumberException extends NumberFormatException {
    public UserDataNumberException() {
        super("Номер телефона должен содержать 10 символов.\n" +
                "Пример: 9991112233");
    }
}
