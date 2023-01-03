/*
 * Created by Wonuk Hwang on 2023/01/03
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/03
 */
package com.example.feigntest.util;

import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import feign.gson.GsonDecoder;
import java.io.IOException;
import java.lang.reflect.Type;
import lombok.extern.slf4j.Slf4j;

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
@Slf4j
public class GithubDecoder implements Decoder {

  /** 커스텀 디코드 함수
   *  헤더 체크가 필요하거나 리턴 데이터 파싱시 특정 로직을 추가하고 싶은경우 사용.
   * */
  @Override
  public Object decode(
      Response response, Type type) throws IOException, DecodeException, FeignException {
    //이상없음
    if(response.status() == 200){

      log.info("===============응답 200 정상===============");

      log.info("============Type 정보 -> ");
      log.info(type.getTypeName().toString());

      log.info("============Header 정보 -> ");
      log.info(response.headers().toString());

    }else{
      log.info("===============응답 확인필요" + String.valueOf(response.status()) + "===============");
    }

    return new GsonDecoder().decode(response,type);
  }
}
