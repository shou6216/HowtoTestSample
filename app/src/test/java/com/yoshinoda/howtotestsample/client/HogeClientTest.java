package com.yoshinoda.howtotestsample.client;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by user on 2018/02/03.
 */
public class HogeClientTest {

    private HogeClient sut;

    @Before
    public void setUp() throws Exception {
        sut = new HogeClient();
    }

    @Test
    public void getText() throws Exception {
        String actual = sut.getText();
        assertThat(actual, is("hogehoge"));
    }

}