import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestEmailSender {

	@Test
	public void send_email() {
		MockOutbox outbox = new MockOutbox();
		EmailSender emailSender = new EmailSender(outbox);
		Email email = new Email();
		email.setSubject("subject");
		email.setFromAddress("joseph@odd-e.com");
		email.setContent("content");
		
		emailSender.sendEmail(email);

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
		assertEquals("joseph@odd-e.com" + "Sent", email.getFromAddress());
		assertEquals("content" + "Sent", email.getContent());
	}

}
