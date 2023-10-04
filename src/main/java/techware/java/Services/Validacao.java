package techware.java.Services;

import techware.java.Domain.Impostos;

public class Validacao {

    public static void calcularImposto(int tipoDoImposto, int aliquotaDoImposto) {

         Impostos imposto = new Impostos();

        if  (tipoDoImposto == 1){
            imposto = totalDaCompra * aliquotaDoImposto;
        }
    }
}
