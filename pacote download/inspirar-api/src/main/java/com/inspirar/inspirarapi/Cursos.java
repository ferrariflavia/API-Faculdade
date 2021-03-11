package com.inspirar.inspirarapi;

import lombok.Data;
import org.springframework.dao.DataAccessException;

import javax.persistence.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;


@Data
@Entity
public class Cursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String curso;

    private BigDecimal valor;
    


}
