/*
 * Created by Wonuk Hwang on 2023/01/03
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/03
 */
package com.example.feigntest.dto;

import lombok.Data;

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
@Data
public class Contributor {
  String login;
  String id;
  String avatar_url;
  String url;
  String html_url;
  String followers_url;
  String following_url;
  String gists_url;
  String starred_url;
  String subscriptions;
  String organizations_url;
  String repos_url;
  String events_url;
  String received_events_url;
  String type;
  String site_admin;
  int contributions;
}
