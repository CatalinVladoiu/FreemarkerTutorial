package org.freemarker.core.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.freemarker.core.dao.EntityJpaDao;
import org.freemarker.core.model.BaseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 */
@Transactional
@Repository
public class EntityJpaDaoImpl<T extends BaseEntity> implements EntityJpaDao<T> {

	@PersistenceContext
	protected EntityManager entityManager;

	protected Class<T> clazz;

	public void setClazz(final Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}

	public T findOne(final Long id) {
		return entityManager.find(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		List<T> resultList = entityManager.createQuery(
				"from " + clazz.getName()).getResultList();
		return resultList;
	}

	@Override
	@Transactional
	public Long save(final T entity) {
		entityManager.merge(entity);
		entityManager.flush();
		return entity.getId();
	}

	@Override
	@Transactional
	public void update(final T entity) {
		entityManager.merge(entity);
	}

	@Override
	@Transactional
	public void delete(final T entity) {
		entityManager.remove(entity);
	}

	@Override
	@Transactional
	public void deleteById(final Long entityId) {
		final T entity = findOne(entityId);
		delete(entity);
	}
}
