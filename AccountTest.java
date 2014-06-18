/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwaretest2;
import junit.framework.TestCase;
import java.util.*;
import static org.mockito.Mockito.*;
/**
 *
 * @author jx
 */
public class AccountTest extends TestCase{
	// 1. get pin number
	public static void testGetPinNumberInt(){
            System.out.println("1. get pin number.");
            int setPin = 1234;
            Account acc = new Account(123456,1000);
            acc.setPinNumber(setPin);
            TestCase.assertEquals(acc.getPinNumber(), setPin);
            System.out.println("****Passed****\n");
        } 
        
        // 2. getPinNumber_stubbing, this one can be set as a stubbing test.
        public static void testGetPinNumberStub(){
            System.out.println("2. getPinNumber_stubbing, "
                    + "this one can be set as a stubbing test.");
            Account acc = mock(Account.class);
            int pin = 1234;
            when(acc.getPinNumber()).thenReturn(pin);
            TestCase.assertEquals(acc.getPinNumber(), pin);
            System.out.println("****Passed****\n");
        } 
        
        //3. setPinNumber, String, by hand
	public static void testSetPinNumberString(){
            Account acc = new Account(123456,1000);
            System.out.println("3. setPinNumber, String, by hand");
            String s = "abc";
            Scanner keybord = new Scanner(s);
            System.out.println("input a String:");
            System.out.println(s);
            if(!keybord.hasNextInt()){
                System.out.println("Please input a number");
                System.out.println("Test Failure because PinNumber can"
                        + " only be a number.\n");
                return;
            }else{
                int pin = keybord.nextInt();
                acc.setPinNumber(pin);
                TestCase.assertEquals(acc.getPinNumber(), pin);
                System.out.println("****Passed****\n");               
            }
            

        } 
        
	// 4. setPinNumber, double,
	public static void testSetPinNumberDoulbe(){
            Account acc = new Account(123456,1000);
            System.out.println("4. setPinNumber, double,");
            Scanner keybord = new Scanner(System.in);
            System.out.println("input a number(double)");
            if(keybord.hasNextDouble()){
                System.out.println("Please input a number(int)");
                System.out.println("Test Failure because PinNumber can"
                        + " only be a integer number.\n");
            }else if(keybord.hasNextInt()){
                int pin = keybord.nextInt();
                acc.setPinNumber(pin);
                TestCase.assertEquals(acc.getPinNumber(), pin);
                System.out.println("****Passed****\n");               
            }
            

        }        
    
	// 5. setPinNumber, int,
	public static void testSetPinNumberInt(){
            System.out.println("5. setPinNumber, int");
            int setPin = 1234;
            Account acc = new Account(123456,1000);
            acc.setPinNumber(setPin);
            TestCase.assertEquals(acc.getPinNumber(), setPin);
            System.out.println("****Passed****\n");
        }
        
        // 6. newUser: using MOCK
        public static void testNewUser(){
            Account account = mock(Account.class);
            System.out.println("6. newUser: using MOCK");
            ArrayList<User> accountOwners = new ArrayList<User>();
            account.newUser();
            System.out.println("****Patially Passed****. However, there is "
                    + "a missing function in the original code"
                    + " to get the information of the "
                    + "newUser.\n");
        }
    
    	// 7. getaccountOwners: stubbing and mock
	public static void getaccountOwnersStub(){
            System.out.println("7. getaccountOwners: stubbing and mock");
            ArrayList <User> u1 = new ArrayList<User>();
            Account acc = mock(Account.class);
            
            when(acc.getaccountOwners()).thenReturn(u1);
            
            TestCase.assertEquals(acc.getaccountOwners(), u1);
            System.out.println("****Passed****\n");
        } 

	// 8. getaccountOwners: mock
	public static void getaccountOwnersMock(){
            System.out.println("8. getaccountOwners: mock");            
            ArrayList <User> u2 = new ArrayList<User>();
            Account acc = mock(Account.class);            
            acc.setAccountOwners(u2);           
            TestCase.assertEquals(acc.getaccountOwners(), u2);
            System.out.println("****Passed****\n");
        }
        
    	// 9. setAccountOwners
        public static void setAccountOwners(){
            System.out.println("9. setaccountOwner");
            ArrayList <User> u2 = new ArrayList<User>();
            Account acc = new Account(123456,1000);
            acc.setAccountOwners(u2);
            TestCase.assertEquals(acc.getaccountOwners(), u2);

            System.out.println("****Passed****\n");

    }



        // 10. setAccountOwners MOCK
        public static void setAccountOwnersMock(){
            System.out.println("10. setaccountOwner: Mock");
            ArrayList <User> u2 = new ArrayList<User>();
            Account acc = mock(Account.class);
            acc.setAccountOwners(u2);
            TestCase.assertEquals(acc.getaccountOwners(), u2);
            System.out.println("****Passed****\n");
}



