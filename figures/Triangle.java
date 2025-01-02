package figures;

public class Triangle implements Figure {
    private String colorBackground;
    private String colorBorder;
    private int a, b, c;

    public Triangle(String colorBackground, String colorBorder, int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Стороны треугольника заданы некорректно.");
        }
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float calcPerimeter() {
        return a + b + c;
    }

    @Override
    public float calcSquare() {
        double p = calcPerimeter() / 2; // Полупериметр
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void getCharacteristics() {
        System.out.println("Треугольник имеет следующие характеристики: \n" +
                "Периметр: " + this.calcPerimeter() + "\n" +
                "Площадь: " + this.calcSquare() + "\n" +
                "Цвет фона: " + this.colorBackground + "\n" +
                "Цвет границы: " + this.colorBorder + "\n");
    }
}
