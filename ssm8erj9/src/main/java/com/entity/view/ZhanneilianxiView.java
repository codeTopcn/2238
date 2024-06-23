package com.entity.view;

import com.entity.ZhanneilianxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 站内联系
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-28 13:19:54
 */
@TableName("zhanneilianxi")
public class ZhanneilianxiView  extends ZhanneilianxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhanneilianxiView(){
	}
 
 	public ZhanneilianxiView(ZhanneilianxiEntity zhanneilianxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhanneilianxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
