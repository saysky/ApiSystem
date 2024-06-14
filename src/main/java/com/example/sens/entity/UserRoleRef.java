package com.example.sens.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.sens.common.base.BaseEntity;
import lombok.Data;

import java.util.Date;


/**
 * 用户和角色关联
 * @author example
 */
@Data
@TableName("sys_user_role_ref")
public class UserRoleRef  extends BaseEntity {


    /**
     * 用户Id
     */
    private Long userId;

    /**
     * 角色Id
     */
    private Long roleId;

    public UserRoleRef(Long userId, Long roleId) {
        this.userId = userId;
        this.roleId = roleId;
        this.setCreateTime(new Date());
    }

    public UserRoleRef() {
    }
