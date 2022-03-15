package sig;

import administrativo.AdministrativoFachada;
import financeiro.FinanceiroFachada;
import controleAcademico.ControleAcademicoFachada;
import almoxarifado.AlmoxarifadoFachada;
import infraEstrutura.InfraEstruturaFachada;


public class SIG {
    final private FinanceiroFachada financeiro;
    final private AdministrativoFachada administrativo;
    final private ControleAcademicoFachada controleAcademico;
    final private AlmoxarifadoFachada almoxarifado;
    final private InfraEstruturaFachada infraEstrutura;

    public SIG() {
        this.financeiro = new FinanceiroFachada();
        this.administrativo = new AdministrativoFachada();
        this.controleAcademico = new ControleAcademicoFachada();
        this.almoxarifado = new AlmoxarifadoFachada();
        this.infraEstrutura = new InfraEstruturaFachada();
    }

    public FinanceiroFachada getFinanceiro() {

        return this.financeiro;
    }

    public AdministrativoFachada getAdministrativo() {
        return this.administrativo;
    }

    public ControleAcademicoFachada getControleAcademico() {

        return this.controleAcademico;
    }

    public AlmoxarifadoFachada getAlmoxarifado() {

        return this.almoxarifado;
    }

    public InfraEstruturaFachada getInfraEstrutura() {

        return this.infraEstrutura;
    }
}
