package com.dc.cloud.cloudserver.dao;

import com.dc.cloud.cloudserver.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author DC
 * @Date 2019-11-05
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
