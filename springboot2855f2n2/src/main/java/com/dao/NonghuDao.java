package com.dao;

import com.entity.NonghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NonghuVO;
import com.entity.view.NonghuView;


/**
 * 农商
 * 
 * @author 
 * @email 
 * @date 2024-02-08 17:32:25
 */
public interface NonghuDao extends BaseMapper<NonghuEntity> {
	
	List<NonghuVO> selectListVO(@Param("ew") Wrapper<NonghuEntity> wrapper);
	
	NonghuVO selectVO(@Param("ew") Wrapper<NonghuEntity> wrapper);
	
	List<NonghuView> selectListView(@Param("ew") Wrapper<NonghuEntity> wrapper);

	List<NonghuView> selectListView(Pagination page,@Param("ew") Wrapper<NonghuEntity> wrapper);

	
	NonghuView selectView(@Param("ew") Wrapper<NonghuEntity> wrapper);
	

}
