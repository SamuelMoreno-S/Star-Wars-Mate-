package programa;

import java.util.Scanner;
//Samuel Moreno Segovia 1DAM
public class Programacion {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int S1 = 0, S2 = 0, Sumatorio = 0, respuesta, P1 = 0, P2 = 0, Productorio = 0, NFactorial, ContF = 1, Factorial = 1, P, contP = 2,
                M, S, ContS = 1, FactorialS = 1, ContM = 1, FactorialM = 1, SumaFactoriales;
        boolean primo = true, error = false;
        double raiz;
        
        System.out.println("""
                         === STAR WARS C\u00d3DIGOS SECRETOS ===
                         Hace mucho tiempo, en una galaxia muy, muy lejana\u2026 La Princesa Leia, Luke
                         Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada
                         en una misi\u00f3n secreta para infiltrarse en otra estrella de la muerte que el imperio
                         est\u00e1 construyendo para destruirla. (Presiona Intro para continuar)""");
        entrada.nextLine();
        S1 = (int) (1 + Math.random() * (10 - 1 + 1));
        S2 = (int) (20 + Math.random() * (30 - 20 + 1));
        //Nivel 1
        System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n"
                + "sistema " + S1 + " en el sector " + S2 + ", pero el sistema de navegación está estropeado y el\n"
                + "computador tiene problemas para calcular parte de las coordenadas de salto.\n"
                + "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n"
                + "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n"
                + "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n"
                + "¿Qué debe introducir?");
        for (S1 = S1; S1 <= S2; S1++) {

            Sumatorio = Sumatorio + S1;

        }
        System.out.println(Sumatorio);
        respuesta = entrada.nextInt();

        if (respuesta == Sumatorio) {
            //Nivel 2
            P1 = (int) (1 + Math.random() * (7 - 1 + 1));
            P2 = (int) (8 + Math.random() * (12 - 8 + 1));
            System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n"
                    + "de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n"
                    + "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí\n"
                    + "agente de espaciopuerto " + P1 + " contactando con nave imperial " + P2 + " . No están destinados\n"
                    + "en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa.\n"
                    + "“Eh… tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso\n"
                    + "para atracar y reparar la nave”. El agente, que no se anda con tonterías, responde\n"
                    + "“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el\n"
                    + "manual del piloto que estaba en la guantera y da con la página correcta. El código\n"
                    + "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n"
                    + "¿Cuál es el código?");
            for (P1 = P1; P1 <= P2; P1++) {

                Productorio = Productorio + P1;

            }
            System.out.println(Productorio);
            respuesta = entrada.nextInt();

            if (respuesta == Productorio) {
                //Nivel 3
                NFactorial = (int) (50 + Math.random() * (100 - 50 + 1));
                System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se\n"
                        + "equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n"
                        + "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los " + NFactorial + " existentes se\n"
                        + "encuentra el reactor principal. Se dirigen al primer panel computerizado que\n"
                        + "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n"
                        + "introducir una clave de acceso. Entonces recuerda la información que le proporcionó\n"
                        + "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10\n"
                        + "(redondeando " + NFactorial + " hacia abajo), donde " + NFactorial + " es el nº de niveles”.\n"
                        + "¿Cual es el nivel correcto?");
                NFactorial = NFactorial / 10;

                while (ContF <= NFactorial) {
                    Factorial = Factorial * ContF;
                    ContF++;
                }
                System.out.println(Factorial);
                respuesta = entrada.nextInt();

                if (respuesta == Factorial) {
                    //Nivel 4
                    P = (int) (10 + Math.random() * (100 - 10 + 1));
                    System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n"
                            + "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n"
                            + "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n"
                            + "verificar si el número " + P + " es primo o no. Si es primo introduce un 1, si no lo es\n"
                            + "introduce un 0.");

                    raiz = Math.sqrt(P);

                    for (contP = 2; contP <= raiz; contP++) {
                        if (P % contP == 0) {
                            primo = false;
                        }
                    }
                    System.out.println(primo);
                    respuesta = entrada.nextInt();

                    if (respuesta == 1 && primo == true || respuesta == 0 && primo == false) {
                        //Nivel 5
                        S = (int) (5 + Math.random() * (10 - 5 + 1));
                        M = (int) (5 + Math.random() * (10 - 5 + 1));
                        System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n"
                                + "programe el temporizador y salir de allí corriendo. Necesita programarlo para que\n"
                                + "explote en exactamente " + M + " minutos y " + S + " segundos, el tiempo suficiente para escapar\n"
                                + "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n"
                                + "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n"
                                + "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar\n"
                                + "el factorial de " + M + " y el factorial de " + S + ". ¿Qué valor debe introducir?");

                        while (ContS <= S) {
                            FactorialS = FactorialS * ContS;
                            ContS++;
                        }

                        while (ContM <= M) {
                            FactorialM = FactorialM * ContM;
                            ContM++;
                        }

                        SumaFactoriales = FactorialS + FactorialM;
                        System.out.println(SumaFactoriales);
                        respuesta = entrada.nextInt();

                        if (respuesta == SumaFactoriales) {
                            //Nivel de victoria
                            System.out.println("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a\n"
                                    + "sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se\n"
                                    + "convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea\n"
                                    + "consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan\n"
                                    + "observan por la ventana la imagen de la colosal estrella de la muerte explotando en\n"
                                    + "el silencio del espacio, desapareciendo para siempre junto a los restos del malvado\n"
                                    + "imperio.\n"
                                    + "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
                      //Todo los nivel error
                        } else {
                            error = true;
                        }

                    } else {
                        error = true;
                    }
                } else {
                    error = true;
                }

            } else {
                error = true;
            }

        } else {
            error = true;
        }
        if (error == true) {
            System.out.println("""
                               Ese no era el c\u00f3digo correcto\u2026 La misi\u00f3n ha sido un fracaso\u2026 :( :( :(
                               Todav\u00eda no eres un Maestro Jedi de las Matem\u00e1ticas. \u00a1Vuelve a intentarlo!""");
        }
        //The end
        System.out.println("Gracias por jugar :D");
    }

}
