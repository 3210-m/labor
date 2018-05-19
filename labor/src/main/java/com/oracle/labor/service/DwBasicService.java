package com.oracle.labor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.labor.dao.BioMapper;
import com.oracle.labor.dao.ZjDwzpdjbMapper;
import com.oracle.labor.po.Bio;
import com.oracle.labor.po.ZjDwzpdjb;
@Service
public class DwBasicService {

	@Autowired
	BioMapper bioDao;
	
	@Autowired
	ZjDwzpdjbMapper zjdwzpdjbDao;
	
	/**
	 * 保存dwdj2的内容到bio
	 * @param record
	 */
	@Transactional
	public void dwdj2Save(Bio record) {
		bioDao.insert(record);
	}
	/**
	 * 保存dwdj3的内容到ZjDwzpdjb
	 * @return
	 */
	@Transactional
	public void dwdj3Save(ZjDwzpdjb zj) {
		zjdwzpdjbDao.insert(zj);
	}
	
	@Transactional(readOnly = true)
	public String selectBioNameByNo(String bioNo) {
		return bioDao.selectBioNameByNo(bioNo);
		
	}
}
