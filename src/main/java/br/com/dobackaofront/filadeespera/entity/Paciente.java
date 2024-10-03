package br.com.dobackaofront.filadeespera.entity;

public class Paciente {

    // Atributos principais
	private int id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;

    // Dados de saúde
    private boolean possuiAlergias; // Caixa de marcação (checkbox)
    private String tipoSanguineo;   // Caixa de seleção (radiobutton)
    private boolean possuiConvenio; // Caixa de marcação (checkbox)
    private String convenio;        // Se tiver convênio, exibe uma caixa de seleção para escolha

    // Informações pessoais
    private String sexo;            // Radiobutton (masculino, feminino, etc.)
    private String dataNascimento;

    // Construtor
    public Paciente(String nome, String email, String telefone, String endereco, boolean possuiAlergias, String tipoSanguineo,
                    boolean possuiConvenio, String convenio, String sexo, String dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.possuiAlergias = possuiAlergias;
        this.tipoSanguineo = tipoSanguineo;
        this.possuiConvenio = possuiConvenio;
        this.convenio = convenio;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }
    
    public Paciente() {
    	
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isPossuiAlergias() {
        return possuiAlergias;
    }

    public void setPossuiAlergias(boolean possuiAlergias) {
        this.possuiAlergias = possuiAlergias;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public boolean isPossuiConvenio() {
        return possuiConvenio;
    }

    public void setPossuiConvenio(boolean possuiConvenio) {
        this.possuiConvenio = possuiConvenio;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
    
}
