package com.example.model;

public class Employee {
    private Long id;
    private String name;
    private String position;
    private String phone;

    // Constructors
    public Employee() {}
    public Employee(Long id, String name, String position, String phone) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.phone = phone;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
