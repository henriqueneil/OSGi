package com.fuse.osgi.daojta.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.fuse.osgi.daojta.dao.MessageDAO;
import com.fuse.osgi.daojta.model.entities.MessageEntity;

public class MessageDAOImpl implements MessageDAO {
	
	private static final Logger LOGGER = Logger.getLogger(MessageDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public MessageEntity insert(MessageEntity entity) throws Exception {
		
		LOGGER.debug("Insert message...");
		try {
			
			Object object = entityManager.merge(entity);
			entityManager.flush();
			return (MessageEntity)object;
		} catch(Exception exception) {
			LOGGER.error(exception);
			throw exception;
		} finally {
			LOGGER.debug("Message inserted...");
		}
	}

	@Override
	public MessageEntity update(MessageEntity entity) throws Exception {
		
		LOGGER.debug("Update message...");
		try {
			
			Object object = entityManager.merge(entity);
			entityManager.flush();
			return (MessageEntity)object;
		} catch(Exception exception) {
			LOGGER.error(exception);
			throw exception;
		} finally {
			LOGGER.debug("Message updated...");
		}
	}

	@Override
	public void delete(MessageEntity entity) throws Exception {
		
		LOGGER.debug("Delete message...");
		try {
			
			entity = entityManager.find(MessageEntity.class, entity.getId());
			entityManager.remove(entity);
			entityManager.flush();
		} catch(Exception exception) {
			LOGGER.error(exception);
			throw exception;
		} finally {
			LOGGER.debug("Message deleted...");
		}
	}

}
