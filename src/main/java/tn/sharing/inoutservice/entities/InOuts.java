package tn.sharing.inoutservice.entities;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "in_outs")
public class InOuts {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private Long userId;
}
