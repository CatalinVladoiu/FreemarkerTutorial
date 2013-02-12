package org.freemarker.core.dao.impl;

import org.freemarker.core.dao.ContactDao;
import org.freemarker.core.model.Contact;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDaoImpl extends EntityJpaDaoImpl<Contact> implements
		ContactDao {

	public ContactDaoImpl() {
		setClazz(Contact.class);
	}
}
