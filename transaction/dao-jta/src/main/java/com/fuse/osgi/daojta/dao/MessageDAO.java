package com.fuse.osgi.daojta.dao;

import com.fuse.osgi.daojta.model.entities.MessageEntity;

public interface MessageDAO {

	public MessageEntity insert(MessageEntity entity) throws Exception;
	
	public MessageEntity update(MessageEntity entity) throws Exception;
	
	public void delete(MessageEntity entity) throws Exception;
}
