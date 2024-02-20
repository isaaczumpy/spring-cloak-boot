package com.eoisaac.auth.provider;

import lombok.extern.slf4j.Slf4j;
import org.keycloak.component.ComponentModel;
import org.keycloak.credential.CredentialInput;
import org.keycloak.credential.CredentialInputUpdater;
import org.keycloak.credential.CredentialInputValidator;
import org.keycloak.models.GroupModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;
import org.keycloak.storage.UserStorageProvider;
import org.keycloak.storage.user.*;

import java.util.Map;
import java.util.stream.Stream;

@Slf4j
public class UserProvider implements UserStorageProvider,
        UserLookupProvider, UserQueryProvider,
        CredentialInputUpdater, CredentialInputValidator,
        UserRegistrationProvider {

    private final KeycloakSession session;
    private final ComponentModel model;

//    private final PeanutsClient client; // Replace with class to manage user in database

    public UserProvider(KeycloakSession session, ComponentModel model) {
        this.session = session;
        this.model = model;
//        this.client = new PeanutsClientSimpleHttp(session, model);
    }

    @Override
    public boolean supportsCredentialType(String s) {
        return false;
    }

    @Override
    public boolean isConfiguredFor(RealmModel realmModel, UserModel userModel, String s) {
        return false;
    }

    @Override
    public boolean isValid(RealmModel realmModel, UserModel userModel, CredentialInput credentialInput) {
        log.info("Validating credential for user: {}", userModel.getUsername());
        return false;
    }

    @Override
    public boolean updateCredential(RealmModel realmModel, UserModel userModel, CredentialInput credentialInput) {
        return false;
    }

    @Override
    public void disableCredentialType(RealmModel realmModel, UserModel userModel, String s) {

    }

    @Override
    public Stream<String> getDisableableCredentialTypesStream(RealmModel realmModel, UserModel userModel) {
        return null;
    }

    @Override
    public void close() {
        log.info("Closing user provider");
    }


    @Override
    public UserModel getUserById(RealmModel realmModel, String s) {
        log.info("Getting user by id: {}", s);
        return null;
    }

    @Override
    public UserModel getUserByUsername(RealmModel realmModel, String s) {
        log.info("Getting user by username: {}", s);
        return null;
    }

    @Override
    public UserModel getUserByEmail(RealmModel realmModel, String s) {
        log.info("Getting user by email: {}", s);
        return null;
    }

    @Override
    public Stream<UserModel> searchForUserStream(RealmModel realmModel, Map<String, String> map, Integer integer, Integer integer1) {
        log.info("Searching for user: {}", map);
        return null;
    }

    @Override
    public Stream<UserModel> getGroupMembersStream(RealmModel realmModel, GroupModel groupModel, Integer integer, Integer integer1) {
        log.info("Getting group members for group: {}", groupModel.getName());
        return null;
    }

    @Override
    public Stream<UserModel> searchForUserByUserAttributeStream(RealmModel realmModel, String s, String s1) {
        log.info("Searching for user by user attribute: {}={}", s, s1);
        return null;
    }

    @Override
    public UserModel addUser(RealmModel realmModel, String s) {
        log.info("Adding user: {}", s);
        return null;
    }

    @Override
    public boolean removeUser(RealmModel realmModel, UserModel userModel) {
        log.info("Removing user: {}", userModel.getUsername());
        return false;
    }
}
