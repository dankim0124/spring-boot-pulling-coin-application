package com.example.pullingcoinapplication.repository.upbitTickRepository;


import com.example.pullingcoinapplication.entity.upbit.upbitTick.coins.UpbitTickKrwBch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitTickKrwBchRepository extends JpaRepository<UpbitTickKrwBch, Long>, UpbitCommonJpaInterface {
}