package com.trkj.trainingprojects.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * memorandumattachment
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "register")
public class Memorandumattachment implements Serializable {
    private Integer memorandumattachmentId;
    private Integer zsisexamine;
    private Date zsexaminetime;
    private String zsexaminename;
    private Date zsrevoketime;
    private String zsrevokename;
    private Integer jwisexamine;
    private Date jwexaminetime;
    private String jwexaminename;
    private Date jwrevoketime;
    private String jwrevokename;
    private Integer registerId;
    private Register register;
    private Integer jjexamine;

    private static final long serialVersionUID = 1L;
}