package Firma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pracownik {
    String name;
    String surname;
    int age;
    String position;
    int salary;
    String address;
    public int ID;

    public Pracownik(){

    }
    public Pracownik(String name, String surname, int age, String position, int salary, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.address = address;
    }
    public int getSalary() {
        return salary;
    }
   private void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        String data="Employee:\nName: " + name + "\nSurname: " + surname + "\nAge: "+age+"\nposition: "+position+"\nSalary: "+salary;
        return data;
    }
}
