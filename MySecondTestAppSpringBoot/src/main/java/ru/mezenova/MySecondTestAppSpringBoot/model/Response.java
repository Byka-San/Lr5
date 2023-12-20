package ru.mezenova.MySecondTestAppSpringBoot.model;

import ru.mezenova.MySecondTestAppSpringBoot.Enum.Codes;
import ru.mezenova.MySecondTestAppSpringBoot.Enum.ErrorCodes;
import ru.mezenova.MySecondTestAppSpringBoot.Enum.ErrorMessages;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Response {
    private String uid;
    private String operationUid;
    private String systemTime;
    private Codes code;
    private double annualBonus;
    private ErrorCodes errorCode;
    private ErrorMessages errorMassage;
}
