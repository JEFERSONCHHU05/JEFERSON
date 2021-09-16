package tarea.actividad01;
//fecha: 16 de setiembre del 2021
//curso: lenguaje de programacion orientada a objetos
//alumno: Chacon Huaman Jeferson Marco
//grupo: 3A
public class TareaActividad01 {
    
    final static byte [] n = {4,2,5,1,6,0,6,9,5,4,5,0};
    static int resultado = 0;

    public static void main(String[] args) {
        
        resultado = (n.length)*8;
        resultado += 3;
        System.out.println("El resultado es: "+resultado);
    
    }
    
}
