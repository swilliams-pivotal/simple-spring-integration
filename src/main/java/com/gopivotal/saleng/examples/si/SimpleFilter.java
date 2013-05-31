package com.gopivotal.saleng.examples.si;

public class SimpleFilter {

    public boolean filterGoldFish(Fish fish) {
        return "gold".equals(fish.getColour());
    }

}
