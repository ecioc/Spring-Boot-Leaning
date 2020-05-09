package com.unicompound.demo1.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysIni implements Serializable {
    private Long sysIniSerial;
    private String sysIniType;
    private String sysIniName;
    private String sysIniInfo;
    private int sysIniStatus;

}
