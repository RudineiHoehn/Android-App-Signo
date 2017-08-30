package br.com.teste.rudineihoehn.signos;

import java.util.ArrayList;

/**
 * Created by RudineiH on 23/08/2017.
 */

public class InterpretadorSigno {
    private ArrayList<Signo> signos;
    //private ArrayList<Signo> signos = new ArrayList<Signo>() {{
    //    add(new Signo(20, 1, 18, 2, "Aquário", "@drawable/aquario"));
    //    add(new Signo(19, 2, 20, 3, "Peixes", "@drawable/peixes"));
    //    add(new Signo(21, 3, 19, 4, "Aries", "@drawable/aries"));
    //    add(new Signo(20, 4, 20, 5, "Touro", "@drawable/touro"));
    //    add(new Signo(21, 5, 20, 6, "Gêmeos", "@drawable/gemeos"));
    //    add(new Signo(21, 6, 22, 7, "Câncer", "@drawable/cancer"));
    //    add(new Signo(23, 7, 22, 8, "Leão", "@drawable/leao"));
    //    add(new Signo(23, 8, 22, 9, "Virgem", "@drawable/virgem"));
    //    add(new Signo(23, 9, 22, 10, "Libra", "@drawable/libra"));
    //    add(new Signo(23, 10, 21, 11, "Escorpião", "@drawable/escorpiao"));
    //    add(new Signo(22, 11, 21, 12, "Sargitário", "@drawable/sargitario"));
    //    add(new Signo(22, 12, 19, 1, "Capricórnio", "@drawable/capricornio"));
    //}};

    public Signo interpretar(int dia, int mes) {
        Signo signo = null;
        signos = new ArrayList<Signo>();

        signos.add(new Signo(20, 1, 18, 2, "Aquário", "@drawable/aquario"));
        signos.add(new Signo(19, 2, 20, 3, "Peixes", "@drawable/peixes"));
        signos.add(new Signo(21, 3, 19, 4, "Aries", "@drawable/aries"));
        signos.add(new Signo(20, 4, 20, 5, "Touro", "@drawable/touro"));
        signos.add(new Signo(21, 5, 20, 6, "Gêmeos", "@drawable/gemeos"));
        signos.add(new Signo(21, 6, 22, 7, "Câncer", "@drawable/cancer"));
        signos.add(new Signo(23, 7, 22, 8, "Leão", "@drawable/leao"));
        signos.add(new Signo(23, 8, 22, 9, "Virgem", "@drawable/virgem"));
        signos.add(new Signo(23, 9, 22, 10, "Libra", "@drawable/libra"));
        signos.add(new Signo(23, 10, 21, 11, "Escorpião", "@drawable/escorpiao"));
        signos.add(new Signo(22, 11, 21, 12, "Sargitário", "@drawable/sargitario"));
        signos.add(new Signo(22, 12, 19, 1, "Capricórnio", "@drawable/capricornio"));

        for (Signo s : signos) {
            if (s.getMesInicio() == mes && dia >= s.getDiaInicio()) {
                signo = s;
                break;
            } else if (s.getMesFim() == mes && dia <= s.getDiaFim()) {
                signo = s;
                break;
            }
        }

        return signo;
    }
}
