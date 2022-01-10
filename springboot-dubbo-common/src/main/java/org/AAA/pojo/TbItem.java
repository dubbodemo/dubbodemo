package org.AAA.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbItem implements Serializable {
    private Long id;
    private String title;
    private Double price;
}
