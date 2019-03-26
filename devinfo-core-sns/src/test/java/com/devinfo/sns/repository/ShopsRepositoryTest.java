package com.devinfo.sns.repository;

import com.devinfo.sns.domain.Shops;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopsRepositoryTest {

    @Autowired
    private ShopsRepository shopsRepository;

    @After
    public void cleanup() throws Exception {
        shopsRepository.deleteAll();
    }

    @Test
    public void 쇼핑고객_저장() {
        // given
        LocalDateTime now = LocalDateTime.now();
        Shops shop = Shops.builder().address("test2@gmail.com").name("저장").build();
        shopsRepository.save(shop);

        // when
        List<Shops> shops = shopsRepository.findAll();

        // then
        Shops result = shops.get(shops.size() - 1);
        assertThat(result.getName(), is("저장"));
        assertThat(result.getAddress(), is("test2@gmail.com"));

    }

    @Test
    public void 쇼핑고객_불러오기() {
        //given
        shopsRepository.save(Shops.builder().name("테스트1")
        .address("test@naver.com").build());

        //when
        List<Shops> shops = shopsRepository.findAll();

        //then
        Shops shop = shops.get(shops.size()-1);
        assertThat(shop.getName(), is("테스트1"));
        assertThat(shop.getAddress(), is("test@naver.com"));
    }
}