package com.unicompound.demo1.model.edc;

import lombok.Data;

import java.io.Serializable;

@Data
public class CmtsServer implements Serializable {
    private static final long serialVersionUID = 1L;
    private int serial;
    private String dbSrv;
    private String aliasName;
    private String userName;
    private String password;
    private String timeOut;
    private int poolMin;
    private int poolMax;
    private int poolOptimal;
    private int logSql;
    private int timeSpec;
    private int idleTimeOut;
    private int reConnect;
    private String fErrPrefix;
    private int autoDrop;
}
