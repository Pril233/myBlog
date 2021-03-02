package com.pril_xo.mapper;

import com.pril_xo.entity.PUser;
import org.apache.ibatis.annotations.Param;
import com.github.pagehelper.Page;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author czh
 * @since 2020-12-24
 */

@Mapper
public interface PUserMapper {

   /**
	* 根据id查询PUser
	*/
	PUser getPUserById(@Param(value = "uid") String id) throws Exception;

	/**
	* 查询PUser列表
	*/
	List<PUser> listPUser(Map<String, Object> map) throws Exception;

	/**
	* 分页查询PUser列表
	*/
	Page<PUser> pagePUser(Map<String, Object> map) throws Exception;

	/**
	* 新增PUser
	*/
	Integer addPUser(PUser pUser) throws Exception;

	/**
	* 更新PUser
	*/
	Integer updatePUser(PUser pUser) throws Exception;

	/**
	* 根据id物理删除PUser
	*/
	Integer deletePUserById(@Param(value = "uid") String id)	throws Exception;

	/**
	* 根据id逻辑删除PUser
	*/
	Integer removePUserById(@Param(value = "uid") String id)	throws Exception;
}
