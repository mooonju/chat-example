package com.exam.chat1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RsData<T> {
    private String resultConde;
    private String msg;
    private T data;
}
