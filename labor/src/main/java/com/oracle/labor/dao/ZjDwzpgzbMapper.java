package com.oracle.labor.dao;

import com.oracle.labor.po.ZjDwzpgzb;
import com.oracle.labor.po.ZjDwzpgzbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZjDwzpgzbMapper {
    long countByExample(ZjDwzpgzbExample example);

    int deleteByExample(ZjDwzpgzbExample example);

    int deleteByPrimaryKey(String zpgzbh);

    int insert(ZjDwzpgzb record);

    int insertSelective(ZjDwzpgzb record);

    List<ZjDwzpgzb> selectByExample(ZjDwzpgzbExample example);

    ZjDwzpgzb selectByPrimaryKey(String zpgzbh);

    int updateByExampleSelective(@Param("record") ZjDwzpgzb record, @Param("example") ZjDwzpgzbExample example);

    int updateByExample(@Param("record") ZjDwzpgzb record, @Param("example") ZjDwzpgzbExample example);

    int updateByPrimaryKeySelective(ZjDwzpgzb record);

    int updateByPrimaryKey(ZjDwzpgzb record);
}