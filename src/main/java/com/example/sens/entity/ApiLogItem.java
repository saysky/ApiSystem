package com.example.sens.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (biz_api_log_item)实体类
 *
 * @author saysky
 * @since 2022-02-19 12:16:11
 * @description 
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("biz_api_log_item")
public class ApiLogItem extends Model<ApiLogItem> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
	private Long id;
    /**
     * 用户ID
     */
    private Long logId;
    /**
     * 字段名称
     */
    private String name;
    /**
     * 老的内容
     */
    private String oldContent;
    /**
     * 新的内容
     */
    private String newContent;

    public ApiLogItem(Long logId, String name, String oldContent, String newContent) {
        this.logId = logId;
        this.name = name;
        this.oldContent = oldContent;
        this.newContent = newContent;
    }
}