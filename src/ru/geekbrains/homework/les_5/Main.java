package ru.geekbrains.homework.les_5;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee[] empArray = new Employee[5];

        empArray[0] = new Employee("Петров А.И.", "Business Analyst", "petrovdk@mail.ru", "+79207771370",150_000, 42);
        empArray[1] = new Employee("Жданова Е.А.", "SMM manager", "zhdanovadk@mail.ru", "+79217371320",70_000, 21);
        empArray[2] = new Employee("Зернов В.В.", "Middle Java developer", "zernovdk@mail.ru", "+79167998172",100_000, 41);
        empArray[3] = new Employee("Мартов Н.Н", "Junior Java developer", "martovdk@mail.ru", "+79017471370",85_000, 27);
        empArray[4] = new Employee("Коллонтай А.И", "PR-manager", "kollontaydk@mail.ru", "+79034560005",150_000, 45);

        for(Employee employee : empArray) {
            if(employee.getAge() >= 40) employee.printInfo();
        }
    }
}
