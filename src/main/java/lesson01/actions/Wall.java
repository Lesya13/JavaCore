package lesson01.actions;

public class Wall implements Barrier {

    int meters;

    public Wall(int meters) {
        this.meters = meters;
    }


    @Override
    public boolean toRun(int maxLength) {
        return false;
    }

    @Override
    public boolean toJump(int maxHeight) {
        return (maxHeight >= meters);
    }

    @Override
    public String toString() {
        return "The height of wall is " + meters;
    }
}
