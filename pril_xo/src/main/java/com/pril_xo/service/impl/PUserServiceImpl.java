package com.pril_xo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pril_xo.entity.PUser;
import com.pril_xo.mapper.PUserMapper;
import com.pril_xo.service.PUserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author czh
 * @since 2020-12-24
 */
@Service
public class PUserServiceImpl implements PUserService {

    @Autowired
    private PUserMapper pUserMapper;

    /**
	* 根据id查询PUser
	*/
    @Override
    public PUser getPUserById(String id) throws Exception {
        return pUserMapper.getPUserById(id);
    }

    /**
	* 查询PUser列表
	*/
    @Override
    public List<PUser> listPUser(Map<String, Object> map) throws Exception {
        return pUserMapper.listPUser(map);
    }

    /**
	* 分页查询PUser列表
	*/
    @Override
	public Page<PUser> pagePUser(Map<String, Object> map, Integer pageNo, Integer pageSize) throws Exception {
        PageHelper.startPage(pageNo,pageSize);
        return pUserMapper.pagePUser(map);
    }

    /**
	* 新增PUser
	*/
    @Override
    @Transactional
    public Integer addPUser(PUser pUser) throws Exception {
        return pUserMapper.addPUser(pUser);
    }

    /**
	* 更新PUser
	*/
    @Override
    @Transactional
    public Integer updatePUser(PUser pUser) throws Exception {
        return pUserMapper.updatePUser(pUser);
    }

   	/**
	* 根据id删除PUser
	*/
    @Override
    @Transactional
	public Integer deletePUserById(String id) throws Exception {
        return pUserMapper.deletePUserById(id);
    }

	/**
	* 根据id逻辑删除PUser
	*/
    @Override
    @Transactional
	public Integer removePUserById(String id) throws Exception {
        return pUserMapper.removePUserById(id);
    }
}
