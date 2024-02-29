package HomeWork.Exceptions;

public class UserDataSexException extends IllegalArgumentException {
    public UserDataSexException() {
        super("Некорректно введен пол.\n" +
                "Пол обозначается символами f (female) или m (male).");
    }
}
