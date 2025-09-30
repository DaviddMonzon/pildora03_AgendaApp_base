package org.ulpgc.is1.model;

import jdk.jshell.PersistentSnippet;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contacts;
    private List<Group> groups;

    public Agenda() {
        this.contacts = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    public void addPerson(Person person) {
        contacts.add(person);
    }

    public void addCompany(Company company) {
        contacts.add(company);
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public List<Group> getGroups() {
        return groups;
    }
}