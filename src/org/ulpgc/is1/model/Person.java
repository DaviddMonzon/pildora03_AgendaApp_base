package org.ulpgc.is1.model;

public class Person extends Contact {
    private String name;
    private String description;

    public Person(String telephone, String email, Address address, String name, String description) {
        super(telephone, email, address);
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return firstName + " " + lastName;
    }
}
