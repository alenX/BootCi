package org.wangss.bootci.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "boot_ci")
public class Ci {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String author;//作者
    private String dynasty;//朝代
    private String name; //词牌名
    private String title;//题目
    private String content;//内容
    private String picUrl;//图片地址
}
