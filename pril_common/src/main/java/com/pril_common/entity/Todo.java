package com.pril_common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pril_base.entity.SuperEntity;
import lombok.Data;

/*
import com.moxi.mougblog.base.entity.SuperEntity;
*/

/**
 * <p>
 * 代办事项表
 * </p>
 *
 * @author xuzhixiang
 * @since 2019年6月29日10:26:30
 */
@Data
@TableName("t_todo")
public class Todo extends SuperEntity<Todo> {

    private static final long serialVersionUID = 1L;

    /**
     * 内容
     */
    private String text;

    /**
     * 管理员UID
     */
    private String adminUid;

    /**
     * 表示事项是否完成
     */
    private Boolean done;
}
