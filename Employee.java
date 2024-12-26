public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getInConsole() {
        System.out.println("Full Name: " + this.fullName +
                "\nPosition: " + this.position +
                "\nE-mail: " + this.email +
                "\nPhone: " + this.phone +
                "\nSalary: " + this.salary +
                "\nAge: " + this.age + "\n");
    }

}
