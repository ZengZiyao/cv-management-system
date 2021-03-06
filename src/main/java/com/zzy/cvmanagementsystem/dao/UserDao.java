package com.zzy.cvmanagementsystem.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDao {
    @Id
    private String id;

    private String email;

    private String username;

    private String password;

    private String shortname;

    private String gsAuthorId;

}
