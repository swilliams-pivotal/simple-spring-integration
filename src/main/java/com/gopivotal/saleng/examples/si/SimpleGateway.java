package com.gopivotal.saleng.examples.si;

import org.springframework.integration.annotation.Gateway;

public interface SimpleGateway {

    @Gateway
    void putFish(Fish fish);

}
