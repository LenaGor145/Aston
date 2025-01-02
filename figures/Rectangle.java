package figures;

public class Rectangle implements Figure {
    private String colorBackground;
    private String colorBorder;
    private int width;
    private int height;

    public Rectangle(String colorBackground, String colorBorder, int width, int height) {
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
        this.width = width;
        this.height = height;
    }

    @Override
    public float calcPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public float calcSquare() {
        return width * height;
    }

    public void getCharacteristics() {
        System.out.println("Прямоугольник имеет следующие характеристики: \n" +
                "Периметр: " + this.calcPerimeter() + "\n" +
                "Площадь: " + this.calcSquare() + "\n" +
                "Цвет фона: " + this.colorBackground + "\n" +
                "Цвет границы: " + this.colorBorder + "\n");
    }
}
