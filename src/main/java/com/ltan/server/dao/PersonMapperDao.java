package com.ltan.server.dao;

import com.ltan.server.entity.Person;
import org.springframework.stereotype.Repository;

/**
 * Detail:
 * <p>
 * Created by tanlin on 2019-10-16
 */
@Repository
public interface PersonMapperDao {
    Person findPersonById(long id);
}
