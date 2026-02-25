package edu.dosw.parcial;

import java.util.ArrayList;
import java.util.List;

public class HumanResources {

    private static final List<String> PROFESSORS = List.of(
            "208386344,Laura Herrera,laura.herrera@escuelaing.edu.co",
            "208386346,Mariana Gomez,mariana.gomez@escuelaing.edu.co",
            "208386347,Pablo Rodriguez,pablo.rodriguez@escuelaing.edu.co",
            "208386348,Ana Ramírez,ana.ramirez@escuelaing.edu.co",
            "208386349,Eduardo Hernández,eduardo.hernandez@escuelaing.edu.co",
            "208386350,Carlos Correa,carlos.correa@escuelaing.edu.co",
            "208386351,Laura Prieto,laura.prieto@escuelaing.edu.co",
            "208386352,Jorge Nieto,jorge.nieto@escuelaing.edu.co",
            "208386353,Juana Lopez,juana.lopez@escuelaing.edu.co",
            "208386354,Camilo Garcia,camilo.garcia@escuelaing.edu.co"
    );

    public ArrayList<String> getProfessors() {
        return new ArrayList<>(PROFESSORS);
    }
}