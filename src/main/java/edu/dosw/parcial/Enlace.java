package edu.dosw.parcial;

import java.util.ArrayList;
import java.util.List;

public class Enlace {

    private static final List<String> ASSIGNATURES = List.of(
            "1_DOSW_Desarrollo y Operaciones Software",
            "2_MYSD_Modelos y Servicios de Datos",
            "3_FUPR_Fundamentos de Proyectos",
            "4_DDYA_Diseño de Datos y Algoritmos",
            "5_ARSW_Arquitectura de Software",
            "6_DOPO_Desarrollo Orientado por Objetos",
            "7_MPIN_Matemáticas para Informática",
            "8_AYSR_Arquitectura y Servicios de Red",
            "9_FDSI_Fundamentos de la Seguridad de la Información",
            "10_ODSC_Organización de los Sistemas de Cómputo"
    );

    private static final List<String> STUDENTS = List.of(
            "20838634_Juan Perez_juan.perez@mail.escuelaing.edu.co_DOSW",
            "20838635_Maria Gomez_maria.gomez@mail.escuelaing.edu.co_MYSD",
            "20838636_Pedro Rodriguez_pedro.rodriguez@mail.escuelaing.edu.co_NA",
            "20838637_Ana Martinez_ana.martinez@mail.escuelaing.edu.co_NA",
            "20838638_Luis Garcia_luis.garcia@mail.escuelaing.edu.co_ARSW",
            "20838639_Carlos Hernandez_carlos.hernandez@mail.escuelaing.edu.co_DOPO",
            "20838640_Laura Torres_laura.torres@mail.escuelaing.edu.co_MPIN",
            "20838641_Jorge Lopez_jorge.lopez@mail.escuelaing.edu.co_AYSR",
            "20838642_Ana Lopez_ana.lopez@mail.escuelaing.edu.co_NA",
            "20838643_Luis Garcia_luis.garcia@mail.escuelaing.edu.co_ODSC"
    );

    public ArrayList<String> getAssignatures() {
        return new ArrayList<>(ASSIGNATURES);
    }

    public ArrayList<String> getStudents() {
        return new ArrayList<>(STUDENTS);
    }
}
