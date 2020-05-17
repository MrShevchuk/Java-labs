package lab18;

import javax.imageio.ImageTranscoder;
import javax.security.auth.login.AccountException;
import java.util.Objects;
import java.util.Scanner;

public class MoneyTransactionUtil {

    private String masterCard;
    private String visa;
    private long sum;


    static void sendTo() throws AccountException, MoneyValueExeption
    {

        MoneyTransactionUtil transaction = new MoneyTransactionUtil();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your card please: ");
        transaction.masterCard = scanner.nextLine();
        System.out.println("Enter receiver card: ");
        transaction.visa = scanner.nextLine();
        System.out.println("Enter your amount:");
        transaction.sum = Integer.parseInt(scanner.next());

        if (Objects.equals(transaction.masterCard, transaction.visa))
        {
            throw new AccountException();
        }
        if ((transaction.sum <= 0) | (transaction.sum > 100000))
        {
            throw new MoneyValueExeption();
        }
        else
            System.out.println("Sum: " + transaction.sum + '$' + " " + "from card " + transaction.masterCard + " to card " + transaction.visa + " has been successfully transacted.");
    }
}

