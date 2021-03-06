package com.decisionmanagementsolutions.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label(value = "PostBureauData")
public class PostBureauData implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "affordability")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.Boolean affordability;

    @org.kie.api.definition.type.Label(value = "riskCategory")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String riskCategory;

    public PostBureauData() {
    }
    
    public PostBureauData(java.lang.String riskCategory, java.lang.Boolean affordability) {
        this.riskCategory = riskCategory;
        this.affordability = affordability;
    }

    public java.lang.Boolean getAffordability() {
        return this.affordability;
    }
    
    public void setAffordability(java.lang.Boolean affordability) {
        this.affordability = affordability;
    }

    public java.lang.String getRiskCategory() {
        return this.riskCategory;
    }
    
    public void setRiskCategory(java.lang.String riskCategory) {
        this.riskCategory = riskCategory;
    }

}