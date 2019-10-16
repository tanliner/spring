package com.ltan.server.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ltan.server.entity.Person;
import com.ltan.server.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Detail:
 * <p>
 * Created by tanlin on 2019-10-16
 */
@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/selectPerson")
    public void selectPerson(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // URL: http://localhost:8080/spring_war_exploded/person/selectPerson
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        long personId = Long.parseLong(request.getParameter("id"));
        System.out.println("req id = " + personId);
        System.out.println("personService " + personService);
        Person person = personService.findPersonById(personId);
        System.out.println("query person = " + person);

        ObjectMapper mapper = new ObjectMapper();

        response.getWriter().write(mapper.writeValueAsString(person));
        response.getWriter().close();
    }
}
