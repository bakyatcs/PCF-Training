package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MessageServiceTest {

	@Test
	public void testMessage() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hello");
	}
	
	@Test
	public void checkSum() {
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.sum(),30);
	}
	
	@Test
	public void checkSubtract() {
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.subtract(),1);
	}
	
	
	@Test
	public void checkMultiply() {
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.multiply(),225);
	}
	
	
	@Test
	public void checkDivide() {
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.divide(),1);
	}
	
	
	@Test
	public void checkPower() {
		MessageService ms = new MessageService();
		Assertions.assertNull(ms.nullCheck());
	}
	
	@Test
	public void checkNotNullSum() {
		MessageService ms = new MessageService();
		Assertions.assertTrue(ms.sum()>0);
	}
	
	
	@Test
	public void checkNotEquals() {
		MessageService ms = new MessageService();
		Assertions.assertNotSame(ms.sum(),ms.subtract());
	}
	
	@Test
	public void checkNotNullSubtract() {
		MessageService ms = new MessageService();
		Assertions.assertTrue(ms.subtract()>0);
	}
	
	@Test
	public void checkNotNullMultiply() {
		MessageService ms = new MessageService();
		Assertions.assertTrue(ms.multiply()>0);
	}
	
	@Test
	public void checkNotNullDivide() {
		MessageService ms = new MessageService();
		Assertions.assertTrue(ms.divide()>0);
	}
	
	
	
}