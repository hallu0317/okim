package com.goorm.okim.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Getter
@DynamicInsert
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String profileImage;
    @Column
    @NotNull
    private String password;

    @Column(name = "nickname")
    private String nick;
    @Column
    private String selfDesc;
    @NotNull
    @Column
    @ColumnDefault("0")
    private boolean isWithdrawl;
    @Column
    private String githubId;

    public boolean isActive() {
        return !isWithdrawl;
    }
}
