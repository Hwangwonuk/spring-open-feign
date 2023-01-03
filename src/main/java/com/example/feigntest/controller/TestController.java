/*
 * Created by Wonuk Hwang on 2023/01/03
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/03
 */
package com.example.feigntest.controller;

import com.example.feigntest.client.TestClient;
import com.example.feigntest.dto.Contributor;
import com.example.feigntest.service.TestService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class TestController {


  private final TestService testService;

  @GetMapping(value = "/v1/github/{owner}/{repo}")
  public List<Contributor> getGitHubContributors(@PathVariable String owner , @PathVariable String repo){
    return testService.getContributor(owner,repo);
  }
}
