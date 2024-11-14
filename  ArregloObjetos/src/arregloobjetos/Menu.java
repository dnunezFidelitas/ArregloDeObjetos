package arregloobjetos;
import javax.swing.JOptionPane;
public class Menu {
   private byte opc;
   
   public void mostrarMenu(){
      Rutina r=new Rutina();
      while(opc!=4){ 
         opc=Byte.parseByte(JOptionPane.showInputDialog(null,
                 "***MENÚ PRINCIPAL***\n\n"
                         + "1.Agregar producto\n"
                         + "2.Completar inventario\n"
                         + "3.Mostrar productos\n"
                         + "4.Salir\n\n"
                         + "Digite su opción:"));
         switch(opc){
             case 1:{
                r.agregar();
                break;
             } 
             case 2:{
                r.completar();
                break;
             }
             case 3:{
                r.mostrar();
                break;
             }
             case 4:{
                System.exit(0);
                break;
             }
             default:{
                JOptionPane.showMessageDialog(null,"¡Opción incorrecta!");
             }
         }
      }
   }
}
