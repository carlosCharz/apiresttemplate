package com.wifiesta.apiresttemplate.core.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.wifiesta.apiresttemplate.core.dao.UserRepository;

/**
 * User Repository Implementation
 *
 * @author charz
 */

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static final Logger LOG = LoggerFactory.getLogger(UserRepositoryImpl.class);

    @Override
    public String getByKey(String id) {
        LOG.info("User Repository Implementation called");
        return "user1";
    }
}
