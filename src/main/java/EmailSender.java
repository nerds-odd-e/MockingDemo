
public class EmailSender {
	
	public EmailSender() {
		this(new Outbox() {
			
			public void send(Email email) {
				// To call the real email sender service or API, e.g. JavaMail
			}
		});
	}

	private final Outbox outbox;

	public EmailSender(Outbox outbox) {
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
