package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactServiceTest {

	@Test
	public void testMethodAdd() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("13", "Bruce", "Wayne", "123456", "Bat Cave");
		assertEquals(true, contactService.add(contact));
		assertEquals(false, contactService.add(contact));
	}

	@Test
	public void testMethodDelete() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("13", "Bruce", "Wayne", "123456", "Bat Cave");
		assertEquals(true, contactService.add(contact));
		assertEquals(true, contactService.delete("13"));
		assertEquals(false, contactService.delete("13"));
	}

	@Test
	public void testUpdateMethod() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("13", "Bruce", "Wayne", "123456", "Bat Cave");
		assertEquals(true, contactService.add(contact));
		assertEquals(true, contactService.update("13", "Harley", "Quinn", "", ""));
		assertEquals(true, contactService.update("13", "Harley", "Quinn", "123678", "Streets"));
		assertEquals(false, contactService.update("20", "Harley", "Quinn", "", ""));
	}
}
