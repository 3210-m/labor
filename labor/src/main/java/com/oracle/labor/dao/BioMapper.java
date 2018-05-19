package com.oracle.labor.dao;

import com.oracle.labor.po.Bio;
import com.oracle.labor.po.BioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BioMapper {
    long countByExample(BioExample example);

    int deleteByExample(BioExample example);

    int deleteByPrimaryKey(String bioId);

    int insert(Bio record);

    int insertSelective(Bio record);

    List<Bio> selectByExample(BioExample example);

    Bio selectByPrimaryKey(String bioId);

    int updateByExampleSelective(@Param("record") Bio record, @Param("example") BioExample example);

    int updateByExample(@Param("record") Bio record, @Param("example") BioExample example);

    int updateByPrimaryKeySelective(Bio record);

    int updateByPrimaryKey(Bio record);
    String selectBioNameByNo(String bioNo);
}