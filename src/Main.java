import br.com.dio.desafio.dominio.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Criando objetos conteúdos
        Conteudo curso1 = new Curso();
        Conteudo curso2 = new Curso();
        Conteudo mentoria = new Mentoria();

        //Setando seus valores
        curso1.setTitulo("Lógica de programação essencial");
        curso1.setDescricao("Neste curso você irá aprender a desenvolver sua lógica para iniciar a " +
                "programar em uma liguagem");

        curso2.setTitulo("Programação Orientada a Objetos - Java");
        curso2.setDescricao("Neste curso você irá aprender os conceitos da POO e como " +
                "aplicar estes conceitos no desenvolvimento em Java");

        mentoria.setTitulo("Como se dar bem no Bootcamp da DIO");
        mentoria.setDescricao("Serão faladas dicas e práticas de como " +
                "finalizar todas as etapas dos bootcamps da Digital Innovation One");

        //Criando objeto bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developers");
        bootcamp.setDescricao("Descrição: Bootcamp focado é introduzir e aperfeiçoar Dev's na linguagem Java");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //Criando devs
        Dev devEricklis = new Dev();
        Dev devNeto = new Dev();
        Dev devKelvem = new Dev();
        Dev devNatanael = new Dev();

        devEricklis.setNome("Ericklis");
        devKelvem.setNome("Kelvem");
        devNatanael.setNome("Natanael");
        devNeto.setNome("Neto");

        devEricklis.incresverBootcamp(bootcamp);
        devKelvem.incresverBootcamp(bootcamp);
        devNatanael.incresverBootcamp(bootcamp);
        devNeto.incresverBootcamp(bootcamp);

        //Vendo os conteúdos em que os devs estão inscritos e progredindo
        JOptionPane.showMessageDialog(null, "Conteúdos inscritos de " + devEricklis.getNome() +
                ": " + devEricklis.getConteudosInscritos());
        devEricklis.progredir();
        JOptionPane.showMessageDialog(null, "Conteúdos inscritos de " + devKelvem.getNome() +
                ": " + devKelvem.getConteudosInscritos());
        devKelvem.progredir();
        JOptionPane.showMessageDialog(null, "Conteúdos inscritos de " + devNatanael.getNome() +
                ": " + devNatanael.getConteudosInscritos());
        devNatanael.progredir();
        JOptionPane.showMessageDialog(null, "Conteúdos inscritos de " + devNeto.getNome() +
                ": " + devNeto.getConteudosInscritos());
        devNeto.progredir();

        //Mostrando os conteúdos concluídos
        JOptionPane.showMessageDialog(null, "Conteúdos concluídos de " + devEricklis.getNome() +
                ": " + devEricklis.getConteudosConcluidos());
        JOptionPane.showMessageDialog(null, "Conteúdos concluídos de " + devKelvem.getNome() +
                ": " + devKelvem.getConteudosConcluidos());
        JOptionPane.showMessageDialog(null, "Conteúdos concluídos de " + devNatanael.getNome() +
                ": " + devNatanael.getConteudosConcluidos());
        JOptionPane.showMessageDialog(null, "Conteúdos concluídos de " + devNeto.getNome() +
                ": " + devNeto.getConteudosConcluidos());

        //Calculando o XP total dos devs
        JOptionPane.showMessageDialog(null, "Calcular XP de " + devEricklis.getNome()
        + "...\n" + "XP = " + devEricklis.calcularTotalXp());
        JOptionPane.showMessageDialog(null, "Calcular XP de " + devKelvem.getNome()
                + "...\n" + "XP = " + devKelvem.calcularTotalXp());
        JOptionPane.showMessageDialog(null, "Calcular XP de " + devNatanael.getNome()
                + "...\n" + "XP = " + devNatanael.calcularTotalXp());
        JOptionPane.showMessageDialog(null, "Calcular XP de " + devNeto.getNome()
                + "...\n" + "XP = " + devNeto.calcularTotalXp());
    }
}
