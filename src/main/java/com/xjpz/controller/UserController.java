package com.xjpz.controller;

import act.controller.Controller;
import act.db.ebean.EbeanDao;
import com.avaje.ebean.Ebean;
import com.xjpz.models.User;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.PostAction;
import org.osgl.mvc.annotation.PutAction;

import javax.inject.Inject;

/**
 * Created by xjpz on 2017/3/11.
 */

public class UserController extends Controller.Util{

    @Inject
    private EbeanDao<Long, User> dao;

    @GetAction("/list")
    public Iterable<User> list() {
        return dao.findAll();
    }

    @PostAction("/add")
    public User add(User user){
        return dao.save(user);
    }

    @PutAction("/update")
    public User update(User userReq){
        User user = dao.findById(userReq.getId());
        notFoundIfNull(user);
        Ebean.update(user.patch(userReq));
        return user;
    }
}
