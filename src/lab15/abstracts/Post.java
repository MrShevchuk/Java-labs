package lab15.abstracts;

import lab15.intefaces.MailSender;

public class Post implements MailSender {

        @Override
        public String createMail(String mail) {
            return mail;
        }

        @Override
        public void sendMail(String mail) {
            System.out.println("Отправляем вручную текст: " + mail);
        }

    @Override
    public String toString() {
        return "Post{}";
    }
}
