package HomeWork;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private final Parser parser;
    private FileWriter fw;


    public Writer() {
        parser = new Parser();
    }

    public void writeToFile(User user) throws IOException {
        boolean findError = false;
        try {
            parser.userParse(user);
        } catch (Exception e) {
            System.err.println("Пользователь: " + user.getInfo());
            parser.userParse(user);
            findError = true;
        }

        if (!findError) {
            fw = new FileWriter("src/HomeWork/Users/" + getUserSurname(user) + ".txt", true);
            fw.write(parser.userParse(user) + "\n");
            fw.close();
        }
    }

    private String getUserSurname(User user) {
        String userInfo = user.getInfo();
        String[] userParsed = userInfo.split(" ");
        return userParsed[0];
    }
}
