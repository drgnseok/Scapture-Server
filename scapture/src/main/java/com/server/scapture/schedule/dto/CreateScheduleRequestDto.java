package com.server.scapture.schedule.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



@Getter @Setter
@AllArgsConstructor
@Builder
public class CreateScheduleRequestDto {
    private Long fieldId;
    private String startDate;
    private String endDate;
    private int price;

    public LocalDateTime convert(boolean isStart) {
        String dateString;
        if (isStart) dateString = startDate;
        else dateString = endDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(dateString, formatter);
    }
}