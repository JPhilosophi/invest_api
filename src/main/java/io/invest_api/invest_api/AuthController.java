package io.invest_api.invest_api;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AuthController {

    private final String token = "t.jv5FgfQ837xhZaMsxC0JSqAya4VjFPmK4u7G3MY0sguh8EGGyyxSCIklZ5ipkov1po8E0mApiYY8u-2Is7egFQ";
    private final String url = "https://api-invest.tinkoff.ru/openapi/sandbox/sandbox/register";
    //private final String url = "http://localhost:5555";

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseEntity<ResponseRegistrer> register(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setBearerAuth(token);

        RegisterRequest tinkoff = new RegisterRequest("Tinkoff");

        //MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        //map.add("brokerAccountType", "Tinkoff");

        HttpEntity<RegisterRequest> entity = new HttpEntity<>(tinkoff, httpHeaders);

        //HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(map, httpHeaders);

        ResponseEntity<ResponseRegistrer> exchange = restTemplate.exchange(url, HttpMethod.POST, entity, ResponseRegistrer.class);
        
        return exchange;
    }
}