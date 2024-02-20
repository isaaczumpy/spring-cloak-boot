package com.eoisaac.auth.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "keycloak.server")
public class KeycloakServerProperties {

    @Value("${keycloak.server.context-path}")
    String contextPath;

    @Value("${keycloak.server.realm-import-file}")
    String realmImportFile;

    AdminUser adminUser = new AdminUser();

    @Getter
    @Setter
    public static class AdminUser {
        String username = "admin";
        String password = "admin";
    }
}
