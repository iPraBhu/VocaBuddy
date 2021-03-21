/**
 * 
 */
package com.adevguide.vocabuddy.oauth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adevguide.vocabuddy.oauth.entity.Role;
import com.adevguide.vocabuddy.oauth.enums.RoleEnum;

/**
 * @author PraBhu
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(RoleEnum name);

}
