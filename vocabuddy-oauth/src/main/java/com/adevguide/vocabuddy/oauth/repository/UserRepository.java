/**
 * 
 */
package com.adevguide.vocabuddy.oauth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adevguide.vocabuddy.oauth.entity.User;

/**
 * @author PraBhu
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

}
