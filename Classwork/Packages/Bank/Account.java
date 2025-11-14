package Bank;
public class Account{
public void openAccount()
{System.out.println("New account opened"); }

private void calculateInterest(double x)
{System.out.println("Interest: "+x); }

/*default void displayBalance()    can be accessed in same package
{System.out.println("Your balance is: 100000"); }
*/
}