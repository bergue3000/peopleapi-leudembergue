package one.digitalinnovation.personapi.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    @ApiOperation(value = "Return an example api test ")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success method retun")
    })
    @GetMapping
    public String getBook(){

        return "API Test";
    }

}
