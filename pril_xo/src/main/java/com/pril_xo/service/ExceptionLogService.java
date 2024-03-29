package com.pril_xo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pril_base.service.SuperService;
import com.pril_common.entity.ExceptionLog;
import com.pril_xo.vo.ExceptionLogVO;
/*
import com.moxi.mogublog.commons.entity.ExceptionLog;
import com.moxi.mogublog.xo.vo.ExceptionLogVO;
import com.moxi.mougblog.base.service.SuperService;
*/

/**
 * 操作异常日志 服务类
 *
 * @author limbo
 * @date 2018-09-30
 */
public interface ExceptionLogService extends SuperService<ExceptionLog> {

    /**
     * 获取异常日志列表
     *
     * @param exceptionLogVO
     * @return
     */
    public IPage<ExceptionLog> getPageList(ExceptionLogVO exceptionLogVO);
}
