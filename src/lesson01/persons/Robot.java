package lesson01.persons;

import lesson01.actions.RunableJumpable;

public class Robot implements RunableJumpable {

    String name;
    int maxHeight;
    int maxLength;

    public Robot (String name, int maxHeight, int maxLength) {
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
        System.out.println("Robot is run");

    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Robot is jump");

    }

    @Override
    public String toString() {
        return "Robot's name is " + this.name;
    }
}
