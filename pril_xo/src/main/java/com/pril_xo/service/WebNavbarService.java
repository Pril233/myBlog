package com.pril_xo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pril_base.service.SuperService;
import com.pril_common.entity.WebNavbar;
import com.pril_xo.vo.WebNavbarVO;

import java.util.List;

/*import com.moxi.mogublog.commons.entity.WebNavbar;
import com.moxi.mogublog.xo.vo.WebNavbarVO;
import com.moxi.mougblog.base.service.SuperService;*/

/**
 * 门户页导航栏 服务类
 *
 * @author 陌溪
 * @date 2021年2月22日17:02:38
 */
public interface WebNavbarService extends SuperService<WebNavbar> {

    /**
     * 分页获取门户导航栏
     *
     * @param webNavbarVO
     * @return
     */
    public IPage<WebNavbar> getPageList(WebNavbarVO webNavbarVO);
    
    /**
     * 获取所有门户导航栏
     *
     * @return
     */
    public List<WebNavbar> getAllList();

    /**
     * 新增门户导航栏
     *
     * @param webNavbarVO
     */
    public String addWebNavbar(WebNavbarVO webNavbarVO);

    /**
     * 编辑门户导航栏
     *
     * @param webNavbarVO
     */
    public String editWebNavbar(WebNavbarVO webNavbarVO);

    /**
     * 删除门户导航栏
     *
     * @param webNavbarVO
     */
    public String deleteWebNavbar(WebNavbarVO webNavbarVO);
}
