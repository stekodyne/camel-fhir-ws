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
//"select p.name, e.event_datetime, q.ien id, q.units, e.device_type, e.results from com_qbase_jp_chcs.PATIENT p, com_qbase_jp_chcs.QBASE_PATIENT_EVENT_MONITORING_1 q, com_qbase_jp_chcs.EVENT_DATETIME_53001_01 e where p.ien = q.name and e.QBASE_PATIENT_EVENT_MONITORING_1 = q.ien and q.ien = ? order by e.device_type";
@Entity(name="DeviceObservation")
@Table(name="com_qbase_jp_chcs.event_datetime_53001_01")
@Data
public class DeviceObservation {

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
