package lab15.intefaces;

import lab15.abstracts.AbstractDevice;
import lab15.abstracts.DialPhone;
import lab15.abstracts.Post;
import lab15.abstracts.SmartPhone;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        MailSender post = new Post();
        String postMail = post.createMail(" hello interfaces");
        post.sendMail(postMail);

        Caller dialPhone = new DialPhone();
        dialPhone.call();

        Caller smartPhone = new SmartPhone();
        smartPhone.call();

        EmailSender smartPhone1 = new SmartPhone();
        String message = smartPhone1.createMail("Hello Google");
        smartPhone1.sendMail(message);


    }

    private static void sendMess (MailSender ...items) {
        for (MailSender spam : items) {
            spam.sendMail("This is SPAM");
            System.out.println(spam);
        }
    }
}
