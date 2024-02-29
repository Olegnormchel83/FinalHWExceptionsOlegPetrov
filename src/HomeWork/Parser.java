package HomeWork;

import HomeWork.Exceptions.UserDataDateException;
import HomeWork.Exceptions.UserDataNumberException;
import HomeWork.Exceptions.UserDataSexException;
import HomeWork.Exceptions.UserDataSizeException;

public class Parser implements IParser {
    @Override
    public String userParse(User user) {
        String userInfo = user.getInfo();
        String[] userParsed = userInfo.split(" ");

        if (userParsed.length != 6) {
            throw new UserDataSizeException();
        }

        if (userParsed[3].charAt(2) != '.' || userParsed[3].charAt(5) != '.') {
            throw new UserDataDateException();
        }

        if (!checkPhoneNumber(Long.parseLong(userParsed[4]))) {
            throw new UserDataNumberException();
        }

        if (userParsed[5].charAt(0) != 'm') {
            if (userParsed[5].charAt(0) != 'f') {
                throw new UserDataSexException();
            }
        }

        return String.format("<%s> <%s> <%s> <%s> <%s> <%s>",
                            userParsed[0],
                            userParsed[1],
                            userParsed[2],
                            userParsed[3],
                            userParsed[4],
                            userParsed[5]);
    }

    private boolean checkPhoneNumber(long number) {
        int countNumbers = 0;

        while (number != 0) {
            number /= 10;
            countNumbers++;
        }

        return countNumbers == 10;
    }
}