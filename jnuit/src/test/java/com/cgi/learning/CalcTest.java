package com.cgi.learning;
import com.cgi.learning.Calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalcTest {

    @Mock
    List<String> mocklist;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);  // Initialize mocks manually
    }
   Calc calc = new Calc();
    int[] unsorted;



    @Test
    public void test(){
        int res = calc.divide(10, 2);
        assertEquals(5,res,"failed please check logic");


    }

    /**
     assertArrayEquals: it checks the content and order of values in array,while
     assertEquas check the refrence of array
     */
    @Test
    void sortedArrayTest() {
        int[] unsorted = {2,1,4};
        assertArrayEquals(new int[]{1, 2, 4},calc.sortedArray(unsorted));

    }

    /**
     * assertThrows: it handles the exceptions ,it accepts 2 paramters
     * 1.expected
     * 2.executable
     */
    @Test
    void sortedArrayTest2() {
        //int[] unsorted =null;
        assertThrows(NullPointerException.class,() -> calc.sortedArray(unsorted));


    }

    /**
     * assertTimeout : used to do check the performance,2 parameters
     * 1.Duration
     * 2.executor
     */
    @Test
    void sortedArrayPerformance_Test() {

        assertTimeout(Duration.ofMillis(10),  () -> calc.sortedArrayPerformance(new int[]{2,1,4}));
    }



    @Test
    void hello(){
        //List mocklist = mock(List.class);
        when(mocklist.get(0)).thenReturn("mockito");
        assertEquals("mockito",mocklist.get(0));
    }


}
