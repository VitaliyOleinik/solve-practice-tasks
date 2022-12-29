package com.tasks.objects_immutable;

import java.awt.*;
import java.util.Objects;

public class CheckLinksByNull {

}

class Car {
    private final String name;
    private final Color color;

    public Car(String name, Color color) {
        this.name = Objects.requireNonNullElse(name, "No name");
        this.color = Objects.requireNonNullElse(color, new Color(0, 0, 0));
    }

    public Car(String name, Color color, String a) {
        if (name == null) {
            this.name = "Безымянный";
        } else {
            this.name = name;
        }
        if (color == null) {
            this.color = new Color(0, 0, 0);
        } else {
            this.color = color;
        }
    }
}

