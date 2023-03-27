package org.example.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import java.time.LocalDate;

@Data
@Document
public class User {
    @Id
    private String id;

    @Field("email")
    private String email;

    @Field("full_name")
    private String fullName;

    @Field("birth_date")
    private LocalDate birthDate;

    @Field("gender")
    private String gender;

    @Field("sport")
    private Sport sport;
}
