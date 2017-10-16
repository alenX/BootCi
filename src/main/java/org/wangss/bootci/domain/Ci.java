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
    private String author;
    private String dynasty;
    private String content;
    private String picUrl;
}
