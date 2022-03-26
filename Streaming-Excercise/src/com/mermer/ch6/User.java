package com.mermer.ch6;

import java.util.List;

public class User {

	private long id;
	private String name;
	private String email;
	private boolean isVerified;
	private List<Integer> friendUserIds;

	public long getId() {
		return id;
	}

	public User setId(long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public User setEmail(String email) {
		this.email = email;
		return this;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public User setVerified(boolean isVerified) {
		this.isVerified = isVerified;
		return this;
	}

	public List<Integer> getFriendUserIds() {
		return friendUserIds;
	}

	public User setFriendUserIds(List<Integer> friendUserIds) {
		this.friendUserIds = friendUserIds;
		return this;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", isVerified=" + isVerified
				+ ", friendUserIds=" + friendUserIds + "]";
	}

}
