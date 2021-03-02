package com.pril_xo.service;

import com.pril_xo.entity.PUser;
import com.github.pagehelper.Page;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author czh
 * @since 2020-12-24
 */

public interface PUserService {

    /**
	* 根据id查询PUser
	*/
    PUser getPUserById(String id) throws Exception;

    /**
	* 查询PUser列表
	*/
    List<PUser> listPUser(Map<String, Object> map) throws Exception;

	/**
	* 分页查询PUser列表
	*/
	Page<PUser> pagePUser(Map<String, Object> map, Integer pageNo, Integer pageSize) throws Exception;

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
	Integer deletePUserById(String id)	throws Exception;

	/**
	* 根据id逻辑删除PUser
	*/
	Integer removePUserById(String id)	throws Exception;
}
