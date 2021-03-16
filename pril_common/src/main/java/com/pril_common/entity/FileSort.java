package com.pril_common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pril_base.entity.SuperEntity;
import lombok.Data;

/*import com.moxi.mougblog.base.entity.SuperEntity;*/

/**
 * 文件分类
 *
 * @author 陌溪
 * @since 2018-09-17
 */
@TableName("t_file_sort")
@Data
public class FileSort extends SuperEntity<FileSort> {

    private static final long serialVersionUID = 1L;

    /**
     * 项目名
     */
    private String projectName;

    /**
     * 模块分类名
     */
    private String sortName;

    /**
     * 存储路径
     */
    private String url;
}
