package com.example.pullingcoinapplication.repository.upbitTickRepository;


import com.example.pullingcoinapplication.entity.upbit.upbitTick.coins.UpbitTickKrwEnj;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitTickKrwEnjRepository extends JpaRepository<UpbitTickKrwEnj, Long>, UpbitCommonJpaInterface {
        }