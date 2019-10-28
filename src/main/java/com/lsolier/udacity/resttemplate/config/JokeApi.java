package com.lsolier.udacity.resttemplate.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class JokeApi {

  public RestTemplate restTemplate(RestTemplateBuilder builder) {
    return builder.build();
  }

}
