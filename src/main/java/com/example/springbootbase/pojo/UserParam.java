package com.example.springbootbase.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author weibing
 * @since 2023-10-10 10:54
 */
@Data
@AllArgsConstructor
public class UserParam {

    @NotNull
    private Integer id;

    private String name;
    @Min(0)
    private Integer age;

    @AssertTrue
    public boolean isValidName() {
        if (name == null) {
            return true;
        } else if (name != null && name.length() > 2) {
            return true;
        } else {
            return false;
        }
    }
}
