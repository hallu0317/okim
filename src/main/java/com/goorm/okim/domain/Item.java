package com.goorm.okim.domain;

import com.goorm.okim.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@DynamicInsert
@Getter
@Builder
@AllArgsConstructor
public class Item extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String title;
    @Column
    @ColumnDefault("0")
    private boolean isDone;
    @Column
    private long taskId;
    @Column
    @CreatedDate
    private LocalDateTime finishedAt;
}
