package club.owefsad.CentralRepository.WebAPI.service.impl;

import club.owefsad.CentralRepository.WebAPI.entity.User;
import club.owefsad.CentralRepository.WebAPI.mapper.UserMapper;
import club.owefsad.CentralRepository.WebAPI.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author owefsad
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;


    /**
     * login
     *
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        User loginUser = userMapper.login(user);
        if (loginUser == null) {
            return null;
        }
        loginUser.setLoginTime(System.currentTimeMillis());
        userMapper.updateLoginTime(loginUser);
        return loginUser;
    }
}
