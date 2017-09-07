package com.zdjy.bigdata.antun.dao;

import com.zdjy.bigdata.antun.entity.Channels;
import com.zdjy.bigdata.antun.entity.ChannelsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelsMapper {
    int countByExample(ChannelsExample example);

    int deleteByExample(ChannelsExample example);

    int deleteByPrimaryKey(String id);

    int insert(Channels record);

    int insertSelective(Channels record);

    List<Channels> selectByExample(ChannelsExample example);

    Channels selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Channels record, @Param("example") ChannelsExample example);

    int updateByExample(@Param("record") Channels record, @Param("example") ChannelsExample example);

    int updateByPrimaryKeySelective(Channels record);

    int updateByPrimaryKey(Channels record);
}