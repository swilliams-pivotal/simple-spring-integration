package com.gopivotal.soleng.examples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gopivotal.saleng.examples.annotations.config.SimpleAnnotationConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={SimpleAnnotationConfiguration.class})
public class SimpleAnnotationConfigurationTest {

    @Before
    public void setup() {
        
    }

    @Test
    public void doTestStuff() {
        
    }

    @After
    public void teardown() {
        
    }

}
