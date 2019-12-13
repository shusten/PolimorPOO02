public class Cachorro extends Lobo{

    @Override
    public String emitirSom() {
        String som = "Au au au";
        return som;
    }

    public void reagir(String frase) {
        if( (frase.equals("Toma Comida")) || frase.equals("Olá") ) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar ");
        }
    }
    public void reagir(int hora, int min) {
        if ( hora < 12 ) {
            System.out.println("Abanar");
    } else if ( hora >= 18 ) {
            System.out.println("Ignrar");
        }  else {
            System.out.println("Abanar e Latir");
        }
    }
    public void reagir(boolean dono) {
        if ( dono ) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir ");
        }

    }
    public void reagir(int idade, float peso) {
        if ( idade< 5 ) {
            if ( peso< 10 ) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
            if ( peso < 10 ) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }

}
