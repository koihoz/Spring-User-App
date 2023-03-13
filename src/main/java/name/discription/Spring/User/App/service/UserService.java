package name.discription.Spring.User.App.service;

import name.discription.Spring.User.App.entity.dto.request.UserRequestDto;
import name.discription.Spring.User.App.entity.dto.request.UserRequestUpdateDto;
import name.discription.Spring.User.App.entity.dto.response.UserResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserResponseDto getUser(Long id);

    Page<UserResponseDto> getAllUsers(Pageable pageable);

    UserResponseDto createUser(UserRequestDto user);

    UserResponseDto putUser(UserRequestUpdateDto user, Long id);

    UserResponseDto deleteUser(Long id);

}
