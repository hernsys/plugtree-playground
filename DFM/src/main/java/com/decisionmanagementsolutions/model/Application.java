package com.decisionmanagementsolutions.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label(value = "Application")
public class Application implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "riskScore")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.Integer riskScore;

    public Application() {
    }
    
    public Application(java.lang.Integer riskScore) {
        this.riskScore = riskScore;
    }

    public java.lang.Integer getRiskScore() {
        return this.riskScore;
    }
    
    public void setRiskScore(java.lang.Integer riskScore) {
        this.riskScore = riskScore;
    }

}