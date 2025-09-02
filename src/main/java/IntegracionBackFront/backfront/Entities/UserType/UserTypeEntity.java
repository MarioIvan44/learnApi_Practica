package IntegracionBackFront.backfront.Entities.UserType;

import IntegracionBackFront.backfront.Entities.Users.UserEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@EqualsAndHashCode
@Getter
@Setter
@Table(name = "TIPOUSUARIO")
public class UserTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tipousuario")
    @SequenceGenerator(name = "seq_tipousuario", sequenceName = "seq_tipousuario", allocationSize = 1)
    @Column(name = "IDTIPOUSUARIO")
    private Long id;

    @Column(name = "NOMBRETIPO")
    private String nombreTipo;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @OneToMany(mappedBy = "tipoUsuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore //Tiene Json Ignore porque para crear un id de tipo usuario, este atributo no lo pida y q lo ignore en el json
    private List<UserEntity> usuarios = new ArrayList<>();

    @Override
    public String toString() {
        return "UserTypeEntity{" +
                "id=" + id +
                ", nombreTipo='" + nombreTipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", usuarios=" + usuarios +
                '}';
    }
}
