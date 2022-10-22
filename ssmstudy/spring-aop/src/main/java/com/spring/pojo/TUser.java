package com.spring.pojo;


public class TUser {

  private Integer userId;
  private String username;
  private Integer balance;

  public TUser() {
  }

  public TUser(Integer userId, String username, Integer balance) {
    this.userId = userId;
    this.username = username;
    this.balance = balance;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "TUser{" +
            "userId=" + userId +
            ", username='" + username + '\'' +
            ", balance=" + balance +
            '}';
  }
}
