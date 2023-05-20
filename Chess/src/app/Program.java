package app;

import model.entities.Position;

public class Program {
    public static void main(String[] args) throws Exception {
       
        Position position = new Position(1, 2);

        System.out.print("Position test: ");
        System.out.println(position);

        position.setValues(4, 5);

        System.out.print("Position update: ");
        System.out.println(position);

    }
}
