package com.xafdy.mapper;

import java.util.Map;

import com.xafdy.model.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
	Admin searchEntityByAccount(Map<String, String> map);
}