
public class MockDemo {
	
	public MockDemo() {
		this(new Outbox() {
			
			public void send(Email email) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	private final Outbox outbox;

	public MockDemo(Outbox outbox) {
		this.outbox = outbox;
	}

	public void sendEmail(Email email) {
		Email newEmail = new Email();
		newEmail.setSubject(email.getSubject() + "Sent");
		newEmail.setFromAddress(email.getFromAddress() + "Sent");
		newEmail.setContent(email.getContent() + "Sent");
		outbox.send(newEmail);
	}

}
