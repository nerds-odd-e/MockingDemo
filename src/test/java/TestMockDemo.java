
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


public class TestMockDemo {

	@Test
	public void send_email() {
		MockOutbox outbox = new MockOutbox();
		MockDemo demo = new MockDemo(outbox);
		Email email = new Email();
		email.setSubject("subject");
		email.setFromAddress("joseph@odd-e.com");
		email.setContent("content");
		
		demo.sendEmail(email);
		
		outbox.verify();
	}

}

class MockOutbox implements Outbox {

	private boolean isCalled;
	private Email email;

	public void send(Email email) {
		isCalled = true;
		this.email = email;
	}
	
	public void verify() {
		assertTrue(isCalled);
		assertEquals("subject" + "Sent", email.getSubject());
		assertEquals("joseph@odd-e.comSent", email.getFromAddress());
		assertEquals("contentSent", email.getContent());
	}
	
}
