/**
 * 
 */
package com.anupam.json.object;

/**
 * @author Anupam Sharma
 *
 */
public class PaymentInfo {

	private String payment_method;
	private String credit_card_number;
	private String credit_card_type;
	private String expiration_date;
	private String amount;
	private String payment_date;
	private String payment_due_date;
	private String statement_generation_date;

	public PaymentInfo() {
		super();
	}

	public PaymentInfo(String payment_method, String credit_card_number, String credit_card_type,
			String expiration_date, String amount, String payment_date, String payment_due_date,
			String statement_generation_date) {
		super();
		this.payment_method = payment_method;
		this.credit_card_number = credit_card_number;
		this.credit_card_type = credit_card_type;
		this.expiration_date = expiration_date;
		this.amount = amount;
		this.payment_date = payment_date;
		this.payment_due_date = payment_due_date;
		this.statement_generation_date = statement_generation_date;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public String getCredit_card_number() {
		return credit_card_number;
	}

	public void setCredit_card_number(String credit_card_number) {
		this.credit_card_number = credit_card_number;
	}

	public String getCredit_card_type() {
		return credit_card_type;
	}

	public void setCredit_card_type(String credit_card_type) {
		this.credit_card_type = credit_card_type;
	}

	public String getExpiration_date() {
		return expiration_date;
	}

	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}

	public String getPayment_due_date() {
		return payment_due_date;
	}

	public void setPayment_due_date(String payment_due_date) {
		this.payment_due_date = payment_due_date;
	}

	public String getStatement_generation_date() {
		return statement_generation_date;
	}

	public void setStatement_generation_date(String statement_generation_date) {
		this.statement_generation_date = statement_generation_date;
	}

	@Override
	public String toString() {
		return "PaymentInfo [payment_method=" + payment_method + ", credit_card_number=" + credit_card_number
				+ ", credit_card_type=" + credit_card_type + ", expiration_date=" + expiration_date + ", amount="
				+ amount + ", payment_date=" + payment_date + ", payment_due_date=" + payment_due_date
				+ ", statement_generation_date=" + statement_generation_date + "]";
	}

}
