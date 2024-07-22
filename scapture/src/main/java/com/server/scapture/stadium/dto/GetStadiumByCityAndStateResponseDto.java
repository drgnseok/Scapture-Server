package com.server.scapture.stadium.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@Builder
public class GetStadiumByCityAndStateResponseDto {
    private Long stadiumId;
    private String name;
    private String location;
    private String hours;
    private boolean isOutside;
    private String parking;
    private String image;
}