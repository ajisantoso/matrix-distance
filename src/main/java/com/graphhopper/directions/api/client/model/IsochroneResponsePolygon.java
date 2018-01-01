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
import com.graphhopper.directions.api.client.model.IsochroneResponsePolygonGeometry;
import com.graphhopper.directions.api.client.model.IsochroneResponsePolygonProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A found path
 */
@ApiModel(description = "A found path")

public class IsochroneResponsePolygon {
  @SerializedName("properties")
  private IsochroneResponsePolygonProperties properties = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("geometry")
  private IsochroneResponsePolygonGeometry geometry = null;

  public IsochroneResponsePolygon properties(IsochroneResponsePolygonProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(example = "null", value = "")
  public IsochroneResponsePolygonProperties getProperties() {
    return properties;
  }

  public void setProperties(IsochroneResponsePolygonProperties properties) {
    this.properties = properties;
  }

  public IsochroneResponsePolygon type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IsochroneResponsePolygon geometry(IsochroneResponsePolygonGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public IsochroneResponsePolygonGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(IsochroneResponsePolygonGeometry geometry) {
    this.geometry = geometry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IsochroneResponsePolygon isochroneResponsePolygon = (IsochroneResponsePolygon) o;
    return Objects.equals(this.properties, isochroneResponsePolygon.properties) &&
        Objects.equals(this.type, isochroneResponsePolygon.type) &&
        Objects.equals(this.geometry, isochroneResponsePolygon.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, type, geometry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsochroneResponsePolygon {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
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

