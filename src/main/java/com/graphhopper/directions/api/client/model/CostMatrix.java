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
import com.graphhopper.directions.api.client.model.CostMatrixData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * CostMatrix
 */

public class CostMatrix {
  /**
   * type of cost matrix, currently default or google are supported
   */
  public enum TypeEnum {
    @SerializedName("default")
    DEFAULT("default"),
    
    @SerializedName("google")
    GOOGLE("google");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("location_ids")
  private List<String> locationIds = new ArrayList<String>();

  @SerializedName("data")
  private CostMatrixData data = null;

  @SerializedName("profile")
  private String profile = null;

  public CostMatrix type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * type of cost matrix, currently default or google are supported
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "type of cost matrix, currently default or google are supported")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CostMatrix url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of matrix service
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "URL of matrix service")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CostMatrix locationIds(List<String> locationIds) {
    this.locationIds = locationIds;
    return this;
  }

  public CostMatrix addLocationIdsItem(String locationIdsItem) {
    this.locationIds.add(locationIdsItem);
    return this;
  }

   /**
   * Get locationIds
   * @return locationIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getLocationIds() {
    return locationIds;
  }

  public void setLocationIds(List<String> locationIds) {
    this.locationIds = locationIds;
  }

  public CostMatrix data(CostMatrixData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public CostMatrixData getData() {
    return data;
  }

  public void setData(CostMatrixData data) {
    this.data = data;
  }

  public CostMatrix profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * vehicle profile or empty if catch all fallback
   * @return profile
  **/
  @ApiModelProperty(example = "null", value = "vehicle profile or empty if catch all fallback")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostMatrix costMatrix = (CostMatrix) o;
    return Objects.equals(this.type, costMatrix.type) &&
        Objects.equals(this.url, costMatrix.url) &&
        Objects.equals(this.locationIds, costMatrix.locationIds) &&
        Objects.equals(this.data, costMatrix.data) &&
        Objects.equals(this.profile, costMatrix.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url, locationIds, data, profile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostMatrix {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

