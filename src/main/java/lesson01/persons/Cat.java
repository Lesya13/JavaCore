package lesson01.persons;

import lesson01.actions.RunableJumpable;

public class Cat implements RunableJumpable {

    String name;
    int maxHeight;
    int maxLength;

    public Cat(String name, int maxHeight, int maxLength) {
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
        System.out.println("Cat is run");

    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Cat is jump");

    }

    @Override
    public String toString() {
        return "Cat's name is " + this.name;
    }
}
