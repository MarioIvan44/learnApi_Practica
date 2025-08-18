package IntegracionBackFront.backfront.Config.Cloudinary;

import com.cloudinary.Cloudinary;
import com.google.api.client.util.Value;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

//Se ejecuta de manera automática
@Configuration //Las clase de configuración se ejecutan cuando se inicia la api, no hay necesidad de llamarlas
public class CloudinaryConfig {

    //Variables para almacenar las creedenciales de Cloudinary
    private String cloudName;
    private String apiKey;
    private String apiSecrect;

    @Bean //Es un objeto q se autogestiona, va en el apartado de configuración
    //Se auto ejecuta
    public Cloudinary cloudinary(){
        //Crear objeto DotEnv
        Dotenv dotenv = Dotenv.load();

        //Crear un Map para guardar la clave valor del Archivo .env
        Map<String, String> config = new HashMap<>();
        config.put("cloud_name", dotenv.get("CLOUDINARY_CLOUD_NAME"));
        config.put("api_key", dotenv.get("CLOUDINARY_API_KEY"));
        config.put("api_secret", dotenv.get("CLOUDINARY_API_SECRET"));

        //Retorna una nueva instancia de Cloudinary con la configuración cargada
        return new Cloudinary(config);
    }
}
