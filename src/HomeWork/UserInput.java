package HomeWork;

import HomeWork.Exceptions.UserDataSizeException;

import java.util.Scanner;

public class UserInput {
    public UserInput() {
    }

    public User activate() {
        Scanner scanner = new Scanner(System.in);
        boolean findError = false;
        Parser parser = new Parser();

        System.out.println("Введите данные пользователя (Фамилия Имя Отчество Дата_Рождения Телефон Пол) через пробел как в пример ниже: \n" +
                "Иванов Иван Иванович 01.01.1900 9091234556 m/f");

        String userInfo = scanner.nextLine();
        scanner.close();
        String[] userParsed = userInfo.split(" ");

        if (userParsed.length != 6) {
            throw new UserDataSizeException();
        }

        long userNumber = Long.parseLong(userParsed[4]);
        char userSex = userParsed[5].charAt(0);

        User enterUser = new User(userParsed[0] + " " + userParsed[1] + " " + userParsed[2],
                userParsed[3], userNumber, userSex);

        try {
            parser.userParse(enterUser);
        } catch (Exception e) {
            parser.userParse(enterUser);
        }


        return new User(userParsed[0] + " " + userParsed[1] + " " + userParsed[2],
                userParsed[3], userNumber, userSex);
    }
}
