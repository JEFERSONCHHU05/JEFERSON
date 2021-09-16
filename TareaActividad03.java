package tarea.actividad03;
//fecha: 16 de setiembre del 2021
//curso: lenguaje de programacion orientada a objetos
//alumno: Chacon Huaman Jeferson Marco
//grupo: 3A
public class TareaActividad03 {

    final static byte[] n={4,2,5,1,6,0,6,9,5,4,5,0};
    static int resultado=0;
    
    public static void main(String[] args) {
        
        for(int i=1; i<=n.length; i++){
            
            for(int j=n.length;j>=i; j--){
            resultado = i*7;
            resultado /=2;
            }
            
        }
        System.err.println("El resultado es: "+resultado);
    }
    
}
