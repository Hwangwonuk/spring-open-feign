/*
 * Created by Wonuk Hwang on 2023/01/06
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/06
 */
package com.example.feigntest2.service;

import com.example.feigntest.dto.Contributor;
import com.example.feigntest2.client.GitHubClient;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.stereotype.Service;

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
@Slf4j
@RequiredArgsConstructor
@Service
public class GitHubService {

  private final GitHubClient gitHubClient;

  private final ApplicationContext applicationContext;

  public List<Contributor> getGitHubContributors(String owner, String repo){
    log.info("==================================tag=====================================");
    log.info(String.valueOf(gitHubClient.getClass().hashCode()));

    return gitHubClient.contributors(owner,repo);
  }
}
