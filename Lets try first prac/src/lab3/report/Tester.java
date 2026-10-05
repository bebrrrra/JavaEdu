package lab3.report;

public class Tester {
    public static void main(String[] args) {
        // 2) Создаем массив, содержащий несколько объектов типа Employee
        Employee[] employees = {
                new Employee("Иванов Иван Иванович", 55000.50),
                new Employee("Петров Петр Петрович", 120000.00),
                new Employee("Сидорова Анна Сергеевна", 85450.75),
                new Employee("Кузнецов Алекс", 43200.9)
        };

        // Вызов метода генерации отчета
        Report.generateReport(employees);
    }
}
