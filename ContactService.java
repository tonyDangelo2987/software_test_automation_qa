package contact;

import java.util.ArrayList;

public class ContactService {
	private ArrayList<Contact> contacts;

	public ContactService() {
		contacts = new ArrayList<>();
	}

	public boolean add(Contact contact) {
		boolean contactExists = false;

		for (Contact c : contacts) {
			if (c.equals(contact)) {
				contactExists = true;
			}
		}

		if (!contactExists) {
			contacts.add(contact);
			System.out.println("Contact added");
			return true;
		} else {
			System.out.println("Contact already exists");
			return false;
		}
	}

	public boolean delete(String id) {
		for (Contact c : contacts) {
			if (c.getId().equals(id)) {
				contacts.remove(c);
				System.out.println("Contact deleted");
				return true;
			}
		}
		System.out.println("Contact does not exist");
		return false;
	}

	public boolean update(String id, String firstName, String lastName, String phone, String address) {
		for (Contact c : contacts) {
			if (c.getId().equals(id)) {
				if (!firstName.equals(""))
					c.setFirstName(firstName);
				if (!lastName.equals(""))
					c.setLastName(lastName);
				if (!phone.equals(""))
					c.setPhone(phone);
				if (!address.equals(""))
					c.setAddress(address);
				System.out.println("Contact updated");
				return true;
			}
		}
		System.out.println("Contact does not exist");
		return false;
	}
}
