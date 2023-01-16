package com.petspace.dev.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BaseResponseStatus {

    /**
     * 1000 : 요청 성공
     */
    SUCCESS(true, 1000, "요청에 성공하였습니다."),
    NON_DUPLICATE_EMAIL(true, 1010, "사용가능한 이메일입니다."),

    /**
     * 2000 : Request 오류
     */

    // Validation 예외
    INVALID_INPUT(false, 2000, "입력값을 확인해주세요."),

    // JWT 예외
    EMPTY_JWT(false, 2001, "JWT를 입력해주세요."),
    INVALID_JWT(false, 2002, "유효하지 않은 JWT입니다."),
    INVALID_USER_JWT(false, 2003, "권한이 없는 유저의 접근입니다."),
    INVALID_USER_EXIST(false, 2004, "존재하지 않는 유저의 접근입니다."),

    // UserException
    DUPLICATED_EMAIL(false, 2010, "중복된 이메일입니다."),
    INVALID_CHECKED_PASSWORD(false, 2011, "비밀번호 확인 값이 다릅니다."),
    INVALID_EMAIL_OR_PASSWORD(false, 2011, "이메일 혹은 비밀번호가 잘못되었습니다."),

    /**
     * 3000 : Response 오류
     */
    // Common
    RESPONSE_ERROR(false, 3000, "값을 불러오는데 실패하였습니다."),

    /**
     * 4000 : Database, Server 오류
     */
    DATABASE_ERROR(false, 4000, "데이터베이스 연결에 실패하였습니다."),
    SERVER_ERROR(false, 4001, "서버와의 연결에 실패하였습니다."),


    /**
     * 5000 : Room 오류
     */


    /**
     * 6000 : Review 오류
     */
    POST_REVIEW_EMPTY_RESERVATION(false, 6000, "해당 예약이 존재하지 않습니다."),
    POST_REVIEW_EMPTY_SCORE(false, 6001, "score를 입력해주세요.");



    private final boolean isSuccess;
    private final int responseCode;
    private final String responseMessage;
}
