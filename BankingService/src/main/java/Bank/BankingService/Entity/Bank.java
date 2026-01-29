package Bank.BankingService.Entity;

public class Bank {

    String bankName;
    String ifsc;

    public Bank(String bankName, String ifsc) {
    	
        this.bankName = bankName;
        this.ifsc = ifsc;
    }

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

    
}
