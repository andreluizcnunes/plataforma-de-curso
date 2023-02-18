import br.com.plataformacurso.dominio.Curso;
import br.com.plataformacurso.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição do curso");
        curso.setCargaHoraria(80);

        System.out.println(curso);
        System.out.println();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

    }
}