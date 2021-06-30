package com.trkj.trainingprojects.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class PageInfoVo {
    private Integer currentPage;
    private Integer pagesize;
    private Integer total;
    private String value;
}
