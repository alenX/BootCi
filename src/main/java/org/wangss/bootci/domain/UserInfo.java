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
    private String userId;
    private String userName;
    private String password;
    private Date insertTime;
    private Boolean isAdmin;
    private Boolean isSuperAdmin;
}
