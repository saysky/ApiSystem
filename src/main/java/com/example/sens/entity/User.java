package com.example.sens.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.sens.common.base.BaseEntity;
import lombok.Data;

/**
 * 用户或员工信息
 */
@Data
@TableName("sys_user")
public class User extends BaseEntity {

    /**
     * 账号
     */
    private String userName;

    /**
     * 用户名，网名
     */
    private String userDisplayName;

    /**
     * 密码
     */
    private String userPass;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 头像
     */
    private String userAvatar;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 角色名称
     */
    @TableField(exist = false)
    private Role role;

}
