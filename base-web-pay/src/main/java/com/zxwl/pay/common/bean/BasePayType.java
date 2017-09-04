package com.zxwl.pay.common.bean;

/**
 * 基础的支付类型
 * @author chendawei
 * <pre>
 *     email 1026022306@qq.com
 *     date 2016/11/20 0:47
 *  </pre>
 */
public interface BasePayType {


    /**
     * 根据支付类型获取交易类型
     * @param transactionType 类型值
     * @return  交易类型
     */
    TransactionType getTransactionType(String transactionType);

}
