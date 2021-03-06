package com.devinfo.video.domain;


import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
    @MappedSuperclass    // BaseTimeEntity 상속할 경우 하위 column으로 인식
@EntityListeners(AuditingEntityListener.class)
    public abstract class BaseTimeEntity {

        @CreatedDate
        private LocalDateTime createdDate;

        @LastModifiedDate
        private LocalDateTime modifiedDate;

    }
