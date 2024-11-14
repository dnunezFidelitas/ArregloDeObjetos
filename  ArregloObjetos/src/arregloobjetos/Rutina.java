package arregloobjetos;
import javax.swing.JOptionPane;
public class Rutina {
   private Producto inventario[]=new Producto[6]; 
   
   public void informacion(){
       Producto p=new Producto("Dato1",0,0);
       inventario[0]=p;
       inventario[1]=new Producto("Dato2",1,1); 
       inventario[2]=new Producto("Dato3",3,3); 
      
   }
   
   
   public void agregar(){
      int x;
      for(x=0;x<3;x++){
          Producto p=new Producto();
          p.setDescripcion(JOptionPane.showInputDialog(null,"Digite la descripción del producto:"));
          p.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la cantidad existente:")));
          p.setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el precio del producto:")));
          inventario[x]=p;
      }
   }
   public void completar(){
      inventario[4]=new Producto("Refrescos",(float)20.00,1200.00);
      inventario[5]=new Producto("Snacks",(float)18.00,2600.00);
   }
   public void mostrar(){
      int x;
      String s="";
      for(x=0;x<inventario.length;x++){
          s=s+inventario[x].getDescripcion()+" "+inventario[x].getCantidad()+
                  " "+inventario[x].getPrecio()+"\n\n";
      }
      JOptionPane.showMessageDialog(null,"El arreglo contiene:\n"+s);
   }
}
