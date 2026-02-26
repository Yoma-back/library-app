package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {

    private String name;
    private Integer age;  // int는 null을 표현할 수 없는 기본 자료형이고, Integer은 null을 표현할 수 있다.

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
