/*
 * Created by Wonuk Hwang on 2023/01/05
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/05
 */
package com.example.feigntest2.dto;

import lombok.Data;

/**
 * create on 2023/01/05. create by IntelliJ IDEA.
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
public class IssueDto {
  String title;
  String body;
  String milestone;
  String repositoryUrl;
}
