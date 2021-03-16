package com.pril_xo.service.impl;

/*import com.moxi.mogublog.commons.entity.Visitor;
import com.moxi.mogublog.xo.mapper.VisitorMapper;
import com.moxi.mogublog.xo.service.VisitorService;
import com.moxi.mougblog.base.serviceImpl.SuperServiceImpl;*/

import com.pril_base.serviceImpl.SuperServiceImpl;
import com.pril_common.entity.Visitor;
import com.pril_xo.mapper.VisitorMapper;
import com.pril_xo.service.VisitorService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博主表 服务实现类
 * </p>
 *
 * @author 陌溪
 * @since 2018-09-08
 */
@Service
public class VisitorServiceImpl extends SuperServiceImpl<VisitorMapper, Visitor> implements VisitorService {

}
