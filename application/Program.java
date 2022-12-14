package aula2.application;

import aula2.entities.AbsctractShape;
import aula2.entities.Circle;
import aula2.entities.Rectangle;
import aula2.entities.Shape;
import aula2.enums.Color;

public class Program {
    public static void main(String[] args) {

        //     \/ ATENCÃO NISSO
        AbsctractShape s1 = new Circle(Color.BLACK, 2.0);
        AbsctractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: "+ s1.getColor());
        System.out.println("Circle area: "+ String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: "+ s1.getColor());
        System.out.println("Rectangle area: "+ String.format("%.3f", s2.area()));
    }
}
