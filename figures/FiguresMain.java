package figures;

public class FiguresMain {
    public static void runProgram() {
        Circle circle1 = new Circle("Красный", "Чёрный", 10);
        circle1.getCharacteristics();

        Rectangle rectangle1 = new Rectangle("Синий", "Серый", 5, 7);
        rectangle1.getCharacteristics();

        Triangle triangle1 = new Triangle("Желтый", "Синий", 3, 5, 4 );
        triangle1.getCharacteristics();
    }
}
