package br.com.dio.desafio.dominio;

import java.time.LocalDate;

//Classe mentoria extende(filha) da classe conteudo
public class Mentoria extends Conteudo {

    //Classe LocalDate para trabalhar com datas
    private LocalDate data;

    //Método calcular XP
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    //Para trabalhar com os atributos vamos iniciar os métodos Get e Set
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
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
