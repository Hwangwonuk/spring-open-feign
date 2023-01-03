/*
 * Created by Wonuk Hwang on 2023/01/03
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/03
 */
package com.example.feigntest.service;

import com.example.feigntest.client.TestClient;
import com.example.feigntest.dto.Contributor;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
@RequiredArgsConstructor
@Service
public class TestService {

  private final TestClient testClient;

  public List<Contributor> getContributor(String owner, String repo) {
    List<Contributor> contributors = testClient.getContributor(owner, repo);
    return contributors;
  }

}
