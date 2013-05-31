package com.gopivotal.saleng.examples.si;

import java.io.Serializable;


public class Fish implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String colour;

    public Fish() {
        //
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
