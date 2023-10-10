package seminars.third.tdd;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    @Test
    public void isUnlogined() {
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(new User("User1", "123", false, true));
        for (User user : userRepository.data) {
            userRepository.unloginUser(user);
            assertTrue(user.isAuthenticated);
        }
    }
}