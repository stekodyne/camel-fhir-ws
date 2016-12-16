package com.csra.model.chcs;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by steffen on 12/15/16.
 */
@Entity(name="Observation")
@Table(name="com_qbase_jp_chcs.event_datetime_53001_01")
@Data
public class Observation {

    @Id
    @Column(name="rowid")
    String rowId;

    @Column(name="qbase_patient_event_monitoring_1")
    String patientId;

    @Column(name="event_datetime")
    Date eventDateTime;

    @Column(name="device_types")
    String deviceTypes;

    @Column(name="units")
    String units;

    @Column(name="results")
    String results;

    @Column(name="ordering_provider")
    String orderingProvider;
}
