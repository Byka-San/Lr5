package ru.mezenova.MySecondTestAppSpringBoot.service;

import ru.mezenova.MySecondTestAppSpringBoot.model.Response;
import org.springframework.stereotype.Service;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
