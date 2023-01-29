package dn.rubtsov.demo;

import dn.rubtsov.demo.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    String expectedLogin;
    String expectedEmail;
    User user;

    @BeforeEach
    public void setUp() {
    expectedLogin = "123456";
    expectedEmail = "123456@mail.ru";
    user = new User("123456", "123456@mail.ru");
    //user = new User("123456", "123456mail.ru");
    //user = new User("123456", "123456");
    }

    @Test
    @DisplayName("Тест создания объекта User с передачей в него 2 параметров.")
    public void isCreatUser2P() { // параметры передаются ч/з setUp().
        assertEquals(expectedLogin, user.getLogin(),"Логин не установился.");
        assertEquals(expectedEmail, user.getEmail(), "Email не установился.");
    }

    @Test
    @DisplayName("Тест создания объекта User без передачи в него параметров.")
    public void isCreatUser0P() {
        assertEquals("123456", user.getLogin(),"Логин не установился.");
        assertEquals("123456@mail.ru", user.getEmail(),"Email не установился.");
    }

    @Test
    @DisplayName("Тест на наличие в email символов: @ и точка.")
    public void isCorrectEmail () {
        assertTrue((user.getEmail().contains("@") && user.getEmail().contains(".")), "Некорректный email.");
    }

    @Test
    @DisplayName("Тест на совпадение логина и email.")
    public void isNotEquals() {
        assertNotEquals(user.getLogin(), user.getEmail(),"Логин и email не должны быть равны." );
    }


}
