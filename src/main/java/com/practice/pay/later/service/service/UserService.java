package com.practice.pay.later.service.service;


import com.practice.pay.later.service.dto.UserDTO;
import com.practice.pay.later.service.exception.ApiResponse;
import com.practice.pay.later.service.exception.NotFoundException;
import com.practice.pay.later.service.model.User;

import java.util.List;

public interface UserService {

    ApiResponse<String> addUser(UserDTO userDTO);

    ApiResponse<List<UserDTO>> getAllUser();

    ApiResponse<UserDTO> getUserById(Long userId) throws NotFoundException;

    List<User> getUserByFirstName(String firstName);

    List<User> getUserByLastName(String lastName);

    User getUserByEmailId(String emailId);

    void updateUserDetails(User user, Long userId);

    void updateAddressDetails(User user, Long userId);

}
