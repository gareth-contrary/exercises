package longFormQuestions;
public class XpayToPayDAdapter implements PayD {
	
	private XPay xPay = null;
	
	public XpayToPayDAdapter() {
		xPay = new XPayImpl();
	}

	@Override
	public String getCustCardNo() {
		String cardNo = xPay.getCreditCardNo();
		return cardNo;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		xPay.setCreditCardNo(custCardNo);
	}

	@Override
	public String getCardOwnerName() {
		String cardOwnerName = xPay.getCustomerName();
		return cardOwnerName;
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		xPay.setCustomerName(cardOwnerName);
	}

	@Override
	public String getCardExpMonthDate() {
		String expMonth = xPay.getCardExpMonth();
		return expMonth;
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		xPay.setCardExpMonth(cardExpMonthDate);
	}

	@Override
	public Integer getCVVNo() {
		Short s = xPay.getCardCVVNo();
		Integer cVVNo = new Integer(s);
		return cVVNo;
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		Short s = cVVNo.shortValue();
		xPay.setCardCVVNo(s);
	}

	@Override
	public Double getTotalAmount() {
		Double amount = xPay.getAmount();
		return amount;
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		xPay.setAmount(totalAmount);
	}

}
