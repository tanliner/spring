package com.ltan.server.service;

import com.ltan.server.entity.Person;
import org.springframework.stereotype.Service;

/**
 * Detail:
 * <p>
 * Created by tanlin on 2019-10-16
 */
@Service
public interface PersonService {
    Person findPersonById(long id);
}
