package masecla.modrinth4j.model.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectModeratorMessage {
    /** The message that a moderator has left for the project */
    private String message;
    /** The longer body of the message that a moderator has left for the project */
    private String body;
}
