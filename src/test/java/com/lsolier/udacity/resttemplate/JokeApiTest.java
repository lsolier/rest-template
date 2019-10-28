package com.lsolier.udacity.resttemplate;

import com.google.gson.Gson;
import com.lsolier.udacity.resttemplate.config.JokeApi;
import com.lsolier.udacity.resttemplate.dto.Joke;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Slf4j
@RunWith(MockitoJUnitRunner.class)
public class JokeApiTest {

  @Test
  public void testRestTemplate() {
    RestTemplate restTemplate = new RestTemplate();
    String resourceUrl = "https://official-joke-api.appspot.com/random_joke";
    ResponseEntity<Joke> response = restTemplate.getForEntity(resourceUrl, Joke.class);
    Map<String, String> mapHeaders = response.getHeaders().toSingleValueMap();
    mapHeaders.forEach((k, v) -> {
      log.info("clave={}", k);
      log.info("valor={}", v);
    });
    Joke joke = response.getBody();
    log.info(joke.toString());
    Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
  }
}
