package com.example.yenbang.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.IdGeneratorType;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_index;

    @Column(nullable = false)
    private String user_id;

    @Column(nullable = false)
    private String user_pw;

    @Column(nullable = false)
    private String user_name;

    @Column(nullable = false)
    private String user_email;

    @Column(nullable = false)
    private String user_phone;

    @Column
    private String business_num;

    @Comment("0 : admin, 1 : seller, 2 : normal")
    @Column(nullable = false)
    private int user_level;
}
