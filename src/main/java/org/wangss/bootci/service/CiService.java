package org.wangss.bootci.service;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wangss.bootci.domain.Ci;
import org.wangss.bootci.domain.QCi;

/**
 * @author wangss
 */
@Service
public class CiService implements ICiService {

  @Autowired
  private JPAQueryFactory jpa;

  @Override
  public Ci findCiById(Long id) {
    return jpa.select(QCi.ci).from(QCi.ci).where(QCi.ci.id.eq(id)).fetchOne();
  }
}