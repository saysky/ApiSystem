package com.example.sens.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (biz_project)实体类
 *
 * @author saysky
 * @since 2022-02-19 12:16:11
 * @description 
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("biz_project")
public class Project extends Model<Project> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
	private Long id;
    /**
     * 项目名称
     */
    private String name;
    /**
     * 结项状态：1结项，0未结项
     */
    private Integer endState;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后更新时间
     */
    @TableField(update = "now()")
	private Date updateTime;

    /**
     * 该项目的成员
     */
    @TableField(exist = false)
    private List<Long> userIds;

    /**
     * 模块数
     */
    @TableField(exist = false)
    private Integer groupCount;

    /**
     * 成员数
     */
    @TableField(exist = false)
    private Integer userCount;

