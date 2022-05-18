package com.example.pullingcoinapplication.repository.upbitTickRepository;

import com.example.pullingcoinapplication.entity.upbit.upbitTick.coins.UpbitTickKrwStx;
import com.example.pullingcoinapplication.entity.upbit.upbitTick.coins.UpbitTickKrwXrp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpbitTickKrwXrpRepository extends JpaRepository<UpbitTickKrwXrp,Long>, UpbitCommonJpaInterface {
}
