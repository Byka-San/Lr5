package ru.mezenova.MySecondTestAppSpringBoot.model;

import ru.mezenova.MySecondTestAppSpringBoot.Enum.Positions;
import ru.mezenova.MySecondTestAppSpringBoot.Enum.Systems;
import ru.mezenova.MySecondTestAppSpringBoot.util.DateTimeUtil;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Request {

    @NotBlank(message = "Uid  не может быть пустым ")
    @Size(max = 3, message = "uid должен быть < 32 символов")
    private String uid;
    @NotBlank(message = "operationUid не может быть пустым")
    @Size(max = 32, message = "operationUid должен быть < 32 символов")
    private String operationUid;
    private Systems systemName;
    private String systemTime;
    private String source;
    private Positions position;
    private double salary;
    private double bonus;
    private int workDays;
    @Min(value = 1, message = "communicationId не может быть меньше 1")
    @Max(value = 100000, message = "communicationId не может быть больше 100000")
    private int communicationId;
    private int templateId;
    private int productCode;
    private int smsCode;


    public void setSystemTime(String systemTime) {
        if (systemTime.isEmpty()){
            this.systemTime = DateTimeUtil.getCustomFormatFormat().format(new Date());
        }else {
            this.systemTime=systemTime;
        }
    }

}
