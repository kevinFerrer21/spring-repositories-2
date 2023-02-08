package co.develhope.springrepositories2.entities;

import javax.persistence.*;

@Entity
@Table

public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    private int firstAppearance;
    @Column(nullable = false)
    private String inventor;

}