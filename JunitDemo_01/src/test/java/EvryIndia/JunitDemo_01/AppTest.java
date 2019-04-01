package EvryIndia.JunitDemo_01;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class AppTest {
    	
    	@Test
    	public void testCheckMin() {
    		assertEquals(4, App.checkMax(new int[] {1,2,3,4}));
    	}
    	
    	
    	@Test
    	 public void checkSquareTest_02(){  
    	        int[] isExpectedarr  = new int[] {4,9};
    			int[] checkSquare = App.checkSquare(new int[] {2,3});
    			assertTrue(Arrays.equals(isExpectedarr , checkSquare));
    	    }
    }
