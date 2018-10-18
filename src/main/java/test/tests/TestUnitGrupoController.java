package test.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.resources.TestResourceGrupoController;

public class TestUnitGrupoController extends TestResourceGrupoController {

    private final Integer EXPECTED_NUMERO_DE_IMAGENS = 6;
    private final Integer EXPECTED_NUMERO_DE_IMAGENS_DISTINTAS = 6;
    private final Integer EXPECTED_NUMERO_DE_GRUPOS = 2;

    @Before
    public void Before() {
        this.inicializarGrupos();
        this.sortearGrupo();
        this.sortearImagens();
    }

    @Test
    public void testNumeroDeGrupos() {
        Assert.assertEquals( EXPECTED_NUMERO_DE_GRUPOS, this.getNumeroDeGrupos());
    }

    @Test
    public void testNumeroDeImagens() {
        Assert.assertEquals( EXPECTED_NUMERO_DE_IMAGENS, this.getNumeroImagensSorteadas());
    }

    @Test
    public void testNumeroImagensDistintas() {
        Assert.assertEquals( EXPECTED_NUMERO_DE_IMAGENS_DISTINTAS, this.isTodasImagensDiferentes());
    }
}