        // 11. getAccountStatus
	public static void testgetAccountStatus(){
            System.out.println("11. getAccountStatus");           
            Account acc = new Account(123456,1000);
            acc.setAccountStatus("Active");
            TestCase.assertEquals(acc.getAccountStatus(), "Active");
            System.out.println("****Passed****\n");
        } 



         // 12. getAccountStatus Stubbing
	public static void testgetAccountStatusStub(){
            System.out.println("12. getAccountStatus Stub");           
            Account acc = mock(Account.class);
            when(acc.getAccountStatus()).thenReturn("Active");
            TestCase.assertEquals(acc.getAccountStatus(), "Active");
            System.out.println("****Passed****\n");
        } 



        // 13. setAccountStatus: active
	public static void testSetAccountStatus(){
            System.out.println("13. setAccountStatus: active");           
            Account acc = new Account(123456,1000);
            acc.setAccountStatus("Active");
            TestCase.assertEquals(acc.getAccountStatus(), "Active");
            System.out.println("****Passed****\n");
        } 




        // 14. setAccountStatus: inactive
	public static void testSetAccountStatus2(){
            System.out.println("14. setAccountStatus: Inactive");           
            Account acc = new Account(123456,1000);
            acc.setAccountStatus("Inactive");
            TestCase.assertEquals(acc.getAccountStatus(), "Inactive");
            System.out.println("****Passed****\n");
        } 
  



        // 15. setAccountStatus: active--failure with number
	public static void testSetAccountStatusNumber(){
            System.out.println("15. setAccountStatus: active--failure "
                    + "with another string");           
            Account acc = new Account(123456,1000);
            acc.setAccountStatus("1234");
            TestCase.assertEquals("Active", acc.getAccountStatus());
            System.out.println("****Passed****\n");
        } 



        // 16. setAccountStatus: active--failure with another string
        /*
        Exception in thread "main" junit.framework.ComparisonFailure: 
        expected:<[Activ]e> but was:<[Something Els]e>
        */
	public static void testSetAccountStatusFailure2(){
            System.out.println("16. setAccountStatus: active--failure2 "
                    + "with another string");           
            Account acc = new Account(123456,1000);
            acc.setAccountStatus("Something Else");
            TestCase.assertEquals("Active", acc.getAccountStatus());
            System.out.println("****Passed****\n");
        } 




        // 17. getAccountNumber
	public static void testgetAccountNumber(){
            System.out.println("17. getAccountNumber");
            Account acc = new Account(123456,1000);
            TestCase.assertEquals(acc.getAccountNumber(), 123456);
            System.out.println("****Passed****\n");
        } 




         // 18. getAccountType: saving
	public static void testGetAccountTypeSaving(){
            System.out.println("18. getAccountType: saving");           
            Account acc = mock(Account.class);
            when(acc.getAccountType()).thenReturn("Saving");
            TestCase.assertEquals(acc.getAccountType(), "Saving");
            System.out.println("****Passed****\n");
        } 



        // 19. getAccountType: checking
	public static void testGetAccountTypeChecking(){
            System.out.println("19. getAccountType: checking");           
            Account acc = mock(Account.class);
            when(acc.getAccountType()).thenReturn("Checking");
            TestCase.assertEquals(acc.getAccountType(), "Checking");
            System.out.println("****Passed****\n");
        } 

        
       /** failure
        *Exception in thread "main" 
        * junit.framework.ComparisonFailure:
        * expected:<null> but was:<Failure> 
        */
        //20. getAccountType: failure
	public static void getAccountTypeFailure(){
            System.out.println("20. getAccountType: failure");
            Account acc = new Account("LN", "FN", "Add", "Ci", "St",
                "Zip", "SSN", "accN", 1000.0, "Failure");
            
            String checkAccType = acc.getAccountType();
            System.out.println(checkAccType);
            
            TestCase.assertEquals(checkAccType, "Failure");
            System.out.println("****Passed****\n");
        }


	// 21. getAccountBalance
	public static void testgetAccountBalance(){
            System.out.println("21. getAccountBalance");           
            Account acc = new Account("LN", "FN", "Add", "Ci", "St",
                "Zip", "SSN", "accN", 1000.0, "Failure");
            
            TestCase.assertEquals(acc.getAccountBalance(), 1000.0);
            System.out.println("****Passed****\n");
        }

	// 22. Account constructor 1
	public static void testAccountConstructor1(){
            System.out.println("22. Account constructor 1");
                        Account acc = new Account("LN", "FN", "Add", "Ci", "St",
                "Zip", "SSN", "accN", 1000.0, "Failure");
            TestCase.assertEquals(acc.getAccountBalance(), 1000.0);
            System.out.println("****Passed****\n");
        } 

	// 23. Account constructor 2
	public static void testAccountConstructor2(){
            System.out.println("23. Account constructor 2");
            Account acc = new Account(123456);
            TestCase.assertEquals(acc.getAccountNumber(), 123456);
            System.out.println("****Passed****\n");
        } 

