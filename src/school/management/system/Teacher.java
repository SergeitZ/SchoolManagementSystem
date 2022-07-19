package school.management.system;

/**
 * This class is responsible for keeping track of the
 * teacher's name, id and salary.
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @return returns the id for the current teacher.
     */

    public int getId() {
        return id;
    }

    /**
     *
     * @return returns the name of the teacher.
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @return returns the salary of the teacher.
     */

    public int getSalary() {
        return salary;
    }

    /**
     *
     * @param salary sets the salary.
     */

    public void setSalary (int salary) {
        this.salary = salary;
    }
}
