package estabelecimento;

import equipamentos.copiadoras.Copiadora;
import equipamentos.digitalizadoras.Digitalizadora;
import equipamentos.impressoras.Deskjet;
import equipamentos.impressoras.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressoraDeskjet = new Deskjet();
        impressoraDeskjet.imprimir();

        Impressora impressoraMulti = new EquipamentoMultifuncional();
        impressoraMulti.imprimir();

        //EquipamentoMultifuncional implementa as interfaces Impressora, Digitalizadora e Copiadora
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

        //Deskjet implementa Impressora, porém não implementa as demais interfaces
        Deskjet deskjet = new Deskjet();
        Impressora impressoraDeskjet2 = deskjet;
        impressoraDeskjet2.imprimir();
        //Objetos abaixo geram erro, pois Deskjet não implementa interfaces Digitalizadora e Copiadora
        //Digitalizadora digitalizadoraDeskjet2 = deskjet;
        //Copiadora copiadoraDeskjet2 = deskjet;
    }
}
