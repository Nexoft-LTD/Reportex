package com.reportex.entity;

import lombok.*;

import javax.persistence.*;

@Table(name = "srx_user")
@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class User {

    @Id
    @SequenceGenerator(name = "seq_user_id", sequenceName = "seq_user_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_user_id", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "surname", length = 50)
    private String surname;

    @Column(name = "full_name", length = 100)
    private String fullName;

    @Column(name = "username", length = 100)
    private String userName;

    @Column(name = "password", length = 250)
    private String password;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "source", length = 50)
    private String source;
}
