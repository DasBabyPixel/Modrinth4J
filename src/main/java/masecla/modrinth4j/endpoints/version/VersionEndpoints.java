package masecla.modrinth4j.endpoints.version;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import masecla.modrinth4j.client.HttpClient;
import masecla.modrinth4j.model.version.ProjectVersion;

@AllArgsConstructor
public class VersionEndpoints {
    private Gson gson;
    private HttpClient httpClient;

    public CompletableFuture<ProjectVersion[]> getProjectVersions(String slug,
            GetProjectVersions.GetProjectVersionsRequest requestObject) {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("id", slug);

        return new GetProjectVersions(httpClient, gson).sendRequest(requestObject, parameters);
    }

    public CompletableFuture<ProjectVersion> getVersion(String versionId) {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("id", versionId);

        return new GetVersion(httpClient, gson).sendRequest(null, parameters);
    }
}
