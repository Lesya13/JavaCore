package lesson01.persons;

import lesson01.actions.RunableJumpable;

public class Human implements RunableJumpable {

    String name;
    int maxHeight;
    int maxLength;

    public Human (String name, int maxHeight, int maxLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Human ran");

    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Human jumped");
    }

    @Override
    public String toString() {
        return "Human's name is " + this.name;
    }
}
