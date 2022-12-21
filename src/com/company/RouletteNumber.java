package com.company;

public class RouletteNumber {
    private int _value;
    private Color _color;

    public enum Color {
        RED, BLACK, GREEN
    }

    public RouletteNumber(int value, Color color) {
        _value = value;
        _color = color;
    }

    public int getValue() {
        return _value;
    }

    public void setValue(int value) {
        this._value = value;
    }

    public Color getColor() {
        return _color;
    }

    public void setColor(Color color) {
        this._color = color;
    }

    @Override
    public String toString() {
        return "RouletteNumber{" +
                "value=" + _value +
                ", color=" + _color +
                '}';
    }
}


