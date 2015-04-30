package scrapping.model;

public class Imovel {

	/*
	 * Name	Datatype	Comment
codigo	int(11)	
endereco_maps	varchar(200)	
quartos	int(11)	
metragem	double	
preco	double	
garagens	int(11)	
estado	varchar(2)	
cidade	varchar(90)	

	 */
	
	private Long codigo;
	
	private String enderecoMaps;
	
	private Integer quartos;
	
	private Double metragem;
	
	private Double preco;
	
	private Integer garagens;
	
	private String estado;
	
	private String cidade;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getEnderecoMaps() {
		return enderecoMaps;
	}

	public void setEnderecoMaps(String enderecoMaps) {
		this.enderecoMaps = enderecoMaps;
	}

	public Integer getQuartos() {
		return quartos;
	}

	public void setQuartos(Integer quartos) {
		this.quartos = quartos;
	}

	public Double getMetragem() {
		return metragem;
	}

	public void setMetragem(Double metragem) {
		this.metragem = metragem;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getGaragens() {
		return garagens;
	}

	public void setGaragens(Integer garagens) {
		this.garagens = garagens;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
	
}
