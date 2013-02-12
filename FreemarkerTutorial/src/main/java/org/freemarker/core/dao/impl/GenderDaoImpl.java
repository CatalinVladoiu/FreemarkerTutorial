package org.freemarker.core.dao.impl;

import javax.persistence.Query;

import org.freemarker.core.dao.GenderDao;
import org.freemarker.core.model.Gender;
import org.springframework.stereotype.Repository;

/**
 * 
 */
@Repository
public class GenderDaoImpl extends EntityJpaDaoImpl<Gender> implements
		GenderDao {
	
	public GenderDaoImpl() {
		setClazz(Gender.class);
	}

	@Override
	public Gender findOneByValue(int value) {
		Query query = entityManager.createQuery("select g from " + clazz.getName() + " as g where g.genderValue = :genderValue");
		query.setParameter("genderValue", value);
		return (Gender) query.getSingleResult();
	}
	
}
