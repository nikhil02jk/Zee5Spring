package com.zee.zee5_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zee.zee5_app.dto.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, String> {

}
