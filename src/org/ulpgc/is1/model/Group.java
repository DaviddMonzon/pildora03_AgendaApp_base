package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final String name;
    private List<Contact> contacts;

    public Group(String name) {
        this.name =  name;
        this.contacts = new ArrayList<>();
    }

    public boolean addContacts(Contact contact) {
        if (contact == null) return false;
        if (contacts.contains(contact)) return false;
        return contacts.add(contact);
    }

    public boolean removeContact(Contact contact) {
        if (contact == null) return false;
        contacts.remove(contact);
    }

    public String getName() {
        return name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

}