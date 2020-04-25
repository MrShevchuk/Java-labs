package lab15.intefaces;

public interface EmailSender extends MailSender {

        String editMail (String mail);

    @Override
    String createMail(String mail);

    @Override
    void sendMail(String mail);


}

