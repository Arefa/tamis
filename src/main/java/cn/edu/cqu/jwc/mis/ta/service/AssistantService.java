package cn.edu.cqu.jwc.mis.ta.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import cn.edu.cqu.jwc.mis.ta.model.Attachment2;

public interface AssistantService {

	public void saveAttachment2(Attachment2 attachment2) throws DataAccessException;

	public List<Attachment2> findAttachment2s() throws DataAccessException;
	
	public Attachment2 findA2ById(Integer id) throws DataAccessException;
	
	
}
