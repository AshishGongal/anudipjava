/*A boy has his money deposited Rs 1000,  Rs 1500 and  Rs 2000 in banks-Bank A, Bank B and Bank C respectively. We have to print the money deposited by him in a particular bank.
Create a abstract class  'Bank' with an abstract method 'getBalance' . Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns the amount deposited in that particular bank. 
Call the method 'getBalance' by the object of each of the three banks.*/


package First_Problem;

public abstract class Bank

{
	abstract int getBalance(); //abstract method
}