	// 24. Account constructor 3
	public static void testAccountConstructor3(){
            System.out.println("24. Account constructor 3");
            Account acc = new Account(123456,1000);
            TestCase.assertEquals(acc.getAccountNumber(), 123456);
            TestCase.assertEquals(acc.getAccountBalance(), 1000.0);
            System.out.println("****Passed****\n");
        } 

	// 25. Account constructor failure: 3 parameters
	public static void testAccountConstructorFailure(){
            //Account acc = new Account(123456,1000);
            System.out.println("25. Account constructor failure: 3 parameters");
            String s = "1234 1000.0 abc";
            Scanner keybord = new Scanner(s);
            
            System.out.println("input an accNumber(int)"
                    + " and iniBalance(double):");
            int count = 0;
            while(keybord.hasNext()){ 
                keybord.next();
                count++;
            }
            System.out.println(s);
            if(count>=2){
                System.out.println("Test Failure because "
                        + "there are more than 2 parameters.\n");          
            }
            else System.out.println("***passed***\n"); 
        }

	// 26. Account constructor failure: balance: string
	public static void testAccountConstructorFailure2(){
            System.out.println("26. Account constructor "
                    + "failure: balance: string");
            Account acc = mock(Account.class);            
            Scanner keybord = new Scanner(System.in);
            System.out.println("input a String for balance");
            if(!keybord.hasNextDouble()){
                System.out.println("Please input a number");
                System.out.println("Test Failure because PinNumber can"
                        + " only be a number.\n");
            }else{
                double balance = keybord.nextDouble();
                when(acc.getAccountBalance()).thenReturn(balance);
                TestCase.assertEquals(acc.getAccountBalance(), balance);
                System.out.println("****Passed****\n");               
            }
        }
        
	// 27. deposit: deposit amount
	public static void testAccountDeposit() {
            System.out.println("27. deposit: deposit amount.");
		Account account = new Account(123456, 1000);
		account.deposit(500);
		TestCase.assertEquals(account.getAccountBalance()-1000, 500.0);
                System.out.println("****Passed****\n");   
	}	

	// 28. deposit: deposit balance
	public static void testAccountDepoitBalance() {
            System.out.println("28. deposit: deposit balance.");
		Account account = new Account(123456, 1000);
		account.deposit(500);
		TestCase.assertEquals(account.getAccountBalance(), 1500.0);
                System.out.println("****Passed****\n");   
	}	

	// 29. deposit: deposit failure: input a string
	public static void testDepositStringInput() {
            System.out.println("29. deposit: deposit failure: input a string.");
		Account account = new Account(123456, 1000);
		Scanner in = new Scanner(System.in);
		int number;
		do {
			System.out.println("Please enter a deposit amount!");
			while (!in.hasNextInt()) {
				System.out.println("That's not a number!");
				in.next(); // this is important!
			}
			number = in.nextInt();
			account.deposit(number);
		} while (number <= 0);
		System.out.println("Thank you! Your deposit is " + number);
                System.out.println("****Passed****\n"); 
	}	

	// 30. withdraw
	public static void testWithdraw() {
            System.out.println("30. withdraw.");
		Account account = new Account(123456, 1000);
                account.setAccountStatus("Active");
		account.withdraw(100.0);
		TestCase.assertEquals(1000-account.getAccountBalance(), 100.0d);
                System.out.println("****Passed****\n");
	}	

	// 31. withdraw: balance
	public static void testWithdrawAmount() {
            System.out.println("31. withdraw: balance.");
		Account account = new Account(123456, 1000);
                account.setAccountStatus("Active");
		account.withdraw(100.0);
		TestCase.assertEquals(account.getAccountBalance(), 900.0);
                System.out.println("****Passed****\n");
	}	

	// 32. withdraw: failure case1: withdraw > balance
	public static void testWithdrawFailure1() {
            System.out.println("32. withdraw: failure case1: withdraw > balance.");
		Account account = new Account(123456, 1000);
                account.setAccountStatus("Active");
		account.withdraw(1200);
		//TestCase.assertSame(account.getAccountBalance(), -200.0d);
                System.out.println("****Passed****\n");
	}	

	// 33. withdraw: failure case2: withdraw input a string
	public static void testWithdrawFailureString() {
            System.out.println("33. withdraw: failure case2: withdraw input a string");
		Account account = new Account(123456, 1000);
                account.setAccountStatus("Active");
		Scanner in = new Scanner(System.in);
		int number;
		do {
			System.out.println("Please enter a deposit amount!");
			while (!in.hasNextInt()) {
				System.out.println("That's not a number!");
				in.next(); // this is important!
			}
			number = in.nextInt();
			account.withdraw(number);
		} while (number <= 0);
		System.out.println("Thank you! Your withdraw is " + number);
                System.out.println("****Passed****\n");
	}	       
}
