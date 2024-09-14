/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filters;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
public class EvenFilter implements Filter {
    @Override
    public List<Integer> process(List<Integer> input) {
        if (input == null) {
            throw new IllegalArgumentException("Input list cannot be null");
        }
        List<Integer> output = new ArrayList<>();
        for (Integer number : input) {
            if (number % 2 == 0) {
                output.add(number);
            }
        }
        return output;
    }
}