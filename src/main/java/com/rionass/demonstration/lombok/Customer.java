package com.rionass.demonstration.lombok;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data // == ( @ToString - @EqualsAndHashCode - @Getter - @Setter )
public class Customer {

    @Id
    @SequenceGenerator(
            name="costumer_sequence",
            sequenceName = "costumer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "costumer_sequence"
    )
    private Long id;
    private String name;
    private String password;
    private String email;

    public Customer(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
