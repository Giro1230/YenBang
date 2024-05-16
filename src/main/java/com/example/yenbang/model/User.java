package com.example.yenbang.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data
public class User {
    Long user_index;
    String user_id;
    String user_pw;
    int user_phone;
    int user_type;
    boolean user_status;
    Date user_create_dttm;
    Date user_update_dttm;
    Date user_delete_dttm;

    /**
     * 회원 가입
     * @param user_id 아이디
     * @param user_pw 비밀번호
     * @param user_phone 핸드폰 번호
     * @param user_type 유저 타입 (0 : 운영자, 1 : 사업자, 2 : 일반)
     * @param user_status 유저 상태 (0 : 가입, 1 : 탈퇴)
     * @param user_create_dttm 데이터 생성날짜
     * */
    public User(String user_id, String user_pw, int user_phone, int user_type, int user_status, Date user_create_dttm) {
        this.user_id = user_id;
        this.user_pw = user_pw;
        this.user_phone = user_phone;
        this.user_type = user_type;
        this.user_status = user_status == 0;
        this.user_create_dttm = user_create_dttm;
    }

    /**
     * 회원 수정 및 탈퇴
     * @param user_index index 값
     * @param user_id 아이디
     * @param user_pw 비밀번호
     * @param user_phone 핸드폰 번호
     * @param user_type 유저 타입 (0 : 운영자, 1 : 사업자, 2 : 일반)
     * @param user_status 유저 상태 (0 : 탈퇴, 1 : 가입)
     * @param user_time_data 유저 시간 데이터
     */
    public User(Long user_index, String user_id, String user_pw, int user_phone, int user_type, int user_status, Date user_time_data) {

        boolean user_status_boolean = user_status == 1;

        this.user_index = user_index;
        this.user_id = user_id;
        this.user_pw = user_pw;
        this.user_phone = user_phone;
        this.user_type = user_type;
        this.user_status = user_status_boolean;

        if(user_status_boolean)this.user_update_dttm = user_time_data;
        else this.user_delete_dttm = user_time_data;
    }


//    public String Encrypt(){
//        return ;
//    }
//
//    public String Decrypt(){
//        return ;
//    }

    @Override
    public String toString() {
        return "User{" +
                "user_index=" + user_index +
                ", user_id='" + user_id + '\'' +
                ", user_pw='" + user_pw + '\'' +
                ", user_phone=" + user_phone +
                ", user_type=" + user_type +
                ", user_status=" + user_status +
                ", user_create_dttm=" + user_create_dttm +
                ", user_update_dttm=" + user_update_dttm +
                ", user_delete_dttm=" + user_delete_dttm +
                '}';
    }
}
