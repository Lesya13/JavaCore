package lesson01;

import lesson01.actions.Barrier;
import lesson01.actions.RunTrack;
import lesson01.actions.RunableJumpable;
import lesson01.actions.Wall;
import lesson01.persons.Cat;
import lesson01.persons.Human;
import lesson01.persons.Robot;

import java.lang.reflect.Member;

public class Main {

    public static void main(String[] args) {

        RunableJumpable[] membersArray = {
                new Human("Ivar", 3, 2),
                new Human("Ubbe", 2, 4),
                new Cat("Loky", 1, 3),
                new Cat("Bars", 1, 4),
                new Robot("BD1", 8, 9),
                new Robot("BD2", 5, 3)
        };

        Barrier[] barriers = {
                new RunTrack(7),
                new RunTrack(5),
                new Wall(1),
                new Wall(2)
        };

        for(RunableJumpable member : membersArray) {
            System.out.println("On the barrier is " + member);

            boolean winner = true;
            for(Barrier barrier : barriers) {
                System.out.println(member + " try to do it " + barrier);
                if(barrier.toJump(member.getMaxHeight()) || barrier.toRun(member.getMaxLength())) {
                    System.out.println("Great job! It's done!");
                } else {
                    winner = false;
                    System.out.println("Didn't succeed result");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " have done that distance!");
            } else {
                System.out.println(member + " didn't win");
            }
            System.out.println();
        }
    }
}
