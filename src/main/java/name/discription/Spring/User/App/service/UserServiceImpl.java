package name.discription.Spring.User.App.service;

import name.discription.Spring.User.App.entity.dto.request.UserRequestDto;
import name.discription.Spring.User.App.entity.dto.request.UserRequestUpdateDto;
import name.discription.Spring.User.App.entity.dto.response.UserResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class UserServiceImpl implements UserService {

    @Override
    public UserResponseDto getUser(Long id) {
        return null;
    }

    @Override
    public Page<UserResponseDto> getAllUsers(Pageable pageable) {
        return null;
    }

    @Override
    public UserResponseDto createUser(UserRequestDto user) {
        return null;
    }

    @Override
    public UserResponseDto putUser(UserRequestUpdateDto user, Long id) {
        return null;
    }

    @Override
    public UserResponseDto deleteUser(Long id) {
        return null;
    }
}
