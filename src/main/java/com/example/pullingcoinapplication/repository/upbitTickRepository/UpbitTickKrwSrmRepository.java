package com.example.pullingcoinapplication.repository.upbitTickRepository;


import com.example.pullingcoinapplication.entity.upbit.upbitTick.coins.UpbitTickKrwSrm;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UpbitTickKrwSrmRepository extends JpaRepository<UpbitTickKrwSrm, Long>, UpbitCommonJpaInterface {
        }