package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NonghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NonghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NonghuView;


/**
 * 农商
 *
 * @author 
 * @email 
 * @date 2024-02-08 17:32:25
 */
public interface NonghuService extends IService<NonghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NonghuVO> selectListVO(Wrapper<NonghuEntity> wrapper);
   	
   	NonghuVO selectVO(@Param("ew") Wrapper<NonghuEntity> wrapper);
   	
   	List<NonghuView> selectListView(Wrapper<NonghuEntity> wrapper);
   	
   	NonghuView selectView(@Param("ew") Wrapper<NonghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NonghuEntity> wrapper);

   	

}

