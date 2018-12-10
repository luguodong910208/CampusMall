package com.imooc.campusmall.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.campusmall.BaseTest;
import com.imooc.campusmall.entity.Area;

public class AreaServiceTest extends BaseTest {
	@Autowired
	private AreaService areaService;
	@Test
	public void testGetAreaList(){
		List<Area> areaList = areaService.getAreaList();
		assertEquals("西苑", areaList.get(0).getAreaName());
	}
}
