package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Available workflow types supported by a given instance of the service.
 */
@ApiModel(description = "Available workflow types supported by a given instance of the service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-06T19:34:19.690Z")

public class WorkflowTypeVersion   {
  @JsonProperty("workflow_type_version")
  @Valid
  private List<String> workflowTypeVersion = null;

  public WorkflowTypeVersion workflowTypeVersion(List<String> workflowTypeVersion) {
    this.workflowTypeVersion = workflowTypeVersion;
    return this;
  }

  public WorkflowTypeVersion addWorkflowTypeVersionItem(String workflowTypeVersionItem) {
    if (this.workflowTypeVersion == null) {
      this.workflowTypeVersion = new ArrayList<String>();
    }
    this.workflowTypeVersion.add(workflowTypeVersionItem);
    return this;
  }

  /**
   * an array of one or more acceptable types for the `workflow_type`
   * @return workflowTypeVersion
  **/
  @ApiModelProperty(value = "an array of one or more acceptable types for the `workflow_type`")


  public List<String> getWorkflowTypeVersion() {
    return workflowTypeVersion;
  }

  public void setWorkflowTypeVersion(List<String> workflowTypeVersion) {
    this.workflowTypeVersion = workflowTypeVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTypeVersion workflowTypeVersion = (WorkflowTypeVersion) o;
    return Objects.equals(this.workflowTypeVersion, workflowTypeVersion.workflowTypeVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowTypeVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTypeVersion {\n");
    
    sb.append("    workflowTypeVersion: ").append(toIndentedString(workflowTypeVersion)).append("\n");
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

