package equipamentos.multifuncional;

import equipamentos.copiadoras.Copiadora;
import equipamentos.digitalizadoras.Digitalizadora;
import equipamentos.impressoras.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
    public void copiar() {
        System.out.println("MULTIFUNCIONAL: COPIANDO");
    }
    public void digitalizar() {
        System.out.println("MULTIFUNCIONAL: DIGITALIZANDO");
    }
    public void imprimir() {
        System.out.println("MULTIFUNCIONAL: IMPRIMINDO");
    }
}
