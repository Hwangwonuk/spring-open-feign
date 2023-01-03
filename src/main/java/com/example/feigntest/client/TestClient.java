/*
 * Created by Wonuk Hwang on 2023/01/03
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/03
 */
package com.example.feigntest.client;

import com.example.feigntest.config.Config;
import com.example.feigntest.dto.Contributor;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * create on 2023/01/03. create by IntelliJ IDEA.
 *
 * <p> Feign Client 인터페이스 </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */
@FeignClient(value = "test", url = "https://api.github.com/repos", configuration = Config.class)
public interface TestClient {

  @GetMapping(value = "/{owner}/{repo}/contributors")
  List<Contributor> getContributor(@PathVariable("owner") String owner, @PathVariable("repo") String repo);
}
