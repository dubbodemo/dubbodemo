package org.aaa.dubbo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private static final long serialVersionUID = 8728327146677888239L;

    private Integer userId;

    private String  userName;
}
