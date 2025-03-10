package lab6.lab6.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import lab6.lab6.entity.Order;

public interface OrderDAO extends JpaRepository<Order, Long>{}
