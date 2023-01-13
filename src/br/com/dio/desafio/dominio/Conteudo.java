//Trabalhando com herança

package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    //Constante, conteudo vai ser criado com o XP padrão
    protected static final double XP_PADRAO = 10d;

    //Modificadores de acessos Private, Protected ou Public
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
