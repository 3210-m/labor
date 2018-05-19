package com.oracle.labor.dao;

import com.oracle.labor.po.ZjDwdjjdb;
import com.oracle.labor.po.ZjDwdjjdbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZjDwdjjdbMapper {
    long countByExample(ZjDwdjjdbExample example);

    int deleteByExample(ZjDwdjjdbExample example);

    int deleteByPrimaryKey(String dwdjjdbh);

    int insert(ZjDwdjjdb record);

    int insertSelective(ZjDwdjjdb record);

    List<ZjDwdjjdb> selectByExample(ZjDwdjjdbExample example);

    ZjDwdjjdb selectByPrimaryKey(String dwdjjdbh);

    int updateByExampleSelective(@Param("record") ZjDwdjjdb record, @Param("example") ZjDwdjjdbExample example);

    int updateByExample(@Param("record") ZjDwdjjdb record, @Param("example") ZjDwdjjdbExample example);

    int updateByPrimaryKeySelective(ZjDwdjjdb record);

    int updateByPrimaryKey(ZjDwdjjdb record);
}