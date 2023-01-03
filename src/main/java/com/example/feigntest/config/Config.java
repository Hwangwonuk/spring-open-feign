/*
 * Created by Wonuk Hwang on 2023/01/03
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/03
 */
package com.example.feigntest.config;

import com.example.feigntest.util.GithubDecoder;
import feign.Logger;
import feign.codec.Decoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * create on 2023/01/03. create by IntelliJ IDEA.
 *
 * <p> </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */
@Configuration
public class Config {

  // feign Logging 처리
  @Bean
  Logger.Level feignLoggerLevel() {
    return Logger.Level.FULL;
  }

  // feign Custom Decoder
  @Bean
  Decoder feignDecoder() {
    return new GithubDecoder();
  }

}
