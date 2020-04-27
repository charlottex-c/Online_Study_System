package com.xafdy.mapper;

import java.util.List;

import com.xafdy.model.College;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CollegeMapper {
	void saveColege(College college);
	
	List<College> searchCollege();
	
	void deleteCollege(Integer id);
	
	void updateCollege(College college);
	
	College getCollegeById(Integer id);
}