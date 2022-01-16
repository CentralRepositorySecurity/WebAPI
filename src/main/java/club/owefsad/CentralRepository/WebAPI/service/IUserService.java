package club.owefsad.CentralRepository.WebAPI.service;

import club.owefsad.CentralRepository.WebAPI.entity.User;

public interface IUserService {

    /**
     * login
     *
     * @param user
     * @return
     */
    User login(User user);

}
