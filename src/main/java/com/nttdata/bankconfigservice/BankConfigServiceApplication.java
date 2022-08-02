package com.nttdata.bankconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * Bank Config Service Application.
 *
 * @author jmacoele
 *
 */

@EnableConfigServer
@SpringBootApplication
public class BankConfigServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(BankConfigServiceApplication.class, args);
  }
}
