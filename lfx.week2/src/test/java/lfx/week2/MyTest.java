package lfx.week2;


import org.junit.Test;

public class MyTest {
	
	@Test
	public void show(){
		
		StringUtil su = new StringUtil();
		
		boolean flag = su.hasLength("hhshh");
		
		System.out.println(flag);
		
	}
	
}
