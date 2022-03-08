package com.example.sens.es.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * @author 言曌
 * @date 2022/2/20 1:42 下午
 */

@Data
@Document(indexName = "api", type = "api", shards = 1, replicas = 0, refreshInterval = "-1")
public class EsApi {

    /**
     * ID
     */
    @Id
    private Long id;
    /**
     * 接口名称
     */
    @Field(type = FieldType.Text)
    private String name;
    /**
     * 接口描述
     */
    @Field(type = FieldType.Auto)
    private String description;
    /**
     * 项目ID
     */
    @Field(type = FieldType.Auto)
    private Long projectId;
    /**
     * 分组ID
     */
    @Field(type = FieldType.Auto)
    private Long groupId;
    /**
     * 接口URL
     */
    @Field(type = FieldType.Text)
    private String requestUrl;
    /**
     * 接口方法类型
     */
    @Field(type = FieldType.Auto)
    private String requestMethod;
    /**
     * 接口查询参数
     */
    @Field(type = FieldType.Auto)
    private String requestQueryParam;
    /**
     * 接口header参数
     */
    @Field(type = FieldType.Auto)
    private String requestHeader;
    /**
     * 接口body参数
     */
    @Field(type = FieldType.Auto)
    private String requestBody;

    /**
     * 接口body参数
     */
    @Field(type = FieldType.Auto)

    private String requestBodyRemark;

    /**
     * 响应body参数
     */
    @Field(type = FieldType.Auto)
    private String responseBody;

    /**
     * 响应body参数
     */
    @Field(type = FieldType.Auto)
    private String responseBodyRemark;
    /**
     * 接口唯一标识
     */
    @Field(type = FieldType.Auto)
    private String uuid;
    /**
     * 版本号
     */
    @Field(type = FieldType.Auto)

    private Long version;
    /**
     * 是否锁定，1锁定，0未锁定
     */
    @Field(type = FieldType.Auto)

    private Integer lockState;
    /**
     * 锁的用户id
     */
    @Field(type = FieldType.Auto)

    private Long lockUserId;
    /**
     * 是否历史版本，1历史，0最新版本
     */
    @Field(type = FieldType.Auto)

    private Integer historyState;
    /**
     * 创建人用户id
     */
    @Field(type = FieldType.Auto)

    private Long userId;
    /**
     * 创建时间
     */
    @Field(type = FieldType.Date, index = false, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    /**
     * 最后更新时间
     */
    @Field(type = FieldType.Date, index = false, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
}

