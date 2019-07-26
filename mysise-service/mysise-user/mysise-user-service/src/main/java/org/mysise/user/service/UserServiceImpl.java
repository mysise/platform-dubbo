package org.mysise.user.service;

import org.mysise.user.api.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String getUserName() {
        return "name";
    }
}
