package com.user06.dagger_2tutorial;

/**
 * Created by Anjan Debnath on 2/15/2018.
 * Copyright (c) 2018, W3 Engineers Ltd. All rights reserved.
 */


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class MainServiceTest {

    //Initialising a mock
    /**
     * ReadMe:
     * and annotate JUnit test class with @RunWith(MockitoJUnitRunner.class).
     * annotate the filed that is going to be mocked with Dagger2 @InjectMocks
     * annotate the filed that is going to be mocked with @Mock
     * In this way Mockito runner does the initialisation behind the scenes:
     */
    @InjectMocks
    private MainService mainService;
    @Mock
    private RestService restService;

    //Control mock’s behaviour
    /**
     *  The whole idea for having a mock is to be able to control its behaviour.
     *  If mock is called it should respond in a predictable manner.
     *  This is done with when() method:
     */
    @Test
    public void testDoSomething() {
        //when
        when(restService.getSomething()).thenReturn("abc");
        mainService.doSomething();
        //then
        verify(restService, times(1)).getSomething();
    }

    //Verify mock was interacted with
    /**
     * In order to verify execution path is correct Mockito provides a way to check
     * if certain method on the mock has been called and how many times.
     * This is done with verify() method.
     */
    @Test
    public void testVerify(){

    }

}
