/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuf48938
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {
    String message = "Hello World";
    
    // These tests should succeed
    @Test
    public void test1() {
        System.out.println("Testing two of the same dates. Expecting value '0' days");
        Date d1 = new Date(2016, 12, 25);
        Date d2 = new Date(2016, 12, 25);
        assertEquals(0, d1.daysTo(d2));
        System.out.println(d1.daysTo(d2));
    }
    
    @Test
    public void test2() {
        System.out.println("Testing two dates that are 7 months away. Expecting value '210' days");
        Date d1 = new Date(2016, 5, 25);
        Date d2 = new Date(2016, 12, 25);
        assertEquals(210, d1.daysTo(d2));
        System.out.println(d1.daysTo(d2));
    }
    
    // These tests should fail
    @Test
    public void test3() {
        System.out.println("Testing two dates. Expecting to fail");
        Date d1 = new Date(2016, 6, 1);
        Date d2 = new Date(2016, 12, 25);
        assertEquals(20000, d1.daysTo(d2));
        System.out.println(d1.daysTo(d2));
    }
    
    @Test
    public void test4() {
        System.out.println("Testing two dates. Expecting to fail");
        Date d1 = new Date(2016, 12, 11);
        Date d2 = new Date(2016, 12, 25);
        assertEquals(1000, d1.daysTo(d2));
        System.out.println(d1.daysTo(d2));
    }
}
