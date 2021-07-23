package lesson09;

public class CourseImplements implements Course {

    private String name;

    public CourseImplements(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
