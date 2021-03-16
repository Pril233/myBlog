package com.pril_xo.service.impl;

/*import com.moxi.mogublog.commons.entity.Collect;
import com.moxi.mogublog.xo.mapper.CollectMapper;
import com.moxi.mogublog.xo.service.CollectService;
import com.moxi.mougblog.base.serviceImpl.SuperServiceImpl;*/

import com.pril_base.serviceImpl.SuperServiceImpl;
import com.pril_common.entity.Collect;
import com.pril_xo.mapper.CollectMapper;
import com.pril_xo.service.CollectService;
import org.springframework.stereotype.Service;

/**
 * 收藏表 服务实现类
 *
 * @author 陌溪
 * @since 2018-09-08
 */
@Service
public class CollectServiceImpl extends SuperServiceImpl<CollectMapper, Collect> implements CollectService {

}
