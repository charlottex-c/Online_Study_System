package com.xafdy.mapper;

import java.util.List;

import com.xafdy.model.DiscussPost;

public interface DiscussPostMapper {
	void saveEntity(DiscussPost discussPost);
	List<DiscussPost> searchEntity(Integer id);
}