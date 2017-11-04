package org.wangss.bootci.service;

import org.wangss.bootci.domain.Ci;


public interface ICiService {

  /**
   * 根据ID查询词信息
   *
   * @param id id
   * @return 词
   */
  public Ci findCiById(Long id);
}
