package com.nikhilb.Springbootjpalucentasg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nikhilb.Springbootjpalucentasg.model.Subscriber;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Integer>{

}
