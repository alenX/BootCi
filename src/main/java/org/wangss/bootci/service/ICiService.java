package org.wangss.bootci.service;

import org.wangss.bootci.domain.Ci;


public interface ICiService {

    public Ci findCiById(Long id);
}
