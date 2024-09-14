/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import filters.Filter;
import filters.EvenFilter;
import filters.MultiplyByTwoFilter;
import filters.AddTenFilter;

import java.util.List;

public class PipeAndFilterExample {
    public static void main(String[] args) {
        // Crear la secuencia de filtros
        List<Filter> filters = List.of(
            new EvenFilter(),
            new MultiplyByTwoFilter(),
            new AddTenFilter()
        );  

        // Datos de entrada
        List<Integer> inputData = List.of(1, 2, 3, 4, 5, 6);

        // Procesar los datos a través de la tubería de filtros
        List<Integer> outputData = inputData;
        for (Filter filter : filters) {
            outputData = filter.process(outputData);
        }

        // Mostrar el resultado final
        System.out.println(outputData); // Debería mostrar: [14, 22, 30]
    }
}