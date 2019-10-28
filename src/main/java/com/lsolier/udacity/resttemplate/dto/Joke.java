package com.lsolier.udacity.resttemplate.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@NoArgsConstructor
public class Joke {

  private Long id;
  private String type;
  private String setup;
  private String punchline;

}
