package org.wangss.bootci.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "boot_userinfo")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userId;//用户ID
    private String userName;//用户名称
    private String password;//用户密码
    private Date insertTime;//新建时间
    private Boolean isAdmin;//是否管理员
    private Boolean isSuperAdmin;//是否超级管理员
}
