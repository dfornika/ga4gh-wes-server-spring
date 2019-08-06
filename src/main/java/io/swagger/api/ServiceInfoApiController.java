package io.swagger.api;

import io.swagger.model.ErrorResponse;
import io.swagger.model.ServiceInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-06T19:34:19.690Z")

@Controller
public class ServiceInfoApiController implements ServiceInfoApi {

    private static final Logger log = LoggerFactory.getLogger(ServiceInfoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ServiceInfoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ServiceInfo> getServiceInfo() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceInfo>(objectMapper.readValue("{  \"system_state_counts\" : {    \"key\" : 0  },  \"supported_wes_versions\" : [ \"supported_wes_versions\", \"supported_wes_versions\" ],  \"supported_filesystem_protocols\" : [ \"supported_filesystem_protocols\", \"supported_filesystem_protocols\" ],  \"auth_instructions_url\" : \"auth_instructions_url\",  \"workflow_engine_versions\" : {    \"key\" : \"workflow_engine_versions\"  },  \"contact_info_url\" : \"contact_info_url\",  \"workflow_type_versions\" : {    \"key\" : {      \"workflow_type_version\" : [ \"workflow_type_version\", \"workflow_type_version\" ]    }  },  \"default_workflow_engine_parameters\" : [ {    \"name\" : \"name\",    \"default_value\" : \"default_value\",    \"type\" : \"type\"  }, {    \"name\" : \"name\",    \"default_value\" : \"default_value\",    \"type\" : \"type\"  } ],  \"tags\" : {    \"key\" : \"tags\"  }}", ServiceInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

}