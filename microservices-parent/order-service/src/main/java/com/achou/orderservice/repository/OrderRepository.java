package com.achou.orderservice.repository;

import com.achou.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
/*
A JPA (Java Persistence API) repository, often referred to as a JPA repository or simply a repository,
is a part of the Spring Data JPA framework. It provides a convenient way to interact with a
relational database using Java objects,
particularly when building Java applications that use the JPA for data access.
We won't use MongoRepository because Mongo is NoSQL
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}