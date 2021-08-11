package modelos;

public class Prueba  extends PadrePrueba{
    

    public void llenarMatriz(String datos,int n){
        this.datos = new int[n][4];
        String [] datosDivididos1 = datos.split("\n");

        for(int i=0;i<n;i++){
            String [] datosDivididos2 = datosDivididos1[i].split(" ");

            for(int j=0;j<datosDivididos2.length;j++){
                this.datos[i][j]= Integer.parseInt(datosDivididos2[j]);
            }
        }
    }

    
 
}
