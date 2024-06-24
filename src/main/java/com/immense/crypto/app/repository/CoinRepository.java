package com.immense.crypto.app.repository;


import com.immense.crypto.app.model.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<Coin,String> {
}
