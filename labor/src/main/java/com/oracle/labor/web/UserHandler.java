package com.oracle.labor.web;

import java.util.Date;
import java.util.HashMap;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.oracle.labor.common.codetable.EducationallevelOperation;
import com.oracle.labor.common.codetable.IndustryOperation;
import com.oracle.labor.common.codetable.OrgtypeOperation;
import com.oracle.labor.common.codetable.RegtypeOperation;
import com.oracle.labor.common.codetable.SpecialtyOperation;
import com.oracle.labor.common.util.GenerateID;
import com.oracle.labor.po.Bip;
import com.oracle.labor.po.BipForeignlanguage;
import com.oracle.labor.po.BipSkill;
import com.oracle.labor.po.ZjGrqzdjb;
import com.oracle.labor.po.ZjGrqzdjjdb;
import com.oracle.labor.po.ZjGrqzgzb;
import com.oracle.labor.service.UserService;

@Controller
public class UserHandler {

	@Autowired
	UserService userService;
	
/*	@RequestMapping("/service/test/getUsers/{page}")
	public String getUsers(@PathVariable("page") Integer page,Map<String,Object> map) {
		
		PageInfo<LdlscUser> info=new PageInfo<LdlscUser>(userService.selectAll(page));
		map.put("pageInfo", info);
		return "service/test/userList";
	}*/
	
