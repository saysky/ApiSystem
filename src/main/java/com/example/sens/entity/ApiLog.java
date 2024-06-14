package com.example.sens.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (biz_api_log)实体类
 *
 * @author saysky
 * @since 2022-02-19 12:16:11
 * @description 
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("biz_api_log")
public class ApiLog extends Model<ApiLog> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
	private Long id;
    /**
     * 接口ID
     */
    private Long apiId;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 老版本号
     */
    private Long oldVersion;
    /**
     * 新版本号
     */
    private Long newVersion;
    /**
     * 创建时间
     */
    private Date createTime;

