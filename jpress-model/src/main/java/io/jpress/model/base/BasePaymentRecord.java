package io.jpress.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePaymentRecord<M extends BasePaymentRecord<M>> extends JbootModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setProductType(java.lang.String productType) {
		set("product_type", productType);
	}
	
	public java.lang.String getProductType() {
		return getStr("product_type");
	}

	public void setProductId(java.lang.Long productId) {
		set("product_id", productId);
	}
	
	public java.lang.Long getProductId() {
		return getLong("product_id");
	}

	public void setProductName(java.lang.String productName) {
		set("product_name", productName);
	}
	
	public java.lang.String getProductName() {
		return getStr("product_name");
	}

	public void setTrxNo(java.lang.String trxNo) {
		set("trx_no", trxNo);
	}
	
	public java.lang.String getTrxNo() {
		return getStr("trx_no");
	}

	public void setTrxType(java.lang.String trxType) {
		set("trx_type", trxType);
	}
	
	public java.lang.String getTrxType() {
		return getStr("trx_type");
	}

	public void setTrxNonceStr(java.lang.String trxNonceStr) {
		set("trx_nonce_str", trxNonceStr);
	}
	
	public java.lang.String getTrxNonceStr() {
		return getStr("trx_nonce_str");
	}

	public void setPayerUserId(java.lang.String payerUserId) {
		set("payer_user_id", payerUserId);
	}
	
	public java.lang.String getPayerUserId() {
		return getStr("payer_user_id");
	}

	public void setPayerName(java.lang.String payerName) {
		set("payer_name", payerName);
	}
	
	public java.lang.String getPayerName() {
		return getStr("payer_name");
	}

	public void setPayerFee(java.math.BigDecimal payerFee) {
		set("payer_fee", payerFee);
	}
	
	public java.math.BigDecimal getPayerFee() {
		return get("payer_fee");
	}

	public void setOrderIp(java.lang.String orderIp) {
		set("order_ip", orderIp);
	}
	
	public java.lang.String getOrderIp() {
		return getStr("order_ip");
	}

	public void setOrderRefererUrl(java.lang.String orderRefererUrl) {
		set("order_referer_url", orderRefererUrl);
	}
	
	public java.lang.String getOrderRefererUrl() {
		return getStr("order_referer_url");
	}

	public void setOrderFrom(java.lang.String orderFrom) {
		set("order_from", orderFrom);
	}
	
	public java.lang.String getOrderFrom() {
		return getStr("order_from");
	}

	public void setPayStatus(java.lang.Integer payStatus) {
		set("pay_status", payStatus);
	}
	
	public java.lang.Integer getPayStatus() {
		return getInt("pay_status");
	}

	public void setPayType(java.lang.String payType) {
		set("pay_type", payType);
	}
	
	public java.lang.String getPayType() {
		return getStr("pay_type");
	}

	public void setPayBankType(java.lang.String payBankType) {
		set("pay_bank_type", payBankType);
	}
	
	public java.lang.String getPayBankType() {
		return getStr("pay_bank_type");
	}

	public void setPayAmount(java.math.BigDecimal payAmount) {
		set("pay_amount", payAmount);
	}
	
	public java.math.BigDecimal getPayAmount() {
		return get("pay_amount");
	}

	public void setPaySuccessAmount(java.math.BigDecimal paySuccessAmount) {
		set("pay_success_amount", paySuccessAmount);
	}
	
	public java.math.BigDecimal getPaySuccessAmount() {
		return get("pay_success_amount");
	}

	public void setPaySuccessTime(java.util.Date paySuccessTime) {
		set("pay_success_time", paySuccessTime);
	}
	
	public java.util.Date getPaySuccessTime() {
		return get("pay_success_time");
	}

	public void setPayCompleteTime(java.util.Date payCompleteTime) {
		set("pay_complete_time", payCompleteTime);
	}
	
	public java.util.Date getPayCompleteTime() {
		return get("pay_complete_time");
	}

	public void setRefundNo(java.lang.String refundNo) {
		set("refund_no", refundNo);
	}
	
	public java.lang.String getRefundNo() {
		return getStr("refund_no");
	}

	public void setRefundAmount(java.lang.Integer refundAmount) {
		set("refund_amount", refundAmount);
	}
	
	public java.lang.Integer getRefundAmount() {
		return getInt("refund_amount");
	}

	public void setRefundDesc(java.lang.String refundDesc) {
		set("refund_desc", refundDesc);
	}
	
	public java.lang.String getRefundDesc() {
		return getStr("refund_desc");
	}

	public void setRefundTime(java.util.Date refundTime) {
		set("refund_time", refundTime);
	}
	
	public java.util.Date getRefundTime() {
		return get("refund_time");
	}

	public void setThirdpartyAppid(java.lang.String thirdpartyAppid) {
		set("thirdparty_appid", thirdpartyAppid);
	}
	
	public java.lang.String getThirdpartyAppid() {
		return getStr("thirdparty_appid");
	}

	public void setThirdpartyMchId(java.lang.String thirdpartyMchId) {
		set("thirdparty_mch_id", thirdpartyMchId);
	}
	
	public java.lang.String getThirdpartyMchId() {
		return getStr("thirdparty_mch_id");
	}

	public void setThirdpartyTradeType(java.lang.String thirdpartyTradeType) {
		set("thirdparty_trade_type", thirdpartyTradeType);
	}
	
	public java.lang.String getThirdpartyTradeType() {
		return getStr("thirdparty_trade_type");
	}

	public void setThirdpartyTransactionId(java.lang.String thirdpartyTransactionId) {
		set("thirdparty_transaction_id", thirdpartyTransactionId);
	}
	
	public java.lang.String getThirdpartyTransactionId() {
		return getStr("thirdparty_transaction_id");
	}

	public void setThirdpartyUserOpenid(java.lang.String thirdpartyUserOpenid) {
		set("thirdparty_user_openid", thirdpartyUserOpenid);
	}
	
	public java.lang.String getThirdpartyUserOpenid() {
		return getStr("thirdparty_user_openid");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public void setStatus(java.lang.String status) {
		set("status", status);
	}
	
	public java.lang.String getStatus() {
		return getStr("status");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}
	
	public java.util.Date getModified() {
		return get("modified");
	}

	public void setField1(java.lang.String field1) {
		set("field1", field1);
	}
	
	public java.lang.String getField1() {
		return getStr("field1");
	}

	public void setField2(java.lang.String field2) {
		set("field2", field2);
	}
	
	public java.lang.String getField2() {
		return getStr("field2");
	}

	public void setField3(java.lang.String field3) {
		set("field3", field3);
	}
	
	public java.lang.String getField3() {
		return getStr("field3");
	}

	public void setField4(java.lang.String field4) {
		set("field4", field4);
	}
	
	public java.lang.String getField4() {
		return getStr("field4");
	}

	public void setField5(java.lang.String field5) {
		set("field5", field5);
	}
	
	public java.lang.String getField5() {
		return getStr("field5");
	}

	public void setField6(java.lang.String field6) {
		set("field6", field6);
	}
	
	public java.lang.String getField6() {
		return getStr("field6");
	}

	public void setField7(java.lang.String field7) {
		set("field7", field7);
	}
	
	public java.lang.String getField7() {
		return getStr("field7");
	}

	public void setField8(java.lang.String field8) {
		set("field8", field8);
	}
	
	public java.lang.String getField8() {
		return getStr("field8");
	}

	public void setField9(java.lang.String field9) {
		set("field9", field9);
	}
	
	public java.lang.String getField9() {
		return getStr("field9");
	}

}
