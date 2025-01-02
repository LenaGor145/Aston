package animals;

public class Cat extends Animal {
    private static int catCount = 0;
    private static int foodInBowl = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        catCount++;
        this.isFull = false;
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Введите корректное число.");
            return;
        }
        if (distance <= 200) {
            System.out.println(name + " пробежал(а) " + distance + " метров.");
        } else {
            System.out.println(name + " не смог(ла) пробежать " + distance + " метров.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isFull() {
        return isFull;
    }

    public static void addFoodToBowl(int amount) {
        if (amount > 0) {
            foodInBowl += amount;
            System.out.println("В миску добавлено " + amount + " еды. Сейчас в миске: " + foodInBowl);
        } else {
            System.out.println("Количество добавляемой еды должно быть больше нуля.");
        }
    }

    public static int getFoodInBowl() {
        return foodInBowl;
    }

    // Кот ест из миски
    public void eat(int amount) {
        if (amount <= foodInBowl) {
            foodInBowl -= amount;
            isFull = true;
            System.out.println(name + " покушал(а) " + amount + " еды. В миске осталось: " + foodInBowl);
        } else {
            System.out.println(name + " не смог(ла) покушать. Не хватает еды.");
        }
    }
}

