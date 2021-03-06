package org.github.finance.mall.bank.dao.entity;

import java.util.Date;

import org.github.finance.mall.share.NotNull;

import lombok.Data;

/**
 * @author ligaofeng 2017年1月12日 下午8:03:29
 */
@NotNull
@Data
public class BankAccountEntity {

    private String id;

    private String userId;

    private String cardNo;

    private String bankPhone;

    private String bankName;

    private String certNo;

    private String status;

    private String isDeleted;

    private String creator;

    private String modifier;

    private Date   gmtCreated;

    private Date   gmtModified;

}
