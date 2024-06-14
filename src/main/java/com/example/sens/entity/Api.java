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
 * (biz_api)实体类
 *
 * @author saysky
 * @since 2022-02-19 12:16:11
 * @description
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("biz_api")
public class Api extends Model<Api> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
	private Long id;
    /**
     * 接口名称
     */
    private String name;
    /**
     * 接口描述
     */
    private String description;
    /**
     * 项目ID
     */
    private Long projectId;
    /**
     * 分组ID
     */
    private Long groupId;
    /**
     * 接口URL
     */
    private String requestUrl;
    /**
     * 接口方法类型
     */
    private String requestMethod;
    /**
     * 接口查询参数
     */
    private String requestQueryParam;
    /**
     * 接口header参数
     */
    private String requestHeader;
    /**
     * 接口body参数
     */
    private String requestBody;

    /**
     * 接口body参数
     */
    private String requestBodyRemark;

    /**
     * 响应body参数
     */
    private String responseBody;

    /**
     * 响应body参数
     */
    private String responseBodyRemark;
    /**
     * 接口唯一标识
     */
    private String uuid;
    /**
     * 版本号
     */
    private Long version;
    /**
     * 是否锁定，1锁定，0未锁定
     */
    private Integer lockState;
    /**
     * 锁的用户id
     */
    private Long lockUserId;
    /**
     * 是否历史版本，1历史，0最新版本
     */
    private Integer historyState;
    /**
     * 创建人用户id
     */
    private Long userId;
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
    private Group group;

    @TableField(exist = false)
    private Long apiLogId;


    @TableField(exist = false)
    private User user;



