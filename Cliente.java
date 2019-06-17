package locadoradeautomoveis;

public class Cliente {
	
	private double renda;
	private String nome;
	private String cpf;
	private String rg;
	private String numeroCNH;
	private String anoNascimento;
	private int codigoCliente;
	private String dataEmissaoCNH;
	
	
	
	
	public Cliente() {
		
	}

	public Cliente(double renda, String nome, String cpf, String rg, String numeroCNH, String anoNascimento,
			int codigoCliente, String dataEmissaoCNH) {
	
		this.setRenda (renda);
		this.setNome (nome);
		this.setCpf (cpf);
		this.setRg (rg);
		this.setNumeroCNH (numeroCNH);
		this.setAnoNascimento (anoNascimento);
		this.setCodigoCliente (codigoCliente);
		this.setDataEmissaoCNH (dataEmissaoCNH);
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNumeroCNH() {
		return numeroCNH;
	}

	public void setNumeroCNH(String numeroCNH) {
		this.numeroCNH = numeroCNH;
	}

	public String getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(String anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getDataEmissaoCNH() {
		return dataEmissaoCNH;
	}

	public void setDataEmissaoCNH(String dataEmissaoCNH) {
		this.dataEmissaoCNH = dataEmissaoCNH;
	}

}
