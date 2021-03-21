/**
 * 
 */
package com.adevguide.vocabuddy.oauth.entity;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author PraBhu
 *
 */

public class UserRoleId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "user_id")
	private Long userId;
	@Column(name = "role_id")
	private Long roleId;

	public UserRoleId(Long userId, Long roleId) {
		this.userId = userId;
		this.roleId = roleId;
	}

}
