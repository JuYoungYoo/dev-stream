package com.devinfo.sns.dto;

import com.devinfo.sns.domain.Shops;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ShopsRequestDto {

    private Long id;
    private String name;
    private String address;

    public Shops toEntity(){
        return Shops.builder()
                .name(name)
                .address(address)
                .build();
    }

}
