package tn.sharing.inoutservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.sql.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "live_in_outs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LiveInOut {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private Long userId;

    private Long enterpriseId;

    private String employeeName;

    private Date startDate;

    private Date endDate;

    private boolean booked = false;




}
