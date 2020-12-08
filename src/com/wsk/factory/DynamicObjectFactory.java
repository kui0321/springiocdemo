package com.wsk.factory;

import com.wsk.service.UsersService;
import com.wsk.service.impl.UsersServiceImpl;

public class DynamicObjectFactory {
    public UsersService getInstance(){
        return new UsersServiceImpl();
    }
}
