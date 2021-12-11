package com.peng.c2;

import java.math.BigDecimal;

/**
 * @author weiyupeng
 * @create 2021/12/11 18:01
 */
public abstract class Wallet {
    private String id;
    private long createTime;

    /**
     * 余额
     */
    private BigDecimal balance;
    private long balanceLastModifiedTime;

    // String getId();
    // long getCreateTime();
    // BigDecimal getBalance();
    // long getBalanceLastModifiedTime();
    // void increaseBalance(BigDecimal increasedAmount);
    // void decreaseBalance(BigDecimal decreasedAmount);

}
