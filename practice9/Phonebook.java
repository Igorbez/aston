import java.util.*;

public class Phonebook {
    private Map<String, List<String>> contacts;

    public Phonebook() {
        this.contacts = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (contacts.containsKey(lastName)) {
            List<String> phoneNumbers = contacts.get(lastName);
            phoneNumbers.add(phoneNumber);
            contacts.put(lastName, phoneNumbers);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            contacts.put(lastName, phoneNumbers);
        }
    }

    public List<String> get(String lastName) {
        return contacts.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "123456789");
        phonebook.add("Петров", "987654321");
        phonebook.add("Иванов", "555555555");
        phonebook.add("Сидоров", "7878787878");

        System.out.println("Номера Иванова: " + phonebook.get("Иванов"));
        System.out.println("Номера Петрова: " + phonebook.get("Петров"));
        System.out.println("Номера Сидорова: " + phonebook.get("Сидоров"));
    }
}
