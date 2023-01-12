import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        //Instanciar objeto é a partir da palavra "new"
        Curso curso1 = new Curso();

        //Atribuir valores através do método Set
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso banco de dados");
        curso1.setDescricao("descrição curso bd");
        curso1.setCargaHoraria(6);

        System.out.println(curso1);
        System.out.println(curso2);


    }
}