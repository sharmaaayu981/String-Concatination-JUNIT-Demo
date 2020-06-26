package org.example;


import java.util.Arrays;
import java.util.Collection;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class StringConcatenatorTest{
    private String x;
    private String y;
    private String res;
    private Concatenator concatenator;
    @Before
    public void init()
    {concatenator =new Concatenator();}
    public StringConcatenatorTest(String x, String y, String res) {
        this.x = x;
        this.y = y;
        this.res = res;
    }
    @Parameterized.Parameters
    public static Collection tester()
    {
        return Arrays.asList(new Object[][]{
                {"ayush","sharma","ayush sharma"},
                {"raman","deeps","raman deeps"},
                {"Siddh","singh","Siddh singh"},
        });
    }
    @Test
    public void TestNames() throws Exception
    {
        Assert.assertThat(Concatenator.hello(x,y), Matchers.equalTo(res));
    }
    @Test(expected = RuntimeException.class)
    public void notTestNames() throws Exception
    {
        Assert.assertThat(Concatenator.hello("hi","no"),Matchers.equalTo("hi no"));
    }
    @Rule
    public ExpectedException expectedException=ExpectedException.none();
    @Test
    public void mightException() throws Exception
    {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("length is less hi no");
        Concatenator.hello("hi","no");
    }
}











