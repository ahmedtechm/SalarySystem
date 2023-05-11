package com.codeline.Salary.System.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@Data

public class BaseEntity {

    Date createdDate;
    Date updatedDate;
    Boolean isActive;
}
