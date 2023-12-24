package ru.netology;// PhoneBook.java
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> contacts = new HashMap<>();

    public int add(String name, String number) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, number);
            return contacts.size();
        }
        return 0;
    }

    public String findByNumber(String number) {
        // TODO: Реализация метода
        return null;
    }

    public String findByName(String name) {
        // TODO: Реализация метода
        return null;
    }

    public String printAllNames() {
        // TODO: Реализация метода
        return null;
    }
}
