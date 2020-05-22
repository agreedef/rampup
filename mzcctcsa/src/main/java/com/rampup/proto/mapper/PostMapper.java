package com.rampup.proto.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.rampup.proto.dto.PostDTO;

@Mapper
public interface PostMapper {

	@Select("SELECT * FROM tbl_post WHERE post_id = #{id}")
	PostDTO readPost(@Param("id") Long id);

	@Select("SELECT * FROM tbl_post")
	List<PostDTO> list();

}
