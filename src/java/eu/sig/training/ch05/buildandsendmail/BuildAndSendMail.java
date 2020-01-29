package eu.sig.training.ch05.buildandsendmail;

public class Mail() {
	public MailAddress mailAddress;
	public MailBody mailBody;
	public Mail(MailAddress mailAddress, MailBody mailBody) {
		this.mailAddress = mailAddress;
		this.mailBody = mailBody;
	}
}

public class MailAddress() {
	public String msgId;
	public MailAddress(String firstName, String lastName, String devision) {
		this.msgId = firstName.charAt(0) + "." + lastName.substring(0, 7) + "@"
            + division.substring(0, 5) + ".compa.ny";
	}
}

public class MailBody() {
	public String subject;
	public MailMessage message;
	public MailBody(String subject, MailMessage message) {
		this.subject = subject;
		this.message = message;
	}

}

public class BuildAndSendMail {
    public void buildAndSendMail(MailMan m, MailAddress mailAddress, MailBody mailBody) {
       Mail mail = Mail(mailAddress, mailBody);
        
        m.send(mail);
    }

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }

    private class MailFont {

    }

    private class MailMessage {

    }

}