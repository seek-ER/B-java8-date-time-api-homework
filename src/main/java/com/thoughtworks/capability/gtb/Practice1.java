package com.thoughtworks.capability.gtb;

import static java.util.concurrent.TimeUnit.DAYS;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int year = date.getYear();
    LocalDate labourDay = LocalDate.of(year, 5, 1);
    if (date.isBefore(labourDay)){
      return ChronoUnit.DAYS.between(date,labourDay);
    }else {
      return ChronoUnit.DAYS.between(date,labourDay.withYear(year+1));
    }
  }
}
