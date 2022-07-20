package school.management.system;

import java.util.List;

/**
 * The school can have many teachers and many students.
 * Implements teachers and students using an ArrayList.
 */

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * New School object is created.
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * @return the list of teachers in the school.
     */

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school.
     * @param teacher the teacher to be added.
     */

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school.
     * @param student the student to be added.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school.
     */

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param moneyEarned the money to be added.
     */

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return the total money earned by the school.
     */

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Updates the money that is spent by the school as salary to teachers.
     * @param moneySpent money spent by school.
     */

    public static void updateTotalMoneySpent(int moneySpent) {
       totalMoneyEarned -= moneySpent;
    }
}
