package com.pril_xo.service.impl;
/*
import com.moxi.mogublog.commons.entity.CommentReport;
import com.moxi.mogublog.xo.mapper.CommentReportMapper;
import com.moxi.mogublog.xo.service.CommentReportService;
import com.moxi.mougblog.base.serviceImpl.SuperServiceImpl;*/

import com.pril_base.serviceImpl.SuperServiceImpl;
import com.pril_common.entity.CommentReport;
import com.pril_xo.mapper.CommentReportMapper;
import com.pril_xo.service.CommentReportService;
import org.springframework.stereotype.Service;

/**
 * 评论举报表 服务实现类
 *
 * @author 陌溪
 * @date 2020年1月12日15:47:47
 */
@Service
public class CommentReportServiceImpl extends SuperServiceImpl<CommentReportMapper, CommentReport> implements CommentReportService {

}
