package org.wangss.bootci.domain;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author wangss
 */
@Data
@Entity
@Table(name = "boot_userinfo")
public class UserInfo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String userId;
  private String username;
  private String password;
  private Date insertTime;
  private Boolean isAdmin;
  private Boolean isSuperAdmin;
}
