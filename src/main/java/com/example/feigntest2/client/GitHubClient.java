/*
 * Created by Wonuk Hwang on 2023/01/06
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/06
 */
package com.example.feigntest2.client;

import com.example.feigntest.dto.Contributor;
import com.example.feigntest2.dto.IssueDto;
import feign.Param;
import feign.RequestLine;
import java.util.List;

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
public interface GitHubClient {

  @RequestLine("GET /repos/{owner}/{repo}/contributors")
  List<Contributor> contributors(@Param("owner") String owner, @Param("repo") String repo);

  @RequestLine("GET /repos/{owner}/{repo}/issues")
  List<IssueDto> getIssues(@Param("owner") String owner, @Param("repo") String repo);
}

