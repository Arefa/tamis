package cn.edu.cqu.jwc.mis.ta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.cqu.jwc.mis.ta.model.Attachment2;
import cn.edu.cqu.jwc.mis.ta.repository.springdatajpa.Attachment2Repository;

@Service
public class AssistantServiceImpl implements AssistantService {

	private Attachment2Repository attachment2Repository;
	
	@Autowired
	public AssistantServiceImpl(Attachment2Repository attachment2Repository){
		this.attachment2Repository = attachment2Repository;
	}
	
	@Override
	@Transactional
	public void saveAttachment2(Attachment2 attachment2)
			throws DataAccessException {
		attachment2Repository.save(attachment2);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Attachment2> findAttachment2s() throws DataAccessException {
		return attachment2Repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Attachment2 findA2ById(Integer id) throws DataAccessException {
		return attachment2Repository.findOne(id);
	}

}
