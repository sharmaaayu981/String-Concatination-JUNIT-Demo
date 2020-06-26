package org.example;

public class Calculator {
    public int add(int x, int y) {
        throwExceptionWhenGivenNegativenumbers(x, y);
        return x + y;
    }
    private void throwExceptionWhenGivenNegativenumbers(int x, int y) {
        if (x < 0 || y < 0){
            throw new RuntimeException("negative number not allowed " + x + " " + y);
        }
    }
}