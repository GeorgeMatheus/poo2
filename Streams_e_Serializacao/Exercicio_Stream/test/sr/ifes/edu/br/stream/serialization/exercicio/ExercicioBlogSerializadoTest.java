
package sr.ifes.edu.br.stream.serialization.exercicio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ExercicioBlogSerializadoTest {
    
    public ExercicioBlogSerializadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMain() throws Exception {
                
        Usuario user = new Usuario();
        user.setEmail("teste@teste.com");
        user.setNome("joao");
        user.setSenha("123456");
        
        Post post = new Post();
        post.setKeyWords("android,mobile");
        
        Blog blog = new Blog();
        blog.setCategoria("informatica");
        blog.setDescricao("Tudo sobre informatica");        
        blog.setPertence(user);        
        blog.addPost(post);
         
        System.out.println(blog.hashCode());
        SaveExercicioSerializado save = new SaveExercicioSerializado();
        save.save(blog);
        
        RecuperarExercicioSerializado rec = new RecuperarExercicioSerializado();
        Blog blogRecuperado = rec.recupera();
        
        System.out.println(blogRecuperado.hashCode());
        assertEquals( blogRecuperado , blog);        
        
    }
    
}