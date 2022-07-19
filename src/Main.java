import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição Curso JS");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devKarein = new Dev();
        devKarein.setNome("Karein");
        devKarein.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Karein:" + devKarein.getConteudosInscritos());
        devKarein.progredir();
        devKarein.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Karein:" + devKarein.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Karein:" + devKarein.getConteudosConcluidos());
        System.out.println("XP: " + devKarein.calcularTotalXP());

        System.out.println("-----------");

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Bruno:" + devBruno.getConteudosInscritos());
        devBruno.progredir();
        devBruno.progredir();
        devBruno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Bruno:" + devBruno.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Bruno:" + devBruno.getConteudosConcluidos());
        System.out.println("XP: " + devBruno.calcularTotalXP());


    }
}
