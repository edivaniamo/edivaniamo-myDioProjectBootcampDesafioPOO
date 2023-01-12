package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

    //Modificadores de acessos Private, Protected ou Public
    private String titulo;
    private String descricao;

    //Classe LocalDate para trabalhar com datas
    private LocalDate data;

    //Para trabalhar com os atributos vamos iniciar os métodos Get e Set

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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //Para imprimir será criado toString


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
