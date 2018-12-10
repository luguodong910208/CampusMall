package com.imooc.campusmall.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.campusmall.BaseTest;
import com.imooc.campusmall.entity.Area;

public class AreaDaoTest extends BaseTest {
	@Autowired
	private AreaDao areaDao;
	@Test
	public void testQueryArea(){
		List<Area> areaList = areaDao.queryArea();
		assertEquals(4, areaList.size());
	}
}
