/**
 * 
 */
package org.freemarker.core.service.impl;

import java.util.List;

import org.freemarker.core.dao.EntityJpaDao;
import org.freemarker.core.model.BaseEntity;
import org.freemarker.core.service.BaseService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @param <T>
 */
@Transactional
public class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {

	protected EntityJpaDao<T> entityJpaDao;

	@Override
	public T findOne(Long id) {
		return entityJpaDao.findOne(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<T> findAll() {
		return entityJpaDao.findAll();
	}

	@Override
	@Transactional
	public Long save(T entity) {
		return entityJpaDao.save(entity);
	}

	@Override
	@Transactional
	public void update(T entity) {
		entityJpaDao.update(entity);
	}

	@Override
	@Transactional
	public void delete(T entity) {
		entityJpaDao.delete(entity);
	}

	@Override
	@Transactional
	public void deleteById(Long entityId) {
		entityJpaDao.deleteById(entityId);
	}
}
