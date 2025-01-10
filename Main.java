public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("David Wilson", "Engineer", "david.wilson@mail.com", "+321654987", 80000.0, 45);
        employee.getInConsole();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John Smith", "Tester", "john.smith@mail.com", "+123456789", 75000.0, 30);
        employees[1] = new Employee("Maria Johnson", "Manager", "maria.johnson@mail.com", "+987654321", 85000.0, 35);
        employees[2] = new Employee("Michael Brown", "Developer", "michael.brown@mail.com", "+456789123", 95000.0, 40);
        employees[3] = new Employee("Catherine Taylor", "Analyst", "catherine.taylor@mail.com", "+789123456", 70000.0, 28);
        employees[4] = new Employee("David Wilson", "Engineer", "david.wilson@mail.com", "+321654987", 80000.0, 45);

        for (Employee empl : employees) {
            empl.getInConsole();
        }

        Park park = new Park("Devil May Cray");
        park.setParkAttraction("Roller coaster", "9:00 - 18:00", 2.5);
        park.getAttractionsInConsole();

    }
}

