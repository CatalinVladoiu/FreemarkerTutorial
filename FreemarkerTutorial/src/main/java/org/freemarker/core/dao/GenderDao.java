package org.freemarker.core.dao;

import org.freemarker.core.model.Gender;

public interface GenderDao extends EntityJpaDao<Gender> {
	Gender findOneByValue(final int id);
}
