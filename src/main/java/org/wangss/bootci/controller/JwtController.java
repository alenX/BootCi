package org.wangss.bootci.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangss
 */
@RestController
public class JwtController {

  /**
   * 获取token数据
   *
   * @param data 请求数据
   */
  @PostMapping("/oauth/token")
  public String obtainToken(@RequestBody String data) {

    return "";
  }
}
