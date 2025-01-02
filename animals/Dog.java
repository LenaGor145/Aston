package animals;

public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Введите корректное число.");
            return;
        }

        if (distance <= 500) {
            System.out.println(name + " пробежал(а) " + distance + " метров.");
        } else {
            System.out.println(name + " не смог(ла) пробежать " + distance + " метров.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance < 0) {
            System.out.println("Введите корректное число.");
            return;
        }
        if (distance <= 10) {
            System.out.println(name + " проплыл(а) " + distance + " метров.");
        } else {
            System.out.println(name + " не смог(ла) проплыть " + distance + " метров.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}