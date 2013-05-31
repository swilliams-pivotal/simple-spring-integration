package com.gopivotal.soleng.examples;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.gemfire.GemfireTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gopivotal.saleng.examples.si.Fish;
import com.gopivotal.saleng.examples.si.SimpleGateway;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/simple-context.xml")
public class SimpleXmlConfigurationTest {

    @Autowired
    SimpleGateway gateway;

    @Autowired
    GemfireTemplate fishTemplate;

    @Before
    public void setup() {
        // do some additional setup
        Fish gold = new Fish();
        gold.setName("bob");
        gold.setColour("gold");
        gateway.putFish(gold);

        Fish blue = new Fish();
        blue.setName("rob");
        blue.setColour("blue");
        gateway.putFish(blue);
    }

    @Test
    public void doTestStuff() {
        // Uncomment to always fail
        // Assert.assertTrue(false);

        // test gold fish is in region
        Assert.assertTrue(fishTemplate.containsKey("bob"));

        // test blue fish is not in region
        Assert.assertFalse(fishTemplate.containsKey("rob"));
    }

    @After
    public void teardown() {
        // do some cleanup
        fishTemplate.getRegion().clear();
    }

}
