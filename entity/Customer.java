package com.deloitte.telecom.entity;

import java.util.Objects;

public class Customer {
    private String number;
    private String type;
    private String name;
    private double balance;

    public Customer(String number, String type, String name, double balance) {
        this.number = number;
        this.type = type;
        this.name = name;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return number.equals(customer.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}