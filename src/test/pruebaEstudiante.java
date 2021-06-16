package test;

import Dominio.Estudiante;
import java.util.Scanner;


public class pruebaEstudiante {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int estudiantes, genero, hombres, mujeres;
        double porcentaje_hombres, porcentaje_mujeres;
        String tecla_repetir;
        estudiantes = 0;
        hombres = 0;
        mujeres = 0;
        porcentaje_hombres = 0;
        porcentaje_mujeres = 0;
        do {
            System.out.println("Selecciona el valor de genero.");
            System.out.println("\t1.- Mujer");
            System.out.println("\t2.- Hombre");
            System.out.print("\t: ");
            do {
                genero = in.nextInt();
                in.nextLine();
                if (genero<1||genero>2)
                    System.out.print("Valor incorrecto. Ingr\n ingresa nuevamente.: ");
            } while (genero<1||genero>2);
            if(genero==1)
                mujeres=mujeres+1;
            else
                hombres=hombres+1;
            System.out.println();
            do {
                System.out.print("\n Deseas repetir el proceso? (S/N): ");
                tecla_repetir = in.nextLine();
            } while (!tecla_repetir.equalsIgnoreCase("s") && !tecla_repetir.equalsIgnoreCase("n"));
        } while (tecla_repetir.equalsIgnoreCase("s"));
        estudiantes=hombres+mujeres;
        if (estudiantes == 0) {
            porcentaje_hombres = 0;
        } else {
            porcentaje_hombres=100.0*hombres/estudiantes;
        }
        if (estudiantes == 0) {
            porcentaje_mujeres = 0;
        } else {
            porcentaje_mujeres=100.0*mujeres/estudiantes;
        }
        System.out.println("Valor de estudiantes: " + estudiantes);
        System.out.println("Valor de hombres: " + hombres);
        System.out.println("Valor de mujeres: " + mujeres);
        System.out.println("Valor de porcentaje hombres: " + porcentaje_hombres);
        System.out.println("Valor de porcentaje mujeres: " + porcentaje_mujeres);
    }
    
    }

    
    

