// PhoneBookTest.java
import org.junit.Test;
import ru.netology.PhoneBook;

import static org.junit.Assert.*;

public class PhoneBookTest {
    @Test
    public void testAddContact() {
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add("John", "12345");
        assertEquals(1, result);
    }

    @Test
    public void testAddDuplicateContact() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "12345");
        int result = phoneBook.add("John", "67890");
        assertEquals(0, result);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "12345");
        String result = phoneBook.findByNumber("12345");
        assertEquals("John", result);
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "12345");
        String result = phoneBook.findByName("John");
        assertEquals("12345", result);
    }

    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "12345");
        phoneBook.add("Alice", "67890");
        String result = phoneBook.printAllNames();
        assertEquals("Alice, John", result);
    }
}
