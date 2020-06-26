package org.example;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreetTest {
    private Greet greet;

    @Before
    public void init() {
        greet = new Greet();
    }

    @Test
    public void sayHello()
    {
        Assert.assertEquals( "HelloAyush", greet.sayHello("Ayush"));
    }

    @After
    public  void destroyed()
    {
greet=null;
    }

}