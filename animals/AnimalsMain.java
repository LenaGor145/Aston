package animals;

public class AnimalsMain {
    public static void runProgram() {
        Cat cat1 = new Cat("Пушистик");
        Cat cat2 = new Cat("Муся");

        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");

        // Тест бега и плавания
        System.out.println("Тест бега и плавания:");
        cat1.run(150);
        cat1.run(-50);
        cat2.run(250);
        cat1.swim(5);
        cat2.swim(-7);

        dog1.run(400);
        dog1.run(-100);
        dog1.swim(8);
        dog1.swim(-5);
        dog2.run(600);
        dog2.run(-200);
        dog2.swim(15);
        dog2.swim(-15);

        // Подсчёт животных
        System.out.println("\nПодсчёт животных:");
        System.out.println("Котов: " + Cat.getCatCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Всего животных: " + Animal.getAnimalCount());


        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Мурка"),
                new Cat("Васька")
        };

        // Добавляем еду в миску
        Cat.addFoodToBowl(25);

        // Коты пытаются поесть
        System.out.println("\nКоты пытаются поесть из миски:");
        for (Cat cat : cats) {
            cat.eat(10); // Каждый кот пытается съесть 10 единиц еды
        }

        // Проверяем сытость котов
        System.out.println("\nСытость котов:");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }

        // Проверяем оставшуюся еду в миске
        System.out.println("\nЕды в миске осталось: " + Cat.getFoodInBowl() + "\n");
    }
}
