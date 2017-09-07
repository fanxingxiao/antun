package com.zdjy.bigdata.antun.dao;

import com.zdjy.bigdata.antun.entity.Medias;
import com.zdjy.bigdata.antun.entity.MediasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MediasMapper {
    int countByExample(MediasExample example);

    int deleteByExample(MediasExample example);

    int deleteByPrimaryKey(String id);

    int insert(Medias record);

    int insertSelective(Medias record);

    List<Medias> selectByExample(MediasExample example);

    Medias selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Medias record, @Param("example") MediasExample example);

    int updateByExample(@Param("record") Medias record, @Param("example") MediasExample example);

    int updateByPrimaryKeySelective(Medias record);

    int updateByPrimaryKey(Medias record);
}