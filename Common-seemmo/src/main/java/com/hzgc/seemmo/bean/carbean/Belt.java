package com.hzgc.seemmo.bean.carbean;

import lombok.Data;

import java.io.Serializable;

//安全带
@Data
public class Belt implements Serializable {

    private boolean coDriver_noBelt;
    private boolean mainDriver_noBelt;
}
