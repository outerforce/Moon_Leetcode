package com.company;

/**
 * @author created by Ying
 * Date: 2018-10-30
 */
public class ExternalClass {
    public SecurityClass securityObject;

    public SecurityClass newSecurityObject(){
        return null;//securityObject.clone();
    }
    public SecurityClass getSecurityObject(){
        return securityObject;

    }

    public void setSecurityObject(SecurityClass securityObject){
        this.securityObject = securityObject;

    }
}
