package aula2.entities;

import aula2.enums.Color;

public abstract class AbsctractShape implements Shape {

    private Color color;

    public AbsctractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
