package com.datu.patient;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TileResponseEngagement implements java.io.Serializable {
  static final long serialVersionUID = 1L;
  private String actionName;
  private String actionValue;

  public TileResponseEngagement() {
  }

  public String getActionName() {
    return this.actionName;
  }

  public void setActionName(String actionName) {
    this.actionName = actionName;
  }

  public String getActionValue() {
    return this.actionValue;
  }

  public void setActionValue(String actionValue) {
    this.actionValue = actionValue;
  }

  public TileResponseEngagement(String actionName, String actionValue) {
    this.actionName = actionName;
    this.actionValue = actionValue;
  }
}