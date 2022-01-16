package club.owefsad.CentralRepository.WebAPI.mapper;

import club.owefsad.CentralRepository.WebAPI.entity.User;

/**
 * @author owefsad
 */
public interface UserMapper {

    User login(User record);

    int updateLoginTime(User record);
}