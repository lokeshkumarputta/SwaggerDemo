/**
 * 
 */
package com.swagger.SwaggerDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author lputta
 *
 */
@RestController
public class SwaggerController {

	@RequestMapping(method = RequestMethod.GET, value="/api/swagger/hello")
	public String HelloSwagger() {
		return "Hello swagger";
	}
	@ApiOperation(value="post operation")
	@RequestMapping(method = RequestMethod.POST, value = "/api/swagger/posttest")
	public String PostTestSwagger(@ApiParam(value = "testparam", required = true) final String testparam) {
//		System.out.println(testparam);
		return testparam;
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/swagger/deletetest")
	public String DeleteTestSwagger() {
		
		return "test Delete";
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/api/swagger/puttest")
	public String PUTTestSwagger() {
		
		return "test Put";
	}
}
