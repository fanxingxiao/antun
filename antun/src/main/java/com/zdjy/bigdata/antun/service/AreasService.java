package com.zdjy.bigdata.antun.service;

import java.util.List;

import com.zdjy.bigdata.antun.entity.Areas;

public interface AreasService {

	List<Areas> findAll();

	List<Areas> findByPid(Integer pid);

	boolean isValidArea(Integer province, Integer city, Integer town);

}
