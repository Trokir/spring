package com.kirtro.spring.service;

import com.kirtro.spring.database.entity.Company;
import com.kirtro.spring.database.repository.CrudRepository;
import com.kirtro.spring.database.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

}
