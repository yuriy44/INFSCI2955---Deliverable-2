/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwaretest2;

import java.util.*;
import junit.framework.*;

/**
 *
 * @author jx
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
	// 1. get pin number
	AccountTest.testGetPinNumberInt();
        
        // 2. getPinNumber_stubbing, this one can be set as a stubbing test.
        AccountTest.testGetPinNumberStub();
        
        //3. setPinNumber, String,
        AccountTest.testSetPinNumberString();
        
        // 4. setPinNumber, double,
        AccountTest.testSetPinNumberDoulbe();
        
        // 5. setPinNumber, int
        AccountTest.testSetPinNumberInt();
        
        // 6. newUser: using MOCK
        AccountTest.testNewUser();
        
        // 7. getaccountOwners: stubbing and mock
        AccountTest.getaccountOwnersStub();  

	// 8. getaccountOwners: mock
	AccountTest.getaccountOwnersMock();
        
        //9. setAccountOwners
        AccountTest.setAccountOwners();
        
        //10. setAccountOwners: mock
        AccountTest.setAccountOwnersMock();

       // 11. getAccountStatus
        AccountTest.testgetAccountStatus();



        // 12. getAccountStatus Stubbing

        AccountTest.testgetAccountStatusStub();



        // 13. setAccountStatus: active
        AccountTest.testSetAccountStatus();




        // 14. setAccountStatus: inactive
        AccountTest.testSetAccountStatus2();

  



        // 15. setAccountStatus: active--failure with number
        //AccountTest.testSetAccountStatusNumber();



        // 16. setAccountStatus: active--failure with another string
        //AccountTest.testSetAccountStatusFailure2();  




        // 17. getAccountNumber
        AccountTest.testgetAccountNumber();




        // 18. getAccountType: saving
        AccountTest.testGetAccountTypeSaving();



        // 19. getAccountType: checking
        AccountTest.testGetAccountTypeChecking();   
        
        // 20. getAccountType: failure
        /** failure
        *Exception in thread "main" 
        * junit.framework.ComparisonFailure:
        * expected:<null> but was:<Failure> 
        */
        //AccountTest.getAccountTypeFailure();
        
        // 21. getAccountBalance
        //Exception in thread "main" 
        //junit.framework.AssertionFailedError: 
        //expected:<0.0> but was:<1000.0> 
        //AccountTest.testgetAccountBalance();
        
        // 22. Account constructor 1
        //Exception in thread "main" junit.framework.AssertionFailedError: 
        //expected:<0.0> but was:<1000.0>
        //AccountTest.testAccountConstructor1();

	// 23. Account constructor 2
	AccountTest.testAccountConstructor2();

	// 24. Account constructor 3
	AccountTest.testAccountConstructor3();

	// 25. Account constructor failure: 3 parameters
        AccountTest.testAccountConstructorFailure();

	// 26. Account constructor failure: balance: string
        AccountTest.testAccountConstructorFailure2();

        // 27. deposit: deposit amount
	AccountTest.testAccountDeposit();
        
        // 28. deposit: deposit balance
	AccountTest.testAccountDepoitBalance();

	// 29. deposit: deposit failure: input a string
	AccountTest.testDepositStringInput();

	// 30. withdraw
	AccountTest.testWithdraw();

	// 31. withdraw: balance
	AccountTest.testWithdrawAmount();

	// 32. withdraw: failure case1: withdraw > balance
	AccountTest.testWithdrawFailure1();

	// 33. withdraw: failure case2: withdraw input a string
        AccountTest.testWithdrawFailureString();
        
    }
    
}
