package com.trkj.trainingprojects.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class ArrangeFormVo {
    private Integer classRoomId;
    private Integer classesId;
    private String date;
    private Integer periodId;
}
