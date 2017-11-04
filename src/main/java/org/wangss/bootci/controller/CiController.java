package org.wangss.bootci.controller;

import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wangss.bootci.domain.Ci;
import org.wangss.bootci.domain.UserInfo;
import org.wangss.bootci.service.ICiService;

/**
 * @author wangss
 */
@RestController
@RequestMapping("ci")
@Slf4j
public class CiController {

  @Autowired
  private RedisTemplate redisTemplate;

  @RequestMapping("hi")
  public String hello() {
    return "hi";
  }

  @Autowired
  private ICiService ciService;

  @GetMapping("get/{id}")
  public Ci findCiById(@PathVariable(value = "id") Long id, HttpServletRequest request) {
    String remoteIp = getRemoteHost(request);
    if (redisTemplate.opsForValue().get(remoteIp + "GET") == null) {
      redisTemplate.opsForValue().set(remoteIp + "GET", 1, 10, TimeUnit.MINUTES);
    } else {
      redisTemplate.opsForValue().set(remoteIp + "GET",
          Integer.valueOf(redisTemplate.opsForValue().get(remoteIp + "GET").toString()) + 1, 10,
          TimeUnit.SECONDS);
    }

//        log.info(getRemoteHost(request));
    return ciService.findCiById(id);
  }

  private String getRemoteHost(HttpServletRequest request) {
    String ip = request.getHeader("x-forwarded-for");
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("WL-Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getRemoteAddr();
    }
    return ip.equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : ip;
  }


  @RequestMapping("ci/user/login")
  public String login(@RequestBody UserInfo user) {
    String username = user.getUsername();
    String password = user.getPassword();
    return "";

  }
}
