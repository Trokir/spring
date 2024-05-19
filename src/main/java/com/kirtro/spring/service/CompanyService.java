package com.kirtro.spring.service;

import com.kirtro.spring.database.entity.Company;
import com.kirtro.spring.database.repository.CrudRepository;
import com.kirtro.spring.dto.CompanyReadDto;
import com.kirtro.spring.listener.entity.AccessType;
import com.kirtro.spring.listener.entity.EntityEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CrudRepository<Integer, Company> companyRepository;
    private final UserService userService;
    private final ApplicationEventPublisher eventPublisher;


    public Optional<CompanyReadDto> findById(Integer id) {
        return companyRepository.findById(id)
            .map(entity -> {
                eventPublisher.publishEvent(new EntityEvent(entity, AccessType.READ));
                return new CompanyReadDto(entity.id());
            });
    }
}
