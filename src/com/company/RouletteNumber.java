package com.company;


public class RouletteNumber {
    private int    _value;
    private String _color;




    public RouletteNumber(int value, String color) {
        {

            _value = value;
            _color = color;
        }


    }

    public int get_value() {
        return _value;
    }



    public void set_value(int _value) {
        this._value = _value;
    }

    public String get_color() {
        return _color;
    }

    public void set_color(String _color) {
        this._color = _color;
    }
}





