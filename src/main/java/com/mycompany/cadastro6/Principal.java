package com.mycompany.cadastro6;

import com.mycompany.cadastro6.entidades.Aluno;

public class Principal {

    public static void main(String[] args) {

        //Criar 5 alunos
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Lucas");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("joão");
        Aluno aluno3 = new Aluno();
        aluno3.setNome("pedro");
        Aluno aluno4 = new Aluno();
        aluno4.setNome("Verice");
        Aluno aluno5 = new Aluno();
        aluno5.setNome("Wallison");
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());
        System.out.println(aluno4.toString());
        System.out.println(aluno5.toString());

    }
}
