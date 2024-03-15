package figuras;

public abstract class Figura {
    int x;
    int y;
    public abstract void CalcularArea();
    int GetX() {
        return x;
    }
    int GetY() {
        return y;
    }
}
