package dn.rubtsov.demo.model;

import dn.rubtsov.demo.exception.DivisionByZeroException;

public class Calculator {

    public int sum(int x, int y){
        return x + y;
    }
    public int diff(int x, int y){
        return x - y;
    }
    public int multiply(int x, int y) {
        return x * y;
    }
    public int divide(int x, int y){ // 1.31.45 видео Вебинара Тестирование
        if (y == 0) {
            throw new DivisionByZeroException("Деление на 0 запрещено!");
        }
        return x / y;
    }

}
