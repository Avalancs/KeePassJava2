package org.linguafranca.pwdb;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class PropertyValueTest {

    public static final String THIS_IS_A_SECRET = "This is a secret + לַחַיִּים";
    Logger logger = LoggerFactory.getLogger(PropertyValueTest.class);
    @Test
    public void sealedObjectTest() {
        PropertyValue.CharsStore.Factory factory = new PropertyValue.CharsStore.Factory();

        PropertyValue.CharsStore testValue = factory.of(THIS_IS_A_SECRET);
        PropertyValue.SealedStore sealed = new PropertyValue.SealedStore(testValue);
        assertEquals(testValue.getValue(), sealed.getValue());
        assertArrayEquals(testValue.getValueAsBytes(), sealed.getValueAsBytes());
        assertArrayEquals(testValue.getValueAsChars(), sealed.getValueAsChars());
        assertEquals(testValue.getValueAsString(), sealed.getValueAsString());

        testValue = factory.of(THIS_IS_A_SECRET.getBytes());
        sealed = new PropertyValue.SealedStore(testValue);
        assertArrayEquals(testValue.getValueAsBytes(), sealed.getValueAsBytes());
        assertArrayEquals(testValue.getValueAsChars(), sealed.getValueAsChars());
        assertEquals(testValue.getValueAsString(), sealed.getValueAsString());

        testValue = factory.of(THIS_IS_A_SECRET.toCharArray());
        sealed = new PropertyValue.SealedStore(testValue);
        assertArrayEquals(testValue.getValueAsBytes(), sealed.getValueAsBytes());
        assertArrayEquals(testValue.getValueAsChars(), sealed.getValueAsChars());
        assertEquals(testValue.getValueAsString(), sealed.getValueAsString());
    }
    @Test
    public void NoOpTest() {
        PropertyValue.StringStore.Factory factory = new PropertyValue.StringStore.Factory();

        PropertyValue.StringStore testValue = factory.of(THIS_IS_A_SECRET);
        assertEquals(THIS_IS_A_SECRET, testValue.getValueAsString());
        testValue = factory.of(THIS_IS_A_SECRET.toCharArray());
        assertEquals(THIS_IS_A_SECRET, testValue.getValueAsString());
        testValue = factory.of(THIS_IS_A_SECRET.getBytes(StandardCharsets.UTF_8));
        assertEquals(THIS_IS_A_SECRET, testValue.getValueAsString());
    }
}