package tarea.actividad04;
//fecha: 16 de setiembre del 2021
//curso: lenguaje de programacion orientada a objetos
//alumno: Chacon Huaman Jeferson Marco
//grupo: 3A
public class TareaActividad04 {
    //
    final static byte [] n={4,2,5,1,6,0,6,9,5,4,5,0};
    static int numero_a_buscar = 1, i=0;
    static boolean encontrado=false;
    
    public static void main(String[] args) {
        while(encontrado==false){
            
            if(n[i]==numero_a_buscar){
                   System.out.println("El número coincide en la posicion "+i+",");
                   encontrado = true;
            }
            i++;
        }
    }
    
}
