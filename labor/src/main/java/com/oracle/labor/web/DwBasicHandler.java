package com.oracle.labor.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.labor.common.codetable.ComputergradeOperation;
import com.oracle.labor.common.codetable.EducationallevelOperation;
import com.oracle.labor.common.codetable.EmploytypeOperation;
import com.oracle.labor.common.codetable.HealthstateOperation;
import com.oracle.labor.common.codetable.IndustryOperation;
import com.oracle.labor.common.codetable.LanguageOperation;
import com.oracle.labor.common.codetable.MarriageOperation;
import com.oracle.labor.common.codetable.OrgtypeOperation;
import com.oracle.labor.common.codetable.PersonneltypeOperation;
import com.oracle.labor.common.codetable.ProficiencyOperation;
import com.oracle.labor.common.codetable.RegioncodeOperation;
import com.oracle.labor.common.codetable.RegtypeOperation;
import com.oracle.labor.common.codetable.RprtypeOperation;
import com.oracle.labor.common.codetable.SpecialtyOperation;
import com.oracle.labor.common.codetable.ZjdgwlbOperation;
import com.oracle.labor.po.Bio;
import com.oracle.labor.po.ZjDwzpdjb;
import com.oracle.labor.service.DwBasicService;

@Controller
public class DwBasicHandler {
	@Autowired
	DwBasicService dwdjService;

	
	//dwdj2--------------------------------------------------------------------------------------
	/**
	 * 获得单位性质的下拉列表 ;
	 */
	@ResponseBody
	@RequestMapping(value = "/service/orgtype/{value}", produces = "text/html;charset=UTF-8")
	public String getOrgtype(@PathVariable("value") String value) {
		return OrgtypeOperation.getOption(value);
	}

	/**
	 * 获得经济类型的下拉列表 ;
	 */
	@ResponseBody
	@RequestMapping(value = "/service/regtype/{value}", produces = "text/html;charset=UTF-8")
	public String getRegtype(@PathVariable("value") String value) {
		return RegtypeOperation.getOption(value);
	}

	/**
	 * 获得单位行业的下拉列表 ;
	 */
	@ResponseBody
	@RequestMapping(value = "/service/industry/{value}", produces = "text/html;charset=UTF-8")
	public String getIndustry(@PathVariable("value") String value) {
		return IndustryOperation.getOption(value);
	}

	/**
	 * 获得dwdj_2.jsp地址的下拉列表 ;
	 */
	@ResponseBody
	@RequestMapping(value = "/service/regioncode/{region}/{selectedId}", produces = "text/html;charset=UTF-8")
	public String getRegioncode(@PathVariable("selectedId") String selectedId, @PathVariable("region") String region) {

		return RegioncodeOperation.getSelectedRegion(selectedId, region);
	}

	/**
	 * 存单位登记信息到bio表
	 */
	/*@RequestMapping("/service/zj/dwzp/dwdjSave")
	public void dwdj2save(Bio bio) {
		dwdjService.save(bio);
	}*/
	
	//dwdj_3--------------------------------------------------------------------------------------
	/**
	 * 获得岗位类别下拉列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/service/getgzlb", produces = "text/html;charset=UTF-8")
	public String getgwlb() {
		return ZjdgwlbOperation.getOption();
	}
	
	/**
	 * 获得户籍性质下拉列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/service/gethjxz", produces = "text/html;charset=UTF-8")
	public String gethjxz() {
		return RprtypeOperation.getOption();
	}
	
	/**
	 * 获得文化程度下拉列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/service/getwhcd", produces = "text/html;charset=UTF-8")
	public String getwhcd() {
		return EducationallevelOperation.getOption();
	}
	/**
	 * 获得用工形式下拉列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/service/getygxs", produces = "text/html;charset=UTF-8")
	public String getygxs() {
		return EmploytypeOperation.getOption();
	}
	/**
	 * 获得婚姻状况下拉列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/service/gethyzk", produces = "text/html;charset=UTF-8")
	public String gethyzk() {
		return MarriageOperation.getOption();
	}

	/**
	 * 获得健康状况下拉列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/service/getjkzk", produces = "text/html;charset=UTF-8")
	public String getjkzk() {
		return HealthstateOperation.getOption();
	}

	/**
	 * 获得人员类别下拉列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/service/getrylb", produces = "text/html;charset=UTF-8")
	public String getrylb() {
		return PersonneltypeOperation.getOption();
	}

	/**
	 * 获得招聘地区下拉列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/service/getzpdq", produces = "text/html;charset=UTF-8")
	public String getzpdq() {
		return RegioncodeOperation.getProvince();
	}
	/**
	 * 获得计算机等级下拉列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/service/getjsjdj", produces = "text/html;charset=UTF-8")
	public String getjsjdj() {
		return ComputergradeOperation.getOption();
	}
	/**
	 * 获得熟练程度下拉列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/service/getslcd", produces = "text/html;charset=UTF-8")
	public String getslcd() {
		return ProficiencyOperation.getOption();
	}
	/**
	 * 获得具有外语下拉列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/service/getjyyz", produces = "text/html;charset=UTF-8")
	public String getjyyz() {
		return LanguageOperation.getOption();
	}
	
	/**
	 * dwdj_3save
	 * @return 
	 */
	@RequestMapping("/service/zj/dwzp/dwdj3save")
	public String djdw3save(Bio bio,ZjDwzpdjb zjdwzpdjb) {
		dwdjService.dwdj2Save(bio);
		dwdjService.dwdj3Save(zjdwzpdjb);
		return "zj/dwzp/NewFile";
	}
		//choosegz_ModalDialog_qyc.sp-------------------------------------------------------------	
		/**
		 * gw、gz123
		 */
		@ResponseBody
		@RequestMapping (value = "/common/gz/{gz}/{selectedId}", produces = "text/html;charset=UTF-8")
		public String getgw(@PathVariable("selectedId") String selectedId, @PathVariable("gz") String gz) {
			String string= SpecialtyOperation .getSelectedGz(selectedId, gz);
			return string;
		}
	
		/**
		 * 获得工种名称
		 */
		@RequestMapping(value = "/common/gzmc/", produces = "text/html;charset=UTF-8")
		@ResponseBody
		public String getGzName(String gzdm) {
			return SpecialtyOperation.getNameById(gzdm);
		}
			
			
		
	//dwdj_dj_1--------------------------------------------------------------------------------------
	/**
	 * 查看单位法人码是否存在
	 */
	@RequestMapping("/service/selectBioNameByNo/")
	@ResponseBody
	public 	String selectBioNameByNo(String bioNo) {
		System.out.println("**************" + bioNo);
		String bioName = dwdjService.selectBioNameByNo(bioNo);
		System.out.println("-------------------" + bioName);
		
		return bioName;
	}

}
