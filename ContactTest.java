package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact("42", "Dale", "Cooper", "123", "Twin Peaks");
		assertTrue(contact.getId().equals("42"));
		assertTrue(contact.getFirstName().equals("Dale"));
		assertTrue(contact.getLastName().equals("Cooper"));
		assertTrue(contact.getPhone().equals("123"));
		assertTrue(contact.getAddress().equals("Twin Peaks"));
	}

	@Test
	void testContactClassIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("11111111111", "Dale", "Cooper", "123", "Twin Peaks");
		});
	}

	@Test
	void testContactClassFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("42", "Daleeeeeeee", "Cooper", "123", "Twin Peaks");
		});
	}

	@Test
	void testContactClassLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("42", "Dale", "Cooperrrrrr", "123", "Twin Peaks");
		});
	}

	@Test
	void testContactClassPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("42", "Dale", "Cooper", "12345678910", "Twin Peaks");
		});
	}

	@Test
	void testContactClassAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("42", "Dale", "Cooper", "123", "Twin Peakssssssssssssssssssssss");
		});
	}

	@Test
	void testContactClassIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Dale", "Cooper", "123", "Twin Peaks");
		});
	}

	@Test
	void testContactClassFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("42", null, "Cooper", "123", "Twin Peaks");
		});
	}

	@Test
	void testContactClassLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("42", "Dale", null, "123", "Twin Peaks");
		});
	}

	@Test
	void testContactClassPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("42", "Dale", "Cooper", null, "Twin Peaks");
		});
	}

	@Test
	void testContactClassAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("42", "Dale", "Cooper", "123", null);
		});
	}

}
