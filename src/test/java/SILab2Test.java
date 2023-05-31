import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyBranchTest1() {
        List<User> users = new ArrayList<>();
        User user = null;
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user, users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    }

    @Test
    void everyBranchTest2() {
        List<User> users = new ArrayList<>();
        User user = new User(null, "12345", "LukaIndovski");
        assertFalse(SILab2.function(user, users));
    }

    @Test
    void everyBranchTest3() {
        List<User> users = new ArrayList<>();
        User user = new User ("Indo", "513245123", "luka.indovski@students.finki.ukim.mk");
        User user1 = new User ("Indovski", "2432431", "luka.indovski@students.finki.ukim.mk");
        User user2 = new User ("Luka", "1345", "luka.indovski@students.finki.ukim.mk");
        User user3 = new User ("LukaIndo", "55622321", "luka.indovski@students.finki.ukim.mk");
        users.add(user1);
        users.add(user2);
        users.add(user3);

        assertFalse(SILab2.function(user, users));
    }

    @Test
    void everyBranchTest4() {
        List<User> users = new ArrayList<>();

        User user = new User ("luka", "luka", "LukaIndovski");

        assertFalse (SILab2.function(user, users));
    }

    @Test
    void everyBranchTest5() {
        List<User> users = new ArrayList<>();

        User user = new User (null, "luka", "luka.indovski@students.finki.ukim.mk");

        assertFalse (SILab2.function(user, users));
    }
}
