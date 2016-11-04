package one.mothership;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/mothership-two-service/demo")
public class MothershipOneResource {

    private static Logger log = LoggerFactory.getLogger(MothershipOneResource.class);

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<String> demo() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello -> mothership.one responds from mothership-service-two");
        return stringList;
    }
}
