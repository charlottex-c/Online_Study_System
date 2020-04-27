package com.xafdy.mapper;

import com.xafdy.model.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
	void saveEntity(Student student);
	
	List<Student> searchEntity();
	
	void deleteEntity(Integer id);
	
	void deleteEntitys(String id);
	
	void updateEntity(Student student);
	
	Student getEntityById(Integer id);
	
	List<Student> sousuo(String uname);
	
	Student searchEntityByAccount(Map<String, String> map);

	}