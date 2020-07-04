package com.gk.dao;

import com.gk.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    static List<User> list;

    static{
        list = new ArrayList<User>();
        for (int i = 0; i < 5; i++) {
            list.add(new User(i+1,"gk"+i,18+i,"篮球"+i));
        }
    }

    public static List<User> getUserList(){
        return list;
    }

}
