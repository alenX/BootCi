package org.wangss.bootci.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wangss.bootci.domain.Ci;

/**
 * @author wangss
 */
public interface CiJpa extends JpaRepository<Ci, Long> {

}
