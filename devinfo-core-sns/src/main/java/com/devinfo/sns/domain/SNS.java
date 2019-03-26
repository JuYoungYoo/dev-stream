package com.devinfo.sns.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sns")
@NoArgsConstructor
public class SNS {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(length =  500, nullable = false)
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    @Builder
    public SNS(String name, String title, String content) {
        this.name = name;
        this.title = title;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }
}