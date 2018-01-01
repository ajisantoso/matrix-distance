/*
 * GraphHopper Directions API
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.graphhopper.directions.api.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Additional information for your request
 */
@ApiModel(description = "Additional information for your request")

public class CostMatrixDataInfo {
  @SerializedName("copyrights")
  private List<String> copyrights = new ArrayList<String>();

  @SerializedName("took")
  private Double took = null;

  public CostMatrixDataInfo copyrights(List<String> copyrights) {
    this.copyrights = copyrights;
    return this;
  }

  public CostMatrixDataInfo addCopyrightsItem(String copyrightsItem) {
    this.copyrights.add(copyrightsItem);
    return this;
  }

   /**
   * Get copyrights
   * @return copyrights
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getCopyrights() {
    return copyrights;
  }

  public void setCopyrights(List<String> copyrights) {
    this.copyrights = copyrights;
  }

  public CostMatrixDataInfo took(Double took) {
    this.took = took;
    return this;
  }

   /**
   * Get took
   * @return took
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTook() {
    return took;
  }

  public void setTook(Double took) {
    this.took = took;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostMatrixDataInfo costMatrixDataInfo = (CostMatrixDataInfo) o;
    return Objects.equals(this.copyrights, costMatrixDataInfo.copyrights) &&
        Objects.equals(this.took, costMatrixDataInfo.took);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyrights, took);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostMatrixDataInfo {\n");
    
    sb.append("    copyrights: ").append(toIndentedString(copyrights)).append("\n");
    sb.append("    took: ").append(toIndentedString(took)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

