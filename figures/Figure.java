package figures;

public interface Figure {

    float PI = 3.14f;

    default float calcPerimeter() {
        System.out.println("Параметры не известны");
        return 0.0f;
    }

    float calcSquare();
}
