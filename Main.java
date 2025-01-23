import java.util.*;

public class Main {
    public static void main(String[] args) {
        WordFrequency();

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "123456");
        phoneBook.add("Петров", "654321");
        phoneBook.add("Сидоров", "789101");
        phoneBook.add("Кузнецов", "112233");
        phoneBook.add("Смирнов", "445566");
        phoneBook.add("Попов", "778899");
        phoneBook.add("Васильев", "990011");
        phoneBook.add("Новиков", "223344");
        phoneBook.add("Федоров", "556677");
        phoneBook.add("Морозов", "889900");
        phoneBook.add("Иванов", "111222");
        phoneBook.add("Петров", "333444");

        System.out.println("Телефоны Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петров: " + phoneBook.get("Петров"));
        System.out.println("Телефоны Сидоров: " + phoneBook.get("Сидоров"));
        System.out.println("Телефоны Николаев: " + phoneBook.get("Николаев"));

        System.out.println("\nПолный справочник:");
        phoneBook.printAll();
    }

    public static void WordFrequency() {
        String[] wordsArray = {
                "apple", "orange", "banana", "apple", "kiwi",
                "pear", "orange", "apple", "banana", "kiwi",
                "grape", "peach", "pear", "kiwi", "plum",
                "plum", "cherry", "grape", "apple", "pear"
        };
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(wordsArray));

        System.out.println("Список уникальных слов: " + uniqueWords);

        System.out.println("Количество вхождений каждого слова:");
        for (String word : uniqueWords) {
            int count = Collections.frequency(Arrays.asList(wordsArray), word);
            System.out.println(word + ": " + count);
        }
    }
}