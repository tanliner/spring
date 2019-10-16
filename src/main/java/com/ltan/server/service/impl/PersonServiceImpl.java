package com.ltan.server.service.impl;

import com.ltan.server.dao.PersonMapperDao;
import com.ltan.server.entity.Person;
import com.ltan.server.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Detail:
 * <p>
 * Created by tanlin on 2019-10-16
 */
@Component
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapperDao personMapperDao;

    public Person findPersonById(long id) {
        return personMapperDao.findPersonById(id);
    }
}
