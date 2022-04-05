package ru.geekbrains.homework.les_5;

public class Employee {
    private String fullName;
    private String position;
    private String e_mail;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String e_mail, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.e_mail = e_mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.printf("ФИО: %s\nДолжность: %s\nЭлектронный адрес: %s\nТелефон: %s\nЗаработная плата: %d\nВозраст: %d\n\n",
                fullName, position, e_mail, phone, salary, age);
    }
}
