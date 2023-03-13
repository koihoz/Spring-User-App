package name.discription.Spring.User.App.entity.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRequestDto {
    @NotBlank
    private String name;
    @Email
    @Size(max = 255)
    private String login;
    @NotBlank
    private String password;




}
