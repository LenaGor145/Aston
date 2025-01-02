package figures;

public class Circle implements Figure {
    private String colorBackground;
    private String colorBorder;
    private int radius;

    public Circle(String colorBackground, String colorBorder, int radius) {
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
        this.radius = radius;
    }

    @Override
    public float calcPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public float calcSquare() {
        return PI * (radius * radius);
    }

    public void getCharacteristics() {
        System.out.println("Круг имеет следующие характеристики: \n" +
                "Периметр: " + this.calcPerimeter() + "\n" +
                "Площадь: " + this.calcSquare() + "\n" +
                "Цвет фона: " + this.colorBackground + "\n" +
                "Цвет границы: " + this.colorBorder + "\n");
    }
}
