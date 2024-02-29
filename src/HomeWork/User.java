package HomeWork;

public class User {
    private final String fio;
    private final String birthday;
    private final long number;
    private final char sex;

    public User(String fio, String birthday, long number, char sex) {
        this.fio = fio;
        this.birthday = birthday;
        this.number = number;
        this.sex = sex;
    }

    public String getInfo() {
        return String.format("%s %s %d %c", fio, birthday, number, sex);
    }
}
