/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
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
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //Constantes
        char CAR_MIN = 'A';
        char CAR_MAX = 'Z';
        int INICIO_CUENTA = 0;
        int FINAL_CUENTA = 6;

        //variable
        int pass = INICIO_CUENTA;
        char caracterRND;

        //RND
        caracterRND = (char) (RND.nextInt(CAR_MAX - CAR_MIN + 1) + CAR_MIN);
        
        //Mensaje
        System.out.print("Password ...: ");

        //Bucle
        do {System.out.print(caracterRND);
        
       
        caracterRND = (char) (RND.nextInt(CAR_MAX - CAR_MIN + 1) + CAR_MIN);
                  
        //Actualización
        pass++;  
        
    } while (pass < FINAL_CUENTA);
        
        //Salto
        System.out.println("");
        
    }
}
