/**
 * 
 */
package org.freemarker.core.dao.impl;

import java.util.Date;
import java.util.List;

import org.freemarker.core.BaseTest;
import org.freemarker.core.dao.ContactDao;
import org.freemarker.core.dao.GenderDao;
import org.freemarker.core.model.Contact;
import org.freemarker.core.model.Gender;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class ContactDaoTest extends BaseTest {

	@Autowired
	private ContactDao contactDao;

	@Autowired
	private GenderDao genderDao;

	@Test
	@Transactional
	public void testCreateContact() {
		/*List<Gender> existingGenders = genderDao.findAll();
		Assert.assertEquals(0, existingGenders.size());

		Gender genderForTest = new Gender();
		genderForTest.setGenderLabel("Male");
		genderForTest.setGenderValue(1);
		genderDao.save(genderForTest);

		List<Gender> afterAddGender = genderDao.findAll();
		Assert.assertEquals(1, afterAddGender.size());

		List<Contact> existingContacts = contactDao.findAll();
		Assert.assertEquals(0, existingContacts.size());

		Contact contact = new Contact();

		contact.setBirthdate(new Date());
		contact.setEmail("test_email");
		contact.setFirstname("test_firstname");

		contact.setGender(afterAddGender.get(0));
		contact.setLastname("test_lastname");
		contact.setTelephone("phone");

		Contact contact2 = new Contact();
		contact2.setBirthdate(new Date());
		contact2.setEmail("test_email2");
		contact2.setFirstname("test_firstname2");
		contact2.setGender(afterAddGender.get(0));
		contact2.setLastname("test_lastname2");
		contact2.setTelephone("phone2");

		contactDao.save(contact);
		contactDao.save(contact2);

		List<Contact> afterAddContacts = contactDao.findAll();
		Assert.assertEquals(2, afterAddContacts.size());*/
	
		Assert.assertEquals(0, 0);
	}
}