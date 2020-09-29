package com.dxc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitTestCase 
{
	@Test
  public void testMyController()
  {
	  MyController myController = new MyController();
	  String result= myController.hello();
	  assertEquals(result, "Hello World");
  }
}
