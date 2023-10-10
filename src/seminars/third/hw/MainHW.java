package seminars.third.hw;

import seminars.third.tdd.User;
import seminars.third.tdd.UserRepository;

public class MainHW {

    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    public static boolean evenOddNumber(int n) {
        return n % 2 == 0;
    }


    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет
    public static boolean numberInInterval(int n) {
        return n >= 25 && n <= 100;
    }
    // покрыть тестами метод на 100%



    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(new User("User1", "123", true, false));
        userRepository.addUser(new User("User2", "1234", true, true));
        userRepository.addUser(new User("User3", "12345", true ,false));
        userRepository.addUser(new User("User4", "123456", false, true));

        // print all users from userRepository
        for (User user : userRepository.data) {
            System.out.println(user.name + " " + user.password + ", Admin: " + user.isAdmin + ", Authenticated: " + user.isAuthenticated);
        }

        for (User user : userRepository.data) {
            userRepository.unloginUser(user);
        }

        for (User user : userRepository.data) {
            System.out.println(user.name + " " + user.password + ", Admin: " + user.isAdmin + ", Authenticated: " + user.isAuthenticated);
        }

    }

}
