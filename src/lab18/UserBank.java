package lab18;

import javax.security.auth.login.AccountException;

public class UserBank {

        public static void main(String[] args) {
            try {
                MoneyTransactionUtil.sendTo();
            } catch (NumberFormatException num) {
                System.out.println("Too many numbers entered. Please enter the correct value. = " + num);
            } catch (AccountException card) {
                System.out.println("Error with bank details. The card number of the sender and the recipient may be the same. = " + card);
            } catch (MoneyValueExeption money) {
                System.out.println("Error with sending amount. The amount must be greater than 0. The amount must not exceed the limit of 100 000 $. = " + money);
            }
        }
    }
