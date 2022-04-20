package com.training;
import com.training.CreditCard;
import com.training.CreditCardService;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	CreditCard card2=new CreditCard(111l,"MMM",10000);
    	CreditCardService service=new CreditCardService();
    	service.addCard(card2);
    	
    	
    	}
}
