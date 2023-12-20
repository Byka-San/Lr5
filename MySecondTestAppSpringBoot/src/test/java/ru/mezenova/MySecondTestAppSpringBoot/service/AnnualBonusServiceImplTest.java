package ru.mezenova.MySecondTestAppSpringBoot.service;

import org.junit.jupiter.api.Test;
import ru.mezenova.MySecondTestAppSpringBoot.Enum.Positions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static ru.mezenova.MySecondTestAppSpringBoot.service.AnnualBonusServiceImpl.calculateDaysInYear;


class AnnualBonusServiceImplTest {

    @Test
    void calculate() {

        //given
        Positions positions = Positions.HR;
        double bonus = 2.0;
        int workDays = 243;
        double salary = 100000.00;

        //when
        double result = new AnnualBonusServiceImpl().calculate(positions, salary, bonus, workDays);

        //then
        double expected = 360493.8271604938;
        assertThat(result).isEqualTo(expected);

    }


    @Test
    public void testCalculateDaysInYear() {

        int year = 2023;
        Positions positions = Positions.MN;

        int result = 91;
        int expected= calculateDaysInYear(year, positions);

        assertThat(result).isEqualTo(expected);
    }
}
