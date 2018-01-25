package com.amossefin.auth.service;

import com.amossefin.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
