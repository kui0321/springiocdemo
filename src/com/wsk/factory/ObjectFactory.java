package com.wsk.factory;

import com.wsk.service.UsersService;
import com.wsk.service.impl.UsersServiceImpl;

public class ObjectFactory {
    public static UsersService getInstance(){
        return new UsersServiceImpl();
    }
}
