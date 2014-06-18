/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwaretest2;

/**
 *
 * @author jx
 */
public class User {
   //set string class, and we should be removed the setter, since the userID has been set up, the ID can not be changed 
    private String userID;  
    //set string variable last name 
    private String lastName; 
   //set string variable middle initial 
    private String middleInitial; 
   //set string first name
     private String firstName;
   //set string date of birth 
     private String dateOfBirth; 
    //set string userType，userType should be removed setter, user can not determine his or her own type, it should let the bank the to decide 
     private String userType; 
   //set string the social security number 
     private String socialSecurityNumber; 
   //Set userAddress as private 
     private String accountType;
     public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	private static Address userAddress=new Address("Melwood Avenue","","Pittsburgh","PA","15213");
    
   /*set a getter for UserAddress
    * @return userAddress
    */
     public static Address getUserAddress() {
 		return userAddress;
 	}
    /*
     * set a setter for userAddress 
     */
 	public void setUserAddress(Address userAddress) {
 		User.userAddress = userAddress;
 	}
     
     //get string user id 
     public String getUserID(){
    	 return userID;  
     }
   //get last name 
     public String getLastName(){
    	 return lastName;  
     }
   //set last name 
     public void setLastName(String lastName){
    	 this.lastName=lastName;  
     }
   //get middle initial 
     public String getMiddleInitial(){
    	 return middleInitial;  
     }
   //set middle initial 
     public void setMidlleInitial(String middleInitial){
    	 this.middleInitial=middleInitial;  
     }
   //get the first name 
     public String getFirstName(){
    	 return firstName;   
     }
   //set the first name
     public void setFirstName(String firstName){
    	 this.firstName=firstName;   
     }
   //get the date of birth 
     public String getDateOfBirth(){
    	 return dateOfBirth;  
     }
   //set the date of birth 
     public void setDateOfBirth(String dateOfBirth){
    	 this.dateOfBirth=dateOfBirth; 
     }
   //set user type 
     public String setUserTyper(String string){
    	 return userType;
     }       
   //get social security number 
     public String getSocialSecurityNumber(){
    	 return socialSecurityNumber;
     }   
   //set social security number 
     public void setSocialSecurityNumber(String socialSecurityNumber){
    	 this.socialSecurityNumber=socialSecurityNumber;
     }    
     //set the constructor of user and have 4 string types of parameter and set the parameter as last name, middle initial, first name, date of birth, address,usertype, social security number 
     public User(){
     this.lastName="";
     this.middleInitial="";
     this.firstName="";
     this.dateOfBirth="";
     this.userType="";
     this.socialSecurityNumber="";
     }
	
}
