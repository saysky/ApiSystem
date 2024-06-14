package com.example.sens.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (biz_group)实体类
 *
 * @author saysky
 * @since 2022-02-19 12:16:11
 * @description 
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("biz_group")
public class Group extends Model<Group> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
	private Long id;
    /**
     * 分组名称
     */
    private String name;
    /**
     * 项目id
     */
    private Long projectId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后更新时间
     */
    @TableField(update = "now()")
	private Date updateTime;

    @TableField(exist = false)
    private Project project;

    @TableField(exist = false)
    private Integer apiCount;

