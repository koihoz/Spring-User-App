package name.discription.Spring.User.App.controller;

import lombok.RequiredArgsConstructor;
import name.discription.Spring.User.App.entity.dto.request.UserRequestDto;
import name.discription.Spring.User.App.entity.dto.request.UserRequestUpdateDto;
import name.discription.Spring.User.App.entity.dto.response.UserResponseDto;
import name.discription.Spring.User.App.service.UserService;
import name.discription.Spring.User.App.service.UserServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserResponseDto> getUser(@PathVariable(name = "id") Long id) {
        final UserResponseDto user = userService.getUser(id);
        return user != null
                ? new ResponseEntity<>(user, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<Page<UserResponseDto>> getAllUsers(@PageableDefault(size = 10) Pageable pageable) {
        return new ResponseEntity<>(userService.getAllUsers(pageable), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(@RequestBody UserRequestDto user ){
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<UserResponseDto> putUser(@RequestBody UserRequestUpdateDto user, @PathVariable(name ="id") Long id){
        return new ResponseEntity<>(userService.putUser(user, id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(name = "id") Long id){
        return new ResponseEntity<>(userService.deleteUser(id), HttpStatus.OK);
    }

    //status ENUM / создаем в моделе Поле Статус . В нашей API должен быть метод изменяюзий статус USER  нащей модели
    // cлздать слой репозитрия проюросить все методы

}