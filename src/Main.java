import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Instanciar objeto é a partir da palavra "new"
        Curso curso1 = new Curso();
        //Atribuir valores através do método Set
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso banco de dados");
        curso2.setDescricao("descrição curso bd");
        curso2.setCargaHoraria(6);

        //Polimorfismo, instanciar o objeto diversas formas
        //Instanciando classe Curso através da classe conteúdo
        //Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição da mentoria de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descriçao Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFulano = new Dev();
        devFulano.setNome("Fulado");
        devFulano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fulano: " + devFulano.getConteudosInscritos());
        devFulano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Fulano: " + devFulano.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Fulano: " + devFulano.getConteudosConcluidos());

        System.out.println("----------------------------");

        Dev devFerreira = new Dev();
        devFerreira.setNome("Ferreira");
        devFerreira.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ferreira: " + devFerreira.getConteudosInscritos());
        devFerreira.progredir();
        devFerreira.progredir();
        devFerreira.progredir();
        devFerreira.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ferreira: " + devFerreira.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ferreira: " + devFerreira.getConteudosConcluidos());



    }
}