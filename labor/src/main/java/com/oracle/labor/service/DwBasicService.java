package com.oracle.labor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.labor.dao.BioMapper;
import com.oracle.labor.dao.ZjDwzpdjbMapper;
import com.oracle.labor.dao.ZjDwzpgzbMapper;
import com.oracle.labor.po.Bio;
import com.oracle.labor.po.ZjDwzpdjb;
import com.oracle.labor.po.ZjDwzpgzb;
@Service
public class DwBasicService {

	@Autowired
	BioMapper bioDao;
	
	@Autowired
	ZjDwzpdjbMapper zjdwzpdjbDao;
	
	@Autowired
	ZjDwzpgzbMapper zjdwzpgzbDao;
	/**
	 * 保存dwdj2的内容到bio
	 * @param record
	 */
	@Transactional
	public String dwdj2Save(Bio record) {
		 bioDao.insert(record);
		return record.getBioId();
	}
	
	/**
	 * @return 
	 * 
	 */
	public String dwgzbSave(ZjDwzpdjb zjdwzpdjb) {
		zjdwzpdjbDao.insert(zjdwzpdjb);
		System.out.println("-----------到这儿了------------------");
		return zjdwzpdjb.getZpbh();
	}
	/**
	 * 保存dwdj3的内容到ZjDwzpdjb
	 * @return
	 */
	@Transactional
	public void dwdj3Save(ZjDwzpgzb zj) {
		zjdwzpgzbDao.insert(zj);
	}
	
	@Transactional(readOnly = true)
	public String selectBioNameByNo(String bioNo) {
		return bioDao.selectBioNameByNo(bioNo);
		
	}
}
