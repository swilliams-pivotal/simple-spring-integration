package com.gopivotal.saleng.examples.si;

import org.springframework.integration.annotation.Filter;
import org.springframework.stereotype.Component;

@Component
public class SimpleAnnotatedFilter {

    @Filter
    public boolean filterGoldfish(Fish fish) {
        return "gold".equals(fish.getColour());
    }

}
