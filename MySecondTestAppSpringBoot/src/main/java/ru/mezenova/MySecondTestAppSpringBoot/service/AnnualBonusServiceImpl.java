package ru.mezenova.MySecondTestAppSpringBoot.service;

import ru.mezenova.MySecondTestAppSpringBoot.Enum.Positions;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

@Service
public class AnnualBonusServiceImpl implements AnnualBonusService {
    @Override
    public double calculate(Positions positions, double salary, double bonus, int workDays) {
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);


        return calculateSalary(positions,year,salary,bonus,workDays);
    }

    public static int calculateDaysInYear(int year, Positions positions) {
        Year currentYear = Year.of(year);
        int daysToYear,
                salary = 0;

        if (currentYear.isLeap()) {

            // Високосный год:
            daysToYear =  366;

        }

        else {

            // Невисокосный год:
            daysToYear =  365;

        }

        if (positions.isManager()){

            salary = daysToYear / 4;

        }

        else {

            salary = daysToYear;

        }

        return salary;

    }

    private static double calculateSalary(Positions positions, int year, double salary, double bonus, int workDays){
            return  (salary * bonus * calculateDaysInYear(year, positions) * positions.getPositionCoefficient() / workDays);
    }
}
