package com.example.memo.dto;

import lombok.Getter;

@Getter
public class MemoRequestDto {
    // 요청받을 데이터는 아래 내용입니다.
    private String title;
    private String contents;
}
