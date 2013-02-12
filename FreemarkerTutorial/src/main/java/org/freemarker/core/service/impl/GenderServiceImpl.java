/**
 * 
 */
package org.freemarker.core.service.impl;

import org.freemarker.core.dao.EntityJpaDao;
import org.freemarker.core.model.Gender;
import org.freemarker.core.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class GenderServiceImpl extends BaseServiceImpl<Gender> implements
		GenderService {

	@Autowired
	@Qualifier("genderDaoImpl")
	public void setEntityJpaDao(EntityJpaDao<Gender> entityJpaDao) {
		this.entityJpaDao = entityJpaDao;
	}
}
