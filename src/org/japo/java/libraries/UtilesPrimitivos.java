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
package org.japo.java.libraries;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class UtilesPrimitivos {

    //Constantes globales
    public static final int RANGE_IN = 0; // Dentro de Rango
    public static final int RANGE_BELOW = 1; // Debajo de Rango
    public static final int RANGE_ABOVE = 2; // Encima de Rango

    public static final int analizarRango(double num, double min, double max) {
        //Variables
        int rango;

        //Condicional
        if (num > max) {
            rango = RANGE_ABOVE;
        } else if (num < min) {
            rango = RANGE_BELOW;
        } else {
            rango = RANGE_IN;
        }

        //Return
        return rango;
    }

    public static final String ubicacion(int n) {
        //Variables
        String posicion;

        //Condicional
        switch (n) {
            case RANGE_IN:
                posicion = "DENTRO";
                break;
            case RANGE_BELOW:
                posicion = "FUERA ( Abajo )";
                break;
//            case RANGE_ABOVE:
//            ( puede sustituirse por default, hacerlo evita que la(s)
//            variable(s) deba(n) de ser inicializada(s) con anterioridad )
            default:
                posicion = "FUERA ( Arriba )";
                break;
        }

        //Return
        return posicion;
    }
}