	@RequestMapping("/service/zj/save")
	public String save(Bip bip,@RequestParam(value="bipSZyjn",required=false)String[] skills,@RequestParam(value="bipSJsdj",required=false)String[] skillsGrade,@RequestParam(value="bipSYears",required=false)String[] skillsYear,@RequestParam(value="bip_fl_jywy",required=false)String[] languages,@RequestParam(value="bip_fl_slcd",required=false)String[] languageGrade,@RequestParam(value="init_wysm",required=false)String[] languageContext,ZjGrqzdjb register,
			@RequestParam("GZ")String[] kindOfWorks,@RequestParam("YGXS")String[] formOfWorks,@RequestParam("ZDYX")String[] lowestSalary,@RequestParam("ZGYX")String[] highestSalary) {
		List<ZjGrqzgzb> workList=new ArrayList<ZjGrqzgzb>();
		register.setSfdj("否");
		//鐢熸垚鐧昏鏃ユ湡
		Calendar c=Calendar.getInstance();
		c.setTime(new Date());
		StringBuffer sb=new StringBuffer();
		sb.append(c.get(Calendar.YEAR)).append(".").append(c.get(Calendar.MONTH)+1).append(".").append(c.get(Calendar.DATE));
		register.setDjsj(sb.toString());
		//鐢熸垚宸ョ搴忓垪
		for(int i=0;i<kindOfWorks.length;i++){
				ZjGrqzgzb work=new ZjGrqzgzb();
				work.setDjsj(sb.toString());
				work.setQzgzbh(GenerateID.getGenerateId());
				work.setYgxs(formOfWorks[i]);
				work.setGz(kindOfWorks[i]);
				work.setZdyx(lowestSalary[i]);
				work.setZgyx(highestSalary[i]);
				workList.add(work);
		}
		//鐢熸垚鐧昏鏈夋晥鏈�
		c.setTime(new Date(System.currentTimeMillis()+1000*60*60*24*15));
		StringBuffer sb1=new StringBuffer();
		sb1.append(c.get(Calendar.YEAR)).append(".").append(c.get(Calendar.MONTH)+1).append(".").append(c.get(Calendar.DATE));
		register.setDjyxq(sb1.toString()); 		
		register.setQzbh(GenerateID.getGenerateId());
		List<BipSkill> list=new ArrayList<BipSkill>();
		List<BipForeignlanguage> list1=new ArrayList<BipForeignlanguage>();
		Bip bip1=userService.getBipByCitizenid(bip.getBipCitizenid());
		//鏍规嵁韬唤璇佸彿寰楃櫥璁颁汉鐢熸棩
		String birth=bip.getBipCitizenid().substring(6, 14);
		bip.setBipBirthday(birth);
		String generateID=GenerateID.getGenerateId();
		bip.setBipId(generateID);
		//鏁版嵁搴撲腑鏈瓨鍦ㄥ皢瑕佹彃鍏ョ殑鐢ㄦ埛
		if(bip1==null){
			register.setBipId(bip.getBipId());
			if(skills!=null){
				for(int i=0;i<skills.length;i++){
					BipSkill bipSkill=new BipSkill();
					bipSkill.setBipSId(GenerateID.getGenerateId());
					bipSkill.setBipId(generateID);
					bipSkill.setBipSZyjn(skills[i]);
					bipSkill.setBipSJsdj(skillsGrade[i]);
					bipSkill.setBipSYears(skillsYear[i]);
					list.add(bipSkill);
				}
			}
			if(languages!=null){
				for(int i=0;i<languages.length;i++){
					BipForeignlanguage bipForeignlanguage=new BipForeignlanguage();
					bipForeignlanguage.setBipFlId(GenerateID.getGenerateId());
					bipForeignlanguage.setBipFlJywy(languages[i]);
					bipForeignlanguage.setBipFlWysm(languageContext[i]);
					bipForeignlanguage.setBipId(generateID);
					bipForeignlanguage.setBipFlSlcd(languageGrade[i]);
					list1.add(bipForeignlanguage);
				}
			}
			//鏁版嵁搴撲腑宸插瓨鍦ㄧ浉鍚岀殑姹傝亴鐧昏琛�
			if(userService.checkRegister(register)){
				List<ZjGrqzgzb> insertWork=new ArrayList<ZjGrqzgzb>();
	        	for(int i=0;i<workList.size();i++){
	        		if(!userService.checkKindOfWork(workList.get(i))){
	        			workList.get(i).setQzbh(userService.getRegisterId(register));
	        			insertWork.add(workList.get(i));
	        		}
	        	}
	            userService.saveWithWork(bip,list,list1,insertWork);
			}
			//鏁版嵁搴撲腑涓嶅瓨鍦ㄧ浉鍚岀殑姹傝亴鐧昏琛�
	        if(!userService.checkRegister(register)){
	        	for(int i=0;i<workList.size();i++){
	        		workList.get(i).setQzbh(register.getQzbh());
	        	}
	        	userService.saveWithRegisterAndWork(bip,list,list1,register,workList);
	        }
		}
		//鏁版嵁搴撲腑瀛樺湪鐩稿悓鐨勭敤鎴凤紝浣嗛儴鍒嗘暟鎹笉涓�鑷�
		if(bip1!=null&&!bip1.equals(bip)){
		    register.setBipId(bip.getBipId());
		    if(skills!=null){
		    	  for(int i=0;i<skills.length;i++){
						BipSkill bipSkill=new BipSkill();
						bipSkill.setBipSId(GenerateID.getGenerateId());
						bipSkill.setBipId(generateID);
						bipSkill.setBipSZyjn(skills[i]);
						bipSkill.setBipSJsdj(skillsGrade[i]);
						bipSkill.setBipSYears(skillsYear[i]);
						list.add(bipSkill);
					}
		    }
		    if(languages!=null){
		    	for(int i=0;i<languages.length;i++){
					BipForeignlanguage bipForeignlanguage=new BipForeignlanguage();
					bipForeignlanguage.setBipFlId(GenerateID.getGenerateId());
					bipForeignlanguage.setBipFlJywy(languages[i]);
					bipForeignlanguage.setBipFlWysm(languageContext[i]);
					bipForeignlanguage.setBipId(generateID);
					bipForeignlanguage.setBipFlSlcd(languageGrade[i]);
					list1.add(bipForeignlanguage);
				}
		    }
			//鏁版嵁搴撲腑宸插瓨鍦ㄧ浉鍚岀殑姹傝亴鐧昏琛�
            if(userService.checkRegister(register)){
            	List<ZjGrqzgzb> insertWork=new ArrayList<ZjGrqzgzb>();
	        	for(int i=0;i<workList.size();i++){
	        		if(!userService.checkKindOfWork(workList.get(i))){
	        			workList.get(i).setQzbh(userService.getRegisterId(register));
	        			insertWork.add(workList.get(i));
	        		}
	        	}
            	userService.deleteAndSaveWithWork(bip1.getBipId(),bip,list,list1,insertWork);
			}
            //鏁版嵁搴撲腑涓嶅瓨鍦ㄧ浉鍚岀殑姹傝亴鐧昏琛�
            if(!userService.checkRegister(register)){
            	for(int i=0;i<workList.size();i++){
	        		workList.get(i).setQzbh(register.getQzbh());
	        	}
            	userService.deleteAndSaveWithRegisterAndWork(bip1.getBipId(), bip,list,list1,register,workList);
            }
			
		}
		//鏁版嵁搴撳瓨鍦ㄧ浉鍚岀殑鐢ㄦ埛锛屼笖鍩烘湰鏁版嵁鐩稿悓
		if(bip1!=null&&bip1.equals(bip)){
			register.setBipId(bip1.getBipId());
		    if(skills!=null){
		    	for(int i=0;i<skills.length;i++){
					BipSkill bipSkill=new BipSkill();
					bipSkill.setBipSId(GenerateID.getGenerateId());
					bipSkill.setBipId(bip1.getBipId());
					bipSkill.setBipSZyjn(skills[i]);
					bipSkill.setBipSJsdj(skillsGrade[i]);
					bipSkill.setBipSYears(skillsYear[i]);
					list.add(bipSkill);
				}
		    }
		    if(languages!=null){
		    	for(int i=0;i<languages.length;i++){
					BipForeignlanguage bipForeignlanguage=new BipForeignlanguage();
					bipForeignlanguage.setBipFlId(GenerateID.getGenerateId());
					bipForeignlanguage.setBipFlJywy(languages[i]);
					bipForeignlanguage.setBipFlWysm(languageContext[i]);
					bipForeignlanguage.setBipId(bip1.getBipId());
					bipForeignlanguage.setBipFlSlcd(languageGrade[i]);
					list1.add(bipForeignlanguage);
				}
		    }
			//鏁版嵁搴撲腑宸插瓨鍦ㄧ浉鍚岀殑姹傝亴鐧昏琛�
			if(userService.checkRegister(register)){
				List<ZjGrqzgzb> insertWork=new ArrayList<ZjGrqzgzb>();
	        	for(int i=0;i<workList.size();i++){
	        		if(!userService.checkKindOfWork(workList.get(i))){
	        			workList.get(i).setQzbh(userService.getRegisterId(register));
	        			insertWork.add(workList.get(i));
	        		}
	        	}
	            userService.saveSkillsAndLanguageAndWork(list, list1, workList);;
			}
			//鏁版嵁搴撲腑涓嶅瓨鍦ㄧ浉鍚岀殑姹傝亴鐧昏琛�
	        if(!userService.checkRegister(register)){
	        	for(int i=0;i<workList.size();i++){
	        		workList.get(i).setQzbh(register.getQzbh());
	        	}
	            userService.saveSkillsAndLanguageAndRegisterAndWork(list, list1, register, workList);
	        }
		}
		return "redirect:../../successAddUserInfo.jsp";
	}
	@ResponseBody
	@RequestMapping("/service/zj/getBipByCitizenid/{citizenid}")
	public Bip getBipByCitizenid(@PathVariable("citizenid")String citizenid){
		Bip bip=userService.getBipByCitizenid(citizenid);
		if(bip==null){
			return new Bip();
		}
		return bip;
	}
	@RequestMapping("/service/zj/getBipForFreezeAndThaw")
	public String getBipForFreezeAndThaw(@RequestParam("bip_citizenid")String citizenId,Map<String,Object> map){
		Bip bip=userService.getBipByCitizenid(citizenId);
		List<ZjGrqzdjb> list=userService.getRegister(bip.getBipId());
		ZjGrqzdjb returnRegister=list.get(0);
		map.put("bip", bip);
		map.put("register", returnRegister);
		return "service/zj/grqz/qzdjjd_2";
	}
	@RequestMapping("/service/zj/getBipAndFreezeInfo/{citizenid}")
	public String getBipAndFreezeInfo(@PathVariable("citizenid")String citizenId,Map<String,Object>map){
		Bip bip=userService.getBipByCitizenid(citizenId);
		List<ZjGrqzdjb> list=userService.getRegister(bip.getBipId());
		ZjGrqzdjjdb freezeTable=userService.getFreezeTableByRegisterId(list.get(0).getQzbh());
		map.put("bip", bip);
		map.put("freezeTable",freezeTable);
		return "service/zj/grqz/qzdjjd_3";
	}
	@RequestMapping("/service/zj/FreezeOrThaw")
	public String freezeOrThaw(@RequestParam("bipid")String bipId,@RequestParam("freezeReason")String reason,@RequestParam("operation")String operation){
		if(operation.equals("1")){
			userService.Thaw(bipId, reason);
		}else{
			userService.Freeze(bipId, reason);
		}
		return "redirect:../../successFrezeeOrThaw.jsp";
	}
	@RequestMapping("/service/zj/getBipForPensonalRecommend")
	public String getBipForPensonalRecommend(@RequestParam("citizenid")String citizenId,Map<String,Object> map){
		Bip bip=userService.getBipByCitizenid(citizenId);
		List<ZjGrqzdjb> list=userService.getRegister(bip.getBipId());
		map.put("bip", bip);
		map.put("register", list.get(0));
		return "service/zj/tjhz/grtj_tjpp_1";
	}
	@RequestMapping("/service/zj/goToChooseUnit")
	public String goToChooseUnit(@RequestParam("citizenId")String citizenId,Map<String,Object>map){
		Map<String,String> workInfo=new HashMap<String,String>();
		Bip bip=userService.getBipByCitizenid(citizenId);
		String educationLevel=EducationallevelOperation.getOption(bip.getBipWhcd());
		List<ZjGrqzdjb> list=userService.getRegister(bip.getBipId());
		List<ZjGrqzgzb> work=userService.getWorkByRegisterId(list.get(0).getQzbh());
		for(int i=0;i<work.size();i++){
			workInfo.put(work.get(i).getQzgzbh(), SpecialtyOperation.getNameById(work.get(i).getGz()));
		}
		String regtype=RegtypeOperation.getOption(list.get(0).getDwjjlx());
		String industry=IndustryOperation.getOption(list.get(0).getDwhy());
		String orgtype=OrgtypeOperation.getOption(list.get(0).getDwxx());
		map.put("bip", bip);
		map.put("educationLevel",educationLevel);
		map.put("regtype", regtype);
		map.put("industry", industry);
		map.put("orgtype", orgtype);
		map.put("workInfo", workInfo);
		return "service/zj/tjhz/grtj_tjpp_2";
	}
	/*@RequestMapping("/service/zj/selectInfoForFile")
	public String selectInfoForFile(Bip bip,ZjGrqzdjb register,Map<String,Object>map){
		//鏈緭鍏ョ敤鎴蜂俊鎭繘琛屾煡璇�
		if(bip==null){
			
		}
	}*/
}
