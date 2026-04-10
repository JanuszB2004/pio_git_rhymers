package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListUnitTest {

    @Test
    public void testPush(){
        IntLinkedList list = new IntLinkedList();
        int testValue = 90;
        list.push(testValue);
        int result = list.pop();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testIsEmpty(){
        IntLinkedList list = new IntLinkedList();
        boolean result = list.isEmpty();
        Assert.assertTrue(result);
        list.push(1);
        result = list.isEmpty();
        Assert.assertFalse(result);

    }

    @Test
    public void testIsFull(){
        IntLinkedList list = new IntLinkedList();
        boolean result = list.isFull();
        Assert.assertFalse(result);
    }

    @Test public void testTop(){
        IntLinkedList list = new IntLinkedList();
        int result = list.top();
        Assert.assertEquals(-1, result);
        int testValue = 85;
        list.push(2);
        list.push(testValue);
        result = list.top();
        Assert.assertEquals(testValue, result);
    }

    @Test public void testPop(){
        IntLinkedList list = new IntLinkedList();
        int result = list.pop();
        Assert.assertEquals(-1, result);
        int testValue = 32;
        list.push(testValue);
        result = list.pop();
        Assert.assertEquals(testValue, result);
        result = list.pop();
        Assert.assertEquals(-1, result);
    }
}
