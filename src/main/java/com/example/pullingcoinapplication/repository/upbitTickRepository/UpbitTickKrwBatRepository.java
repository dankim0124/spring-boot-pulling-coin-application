package com.example.pullingcoinapplication.repository.upbitTickRepository;


import com.example.pullingcoinapplication.entity.upbit.upbitTick.coins.UpbitTickKrwBat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitTickKrwBatRepository extends JpaRepository<UpbitTickKrwBat, Long>, UpbitCommonJpaInterface {
        }