package com.stephen.websocket.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "user")
public class User {
    @Id
    private String nickname;
    private String fullname;
    private Status status;
}
