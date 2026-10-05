package lab3.report;

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("================ ОТЧЕТ О ЗАРПЛАТАХ ================");
        System.out.printf("%-30s | %15s%n", "ФИО Сотрудника", "Зарплата");
        System.out.println("---------------------------------------------------");

        for (Employee emp : employees) {
            System.out.printf("%-30s | %15.2f руб.%n", emp.fullname, emp.salary);
        }
        System.out.println("===================================================");
    }
}
