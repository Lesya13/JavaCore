package lesson01.actions;

public class RunTrack implements Barrier {
    int kilometers;

    public RunTrack(int kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public boolean toRun(int maxLength) {
        return (maxLength >= kilometers);
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }

    @Override
    public String toString() {
        return "The length of running track is " + kilometers;
    }
}
