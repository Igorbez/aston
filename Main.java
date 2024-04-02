public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Безруков Игорь", "Инженер",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Семенов Петр", "Менеджер",
                "petrov@mailbox.com", "892312313", 40000, 35);
        employees[2] = new Employee("Сидоров Никита", "Программист",
                "sidorov@mailbox.com", "892312314", 50000, 30);
        employees[3] = new Employee("Гагонин Николай", "Бухгалтер",
                "nikolaev@mailbox.com", "892312315", 35000, 40);
        employees[4] = new Employee("Тюкаев Сергей", "Директор",
                "smirnov@mailbox.com", "892312316", 100000, 45);

        for (Employee employee : employees) {
            employee.printInfo();
        }
    }
}