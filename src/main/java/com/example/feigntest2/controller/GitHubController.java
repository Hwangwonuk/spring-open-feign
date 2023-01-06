/*
 * Created by Wonuk Hwang on 2023/01/06
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/06
 */
package com.example.feigntest2.controller;

import com.example.feigntest.dto.Contributor;
import com.example.feigntest2.service.GitHubService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * create on 2023/01/06. create by IntelliJ IDEA.
 *
 * <p> </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */
@RequiredArgsConstructor
@RestController
public class GitHubController {

  private final GitHubService gitHubService;

  @GetMapping(value = "/github/{owner}/{repo}")
  public List<Contributor> getGitHubContributors(@PathVariable String owner , @PathVariable String repo){
    return gitHubService.getGitHubContributors(owner, repo);
  }
}
