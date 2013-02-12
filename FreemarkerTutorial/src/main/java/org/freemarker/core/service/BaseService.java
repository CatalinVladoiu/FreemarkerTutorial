/**
 * 
 */
package org.freemarker.core.service;

import java.util.List;

import org.freemarker.core.model.BaseEntity;

/**
 * @param <T>
 */
public interface BaseService<T extends BaseEntity> {
	
	T findOne(final Long id);

	List<T> findAll();

	Long save(final T entity);

	void update(final T entity);

	void delete(final T entity);

	void deleteById(final Long entityId);

}
