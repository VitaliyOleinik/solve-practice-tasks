package com.tasks.objects_immutable.entity;

import com.tasks.objects_immutable.CheckByNullThrowException;

import java.awt.*;
import java.util.Objects;

public class Car {
    private final String name;
    private final Color color;
    private final String code;
    private final String nameSupplier;

    public Car(String name, Color color) {
        this.name = CheckByNullThrowException.requireNonNullElseThrow(name,
                new UnsupportedOperationException ("Имя не может быть установлено в null"));
        this.color = CheckByNullThrowException.requireNotNullElseThrow(color, () ->
                new UnsupportedOperationException("Цвет не может быть установлен в null"));
        this.code = "1";
        this.nameSupplier = "name";
    }

    public Car(String name, Color color, String nameSupplier) {
        if (name == null) {
            throw new NullPointerException("Имя авто не может быть - null!");
        }
        if (color == null) {
            throw new NullPointerException("Цвет авто не может быть - null!");
        }
        this.name = name;
        this.color = color;
        this.code = "1";
        this.nameSupplier = Objects.requireNonNull(nameSupplier, () ->
                "Имя автомобиля не может быть null . .. Возьмите имя из " + name);
    }



    public Car(String name, Color color, String code, String nameSupplier) {
        this.name = Objects.requireNonNull(name,
                "Имя авто не может быть - null!");
        this.color = Objects.requireNonNull(color,
                "Цвет авто не может быть - null!");
        this.code = Objects.requireNonNull(code,
                "code не может быть - null");
        this.nameSupplier = Objects.requireNonNull(nameSupplier, () ->
                "Имя автомобиля не может быть null . .. Возьмите имя из " + name);
    }

    public void assignDriver(String license, Point location) {
        if (license == null) {
            throw new NullPointerException("Лицензия не может быть - null");
        }
        if (location == null) {
            throw new NullPointerException("Местоположение не может быть - null");
        }
    }

    public void assignDriverRequireNonNull(String license, Point location) {
        Objects.requireNonNull(license, "Лицензия не может быть null");
        Objects.requireNonNull(location, "Местоположение не может быть null");
    }
}
