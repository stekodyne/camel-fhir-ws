package com.csra.model.chcs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import lombok.Data;

/**
 * Created by steffen on 12/14/16.
 */
@Entity(name="Patient")
@Table(name="com_qbase_jp_chcs.patient")
@Data
public class Patient {

    @Column(name="name")
    private String name;

    @Id
    @Column(name="ien")
    private String ien;

    @Column(name="sex")
    private String sex;

    @Column(name="dob")
    private Date dateOfBirth;

    @Column(name="ssn")
    private String ssn;

}