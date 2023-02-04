package dn.rubtsov.demo;

import dn.rubtsov.demo.model.UserGreater;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class UserGreaterTest {
    UserGreater userGreater = new UserGreater();

    @Test
    @DisplayName("Когда имя Вася передастся в greateruser, тогда он вернёт коректное Hello.")
    public void correctNameTest() {
        String actual = userGreater.greaterUser("Вася");
        Assertions.assertEquals("Hello, Вася", actual, "Приветствия не совпадают.");
    }
    @Test
    @DisplayName("Когда имя null,тогда вернётся Hello, Anonymous")
    public void nullNameTest() {
        String actual = userGreater.greaterUser(null);
        Assertions.assertEquals("Hello, Anonymous", actual, "Приветствия не совпадают.");
    }
    @Test
    @DisplayName("Когда имя пустое,тогда вернётся Hello, Anonymous")
    public void emptyNameTest() {
        String actual = userGreater.greaterUser(" ");
        Assertions.assertEquals("Hello, Anonymous", actual, "Приветствия не совпадают.");
    }
    @Test
    @DisplayName("Когда Привет передастся в greateruser, тогда он вернёт коректное: Привет, Вася.")
    public void spetiolHelloTest() {
        UserGreater userGreater = new UserGreater("Привет");
        String actual = userGreater.greaterUser("Вася");
        Assertions.assertEquals("Привет, Вася", actual, "Приветствия не совпадают.");
    }
    @Test
    @DisplayName("Когда Hello передастся в greateruser, тогда счетчик прибавляет 1.")
    public void helloCounterTest() {
        this.userGreater.greaterUser(" ");
        int actual = userGreater.getHelloCounter();
        Assertions.assertEquals(1, actual, "Приветствия не совпадают.");
    }

}
