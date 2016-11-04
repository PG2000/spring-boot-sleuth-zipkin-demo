package one.mothership;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/mothership-one-service/demo")
public class MothershipOneResource {

    private static Logger log = LoggerFactory.getLogger(MothershipOneResource.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<String> demo() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello -> mothership.one responds from mothership-service-one");

        ResponseEntity<String> response = restTemplate.getForEntity("http://mothership-service-two:8081/mothership-two-service/demo", String.class);

        stringList.add("Response from 2nd Service " + response.getBody());
        log.info(response.getHeaders().toString());
        return stringList;
    }
}
