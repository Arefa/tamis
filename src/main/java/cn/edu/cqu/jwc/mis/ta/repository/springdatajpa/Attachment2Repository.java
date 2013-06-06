package cn.edu.cqu.jwc.mis.ta.repository.springdatajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cn.edu.cqu.jwc.mis.ta.model.Attachment2;


public interface Attachment2Repository extends CrudRepository<Attachment2, Integer> {

	public List<Attachment2> findAll();
}
