package com.gopivotal.saleng.examples.si;

import java.util.HashMap;
import java.util.Map;

public class FishToMapTransformer {

    public Map<String, Fish> transform(Fish fish) {
        Map<String, Fish> fishes = new HashMap<>();
        fishes.put(fish.getName(), fish);
        return fishes;
    }

}
