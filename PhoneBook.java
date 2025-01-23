import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> PhoneBook;
    public PhoneBook() {
        PhoneBook = new HashMap<>();
    }

       public void add(String lastName, String phoneNumber) {
        PhoneBook.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }
    public List<String> get(String lastName) {
        return PhoneBook.getOrDefault(lastName, Collections.emptyList());
    }
    public void printAll() {
        for (Map.Entry<String, List<String>> entry : PhoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
