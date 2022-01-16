package club.owefsad.CentralRepository.WebAPI.mapper;

import club.owefsad.CentralRepository.WebAPI.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author owefsad
 */
@Mapper
public interface UserMapper {

    User login(User record);

    int updateLoginTime(User record);
}