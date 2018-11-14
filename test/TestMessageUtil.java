import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMessageUtil {
	
	String message = "Haydee";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Haydee";
		assertEquals(message, messageUtil.salutationMessage());
	}
}