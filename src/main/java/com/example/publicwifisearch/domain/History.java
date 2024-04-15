package com.example.publicwifisearch.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class History {
    private long id;
    private double lat;//위도
    private double lnt;//경도
    private String dateTime;//생성 일시

    public History() {
    }

}
