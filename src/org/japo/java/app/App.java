package org.japo.java.app;

/*
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public final class App {

    //Constantes globales
    public final int NUM = 10;
    public final int MIN = 1;
    public final int MAX = 10;

    //Método principal
    public final void launchApp() {
        //Cabecera
        cabecera("ANÁLISIS DE RANGO");

        //Salidas
        // NUM
        System.out.printf("Número ......: %d%n",
                NUM);

        //  SEPARADOR
        System.out.println("---");

        //  MIN
        System.out.printf("Mínimo ......: %d%n",
                MIN);

        //  MAX
        System.out.printf("Máximo ......: %d%n",
                MAX);

        //  SEPARADOR
        System.out.println("---");

        //  ANALISIS
        System.out.printf("Análisis ....: %s%n",
                UtilesPrimitivos.ubicacion(UtilesPrimitivos.analizarRango(
                        NUM, MIN, MAX)));
    }

    //Método de la cabecera
    public final void cabecera(String msg) {
        //Variables
        int eq = msg.length();

        //Salida
        System.out.println(msg);
        //  Bucle para la cantidad de "iguales" ["="]
        for (int i = 0; i < eq; i++) {
            System.out.print("=");
        }
        //Salto de línea -- Retorno de carro
        System.out.printf("%n");
    }
}
