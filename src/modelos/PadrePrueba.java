package modelos;

public class PadrePrueba {
    protected int [][] datos;

    public int suma1(){
        int sumatoria=0;

        for(int i = 0; i<datos.length;i++){
            sumatoria += datos[i][0];
        }

        return sumatoria;
    }

    public int suma2(){
        int sumatoria=0;

        for(int i = 0; i<datos.length;i++){
            sumatoria += datos[i][1];
        }

        return sumatoria;
    }

    public int suma3(){
        int sumatoria=0;

        for(int i = 0; i<datos.length;i++){
            sumatoria += datos[i][2];
        }

        return sumatoria;
    }

    public int suma4(){
        int sumatoria=0;

        for(int i = 0; i<datos.length;i++){
            sumatoria += datos[i][3];
        }

        return sumatoria;
    }
    
}
