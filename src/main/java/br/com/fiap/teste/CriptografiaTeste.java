
package br.com.fiap.teste;

import br.com.fiap.util.CriptografiaUtils;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CriptografiaTeste {

    @Test
    public void testCriptografar() {
        try {
            String senha = "123456";
            String criptografada = "e10adc3949ba59abbe56e057f20f883e";
            assertNotNull("A senha criptografada não deve ser nula", criptografada);
            assertEquals("A criptografia deve ser consistente", criptografada, CriptografiaUtils.criptografar(senha));
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
}
