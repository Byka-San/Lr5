package ru.mezenova.MySecondTestAppSpringBoot.service;

import ru.mezenova.MySecondTestAppSpringBoot.exception.UnsupertCodeException;
import ru.mezenova.MySecondTestAppSpringBoot.model.Request;
import org.springframework.stereotype.Service;

@Service
public interface UnsupportedCodeService {
    void isCode(Request request) throws UnsupertCodeException;
}
