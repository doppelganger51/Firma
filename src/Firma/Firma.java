package Firma;
/*
    ArrayLista pracowników
            wyjscie z programu
            dodaj pracownika nowego
            Wyswietl wszystkich pracowników
            zwolnij pracownika
            podnieś płace pracownika
            suma wydatków miesięcznych
            zapis danych pracowników w formie tabeli do pliku txt
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Firma {
    public static void main(String[] args) {

        String name;
        String surname;
        int age;
        String position;
        int salary;
        String address;
        String manager_password = "12345a";
        int employee_ID;

        Pracownik pracownik = new Pracownik();

        ArrayList<String> emps = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Please choose what do you want to do: (add) - add new employee; \t(v) - view employee list; \t(f) - fire employee; \t(r) - raise the salary; \t(s) - view expenses statistics; \t(x) - exit\n");
        System.out.print("Please input choise: ");
        String choice = sc.next();

        if (choice.equals("x")) {
            System.out.println("Bye");
        } else {
            switch (choice) {
                case "add":
                    System.out.print("Please input employee name: ");
                    name = sc.next();
                    System.out.print("\nPlease input employee surname: ");
                    surname = sc.next();
                    System.out.print("\nPlease input employee age: ");
                    age = sc.nextInt();
                    System.out.print("\nPlease input employee position: ");
                    position = sc.next();
                    System.out.print("\nPlease input employee salary: ");
                    salary = sc.nextInt();
                    System.out.print("\nPlease input employee address: ");
                    address = sc.next();
                    Pracownik pracownik_1 = new Pracownik(name, surname, age, position, salary, address);
                    emps.add(pracownik_1.toString());
                    break;
                case "v":
                    for (String i : emps) {
                        System.out.print(i);
                    }
                    break;
                case "f":
                    System.out.print("Please input employee ID (0-10): ");
                    employee_ID = sc.nextInt();
                    emps.remove(employee_ID);
                    break;
                case "r":
                    System.out.print("Please input your password: ");
                    String password = sc.next();
                    if (password.equals(manager_password)) {
                        System.out.print("\nPlease input employee ID (0-10): ");
                        employee_ID = sc.nextInt();
                        System.out.print("Please input new salary: ");
                        int raise = sc.nextInt();
                        emps.set()
                    } else {
                        System.out.println("Access error!");
                    }
                    break;


            }
        }
    }
}
