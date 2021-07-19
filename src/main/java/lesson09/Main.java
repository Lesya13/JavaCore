package lesson09;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Course course01 = new CourseImplements(("course01"));
        Course course02 = new CourseImplements(("course02"));
        Course course03 = new CourseImplements(("course03"));

        List<Student> students = Arrays.asList(
                new StudentImplements("stud01", Arrays.asList(course01, course02)),
                new StudentImplements("stud02", Arrays.asList(course02, course03)),
                new StudentImplements("stud03", Arrays.asList(course01, course03)),
                new StudentImplements("stud04", Arrays.asList(course01, course02, course03)),
                new StudentImplements("stud05", null)
        );
        System.out.println(getUniqueCourses(students));
        System.out.println(getCuriousStudent(students));
        System.out.println(getStudentsForCourse(students, course02));
    }

    public static List<Course> getUniqueCourses(List<Student> students) {
        students = students == null ? new ArrayList<>() : students;

        return students.stream()
                .filter(Objects::nonNull)
                .map(Student::getAllCourses)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
    }
    public static List<Student> getCuriousStudent(List<Student> students) {
        students = students == null ? new ArrayList<>() : students;

        return students.stream()
                .filter(Objects::nonNull)
                .sorted((o1, o2) -> {
                    List<Course> course01 = o1.getAllCourses();
                    List<Course> course02 = o2.getAllCourses();
                    return Integer.compare(
                            course02 ==null ? 0 : course02.size(),
                            course01 == null ? 0 : course01.size()
                    );
                })
                .limit(3)
                .collect(Collectors.toList());
    }

    public static List<Student> getStudentsForCourse(List<Student> students, Course course) {
        if (course == null) {
            return new ArrayList<>();
        }

        students = students == null ? new ArrayList<>() : students;

        return students.stream()
                .filter(Objects::nonNull)
                .filter(student -> {
                    List<Course> courses = student.getAllCourses();
                    courses = courses == null ? Collections.emptyList() : courses;
                    return courses.contains(course);
                })
                .collect(Collectors.toList());
    }
}
