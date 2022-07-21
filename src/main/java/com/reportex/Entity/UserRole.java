package com.reportex.Entity;

import lombok.*;

import javax.persistence.*;

@Table(name = "srx_user_role")
@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class UserRole {

    @Id
    @SequenceGenerator(name = "seq_userrole_id", sequenceName = "seq_userrole_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_userrole_id", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "report_parent_id")
    private Integer reportParentId;

    @Column(name = "report_id")
    private Integer reportId;

    @Column(name = "permission", length = 50)
    private String permission;
}
