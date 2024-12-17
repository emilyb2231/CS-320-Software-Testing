 package ContactService;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ContactService.ContactService;

class ContactTest{

	/*Test constructor*/
	@DisplayName("Test a valid Constructor")
	@Test
	public void testGoodConstructor() {
        String contactId = "1";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);
        
		assertEquals(1, testContact.getContactID());
		assertEquals(firstName, testContact.getFirstName());
		assertEquals(lastName, testContact.getLastName());
		assertEquals(phoneNumber, testContact.getPhoneNumber());
		assertEquals(address, testContact.getAddress());
	}
	
	/*Test a constructor with an incorrect phone number length*/
	@DisplayName("Test an invalid Constructor")
	@Test
	public void testBadConstructor() {
        String contactId = "2";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1";
        String address = "123 New Address";       
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
	/*Test the setFirstName with good input*/
	@DisplayName("Test a valid setFirstName")
	@Test
	public void testGoodSetFirst() {
        String contactId = "3";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setFirstName("Test");        
        assertEquals("Test", testContact.getFirstName());
	}
	
	/*Test setFirstName with a null string*/
	@DisplayName("Test an invalid null setFirstName")
	@Test
	public void testBadSetFirst() {
        String contactId = "3";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName(null);
        });
	}
	
	/*Test the setFirstName with length too great*/
	@DisplayName("Test an invalid length setFirstName")
	@Test
	public void testLongSetFirst() {
        String contactId = "3";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName("FirstNameIsWayTooLong");
        });
	}
	
	/*Test getID by using a good constructor and test if int is returned*/
	@DisplayName("Test getID")
	@Test
	public void testGetID() {
        String contactId = "3";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertEquals(3, testContact.getContactID());
	}
	
	/*Test getID by using a good constructor test that string is not returned*/
	@DisplayName("Test bad getID")
	@Test
	public void testBadGetID() {
        String contactId = "3";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertNotEquals("3", testContact.getContactID());
	}
	
	/*Test getID by using too long of an ID*/
	@DisplayName("Test too long getID")
	@Test
	public void testlongGetID() {
        String contactId = "12345678910123456";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
	/*Test setLastName with a null string*/
	@DisplayName("Test an invalid null setLastName")
	@Test
	public void testBadSetLast() {
        String contactId = "3";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName(null);
        });
	}
	
	/*Test the setLastName with length too long*/
	@DisplayName("Test an invalid length setLastName")
	@Test
	public void testLongSetLast() {
        String contactId = "3";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName("LastNameIsWayTooLong");
        });
	}
	
	/*Test the setLastName with good input*/
	@DisplayName("Test a valid setLastName")
	@Test
	public void testGoodsetLast() {
        String contactId = "3";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setLastName("Test");        
        assertEquals("Test", testContact.getLastName());
	}
	
	/*Test setPhoneNumber with a null string*/
	@DisplayName("Test an invalid null setPhoneNumber")
	@Test
	public void testBadSetPhone() {
        String contactId = "3";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber(null);
        });
        
	}
	
	/*Test the setPhone with length not equal to 10*/
	@DisplayName("Test an invalid length setPhoneNumber")
	@Test
	public void testWrongLengthPhone() {
        String contactId = "3";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("1");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("1234567891012345678910");
        });
	}
	/*Test the setPhone with length equal to 10*/
	@DisplayName("Test a valid length setPhoneNumber")
	@Test
	public void testGoodPhone() {
        String contactId = "3";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setPhoneNumber("1987654321");        
        assertEquals("1987654321", testContact.getPhoneNumber());

	}
	
	/*Test setAddress with a null string*/
	@DisplayName("Test an invalid null setAddress")
	@Test
	public void testNullSetAddress() {
        String contactId = "3";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress(null);
        });
        
	}
	
	/*Test the setAddress with length > 30*/
	@DisplayName("Test an invalid length setPhoneNumber")
	@Test
	public void testWrongLengthAddress() {
        String contactId = "3";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress("123456789 Address Toooooo Looooooooong Streeeeeet");
        });
	}
	/*Test the setAddress with good input*/
	@DisplayName("Test a valid length setAddress")
	@Test
	public void testGoodAddress() {
        String contactId = "3";
      	String firstName = "Mary";
        String lastName = "Smith";
        String phoneNumber = "1234567891";
        String address = "123 New Address";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setAddress("987 Good Address");        
        assertEquals("987 Good Address", testContact.getAddress());

	}
	
}