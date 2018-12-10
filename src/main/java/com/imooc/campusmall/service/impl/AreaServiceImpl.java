package com.imooc.campusmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.campusmall.dao.AreaDao;
import com.imooc.campusmall.entity.Area;
import com.imooc.campusmall.service.AreaService;
@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaDao areaDao;
	@Override
	public List<Area> getAreaList() {
		return areaDao.queryArea();
	}

}
