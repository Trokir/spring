package com.kirtro.spring.integration;

import com.kirtro.spring.database.entity.Company;
import com.kirtro.spring.dto.CompanyReadDto;
import com.kirtro.spring.listener.entity.EntityEvent;
import com.kirtro.spring.service.CompanyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class CompanyServiceIT {
    private static final Integer COMPANY_ID = 1;
    @Autowired
    private CompanyService companyService;
    @Test
    void findById(){

        var actualResult = companyService.findById(COMPANY_ID);

        assertTrue(actualResult.isPresent());

        var expectedResult = new CompanyReadDto(COMPANY_ID);
        actualResult.ifPresent(actual -> assertEquals(expectedResult, actual));
    }
}
