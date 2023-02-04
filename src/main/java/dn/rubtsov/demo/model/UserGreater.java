package dn.rubtsov.demo.model;

public class UserGreater {
    private int helloCounter = 0;
    private final String helloString;
// Что бы не нарушать обратную совместимость создадим 2 конструктора:
    public UserGreater() {
        this("Hello"); //по умолчанию
    }
    public UserGreater(String helloString) {
        this.helloString = helloString;
    }

    public String greaterUser (String userName) {
        if (userName == null || userName.isBlank()) {
            userName = "Anonymous";
        }
        this.helloCounter++;
        return this.helloString + ", " + userName;
    }

    public int getHelloCounter() {
        return helloCounter;
    }
}
