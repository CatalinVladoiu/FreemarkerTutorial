package org.freemarker.core.service.impl;

import org.freemarker.core.dao.EntityJpaDao;
import org.freemarker.core.dao.GenderDao;
import org.freemarker.core.model.Contact;
import org.freemarker.core.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl extends BaseServiceImpl<Contact> implements
		ContactService {

	private static final Logger logger = LoggerFactory
			.getLogger(ContactServiceImpl.class);

	@Autowired
	@Qualifier("contactDaoImpl")
	public void setEntityJpaDao(EntityJpaDao<Contact> entityJpaDao) {
		this.entityJpaDao = entityJpaDao;
	}

	@Autowired
	private GenderDao genderDao;

	public Long save(Contact contact) {
		logger.info("save contact");
		if (genderDao.findOneByValue(contact.getGender().getGenderValue()) == null) {
			logger.info("is null");
		}
		return entityJpaDao.save(contact);
	}

}
