package school.management.system;

/**
 * This class is responsible for keeping track of the
 * teacher's name, id and salary.
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary, int salaryEarned) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
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

    /**
     * Adds to salaryEarned.
     * Removes from the total money earned from the school
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's name: " + name + "\nSalary earned so far: $" + salaryEarned;
    }
}
