package com.cydeo.solid.openClosed.example1.good;

import java.util.List;

public class DrawShape {

    //If we want to add new shapes we do not need to add anything here. We add the wanted shapes class and here it draw automatically it.
    public void startDrawing(List<Shape> shapes) {

        for (Shape shape: shapes) {
            shape.draw();
        }

    }

}
