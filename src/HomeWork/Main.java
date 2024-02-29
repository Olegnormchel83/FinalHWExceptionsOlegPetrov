package HomeWork;

import java.io.IOException;

public class Main {
    static Parser parser;
    static Writer writer;
    static UserInput userInput;
    static User misha;
    static User oleg;
    static User zhenya;
    static User liza;
    static User incorrectNamePavel;
    static User incorrectBirthdayDiana;
    static User incorrectPhoneNumberPolina;
    static User incorrectSexAlexey;

    public static void main(String[] args) throws IOException { //todo : Допилить filewriter
        init();

        User somebody = userInput.activate();
        writer.writeToFile(somebody);

        /*
        Проверка записи в файл заранее заготовленными корректными пользователями
        writer.writeToFile(oleg);
        writer.writeToFile(misha);
        writer.writeToFile(zhenya);
        writer.writeToFile(liza);

        Проверка обработок исключений
        //System.out.println(parser.userParse(incorrectNamePavel));
        //System.out.println(parser.userParse(incorrectBirthdayDiana));
        //System.out.println(incorrectPhoneNumberPolina);
        //System.out.println(parser.userParse(incorrectSexAlexey));
         */
    }

    private static void init() {
        parser = new Parser();
        writer = new Writer();
        userInput = new UserInput();
        misha = new User("Петров Михаил Павлович",
                                "13.10.2000",
                                9991234567L,
                                'm');
        oleg = new User("Петров Олег Вячеславович",
                "13.06.2000",
                9639648180L,
                'm');

        zhenya = new User("Овчинников Евгений Германович",
                            "25.05.1999",
                            9639639663L,
                            'm');
        liza = new User("Карпова Елизавета Павловна",
                            "14.12.2001",
                            9102978612L,
                            'f');

        incorrectNamePavel = new User("СухановПавел Николаевич",
                                        "11.09.2001",
                                        1234567890L,
                                        'm');

        incorrectBirthdayDiana = new User("Яковлева Диана Ринатовна",
                                            "27.4.2001",
                                            9191231123L,
                                            'f');

        incorrectPhoneNumberPolina = new User("Воленская Полина Игоревна",
                                                "11.11.2011",
                                                8-963-964-45-25L,
                                                    'f');

        incorrectSexAlexey = new User("Шевляков Алексей Романович",
                                        "01.04.1999",
                                        9109109010L,
                                        '1');
    }
}
