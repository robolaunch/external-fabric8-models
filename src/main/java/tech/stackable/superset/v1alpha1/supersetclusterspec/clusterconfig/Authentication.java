package tech.stackable.superset.v1alpha1.supersetclusterspec.clusterconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authenticationClass","syncRolesAt","userRegistration","userRegistrationRole"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Authentication implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Name of the [AuthenticationClass](https://docs.stackable.tech/home/nightly/concepts/authentication.html#authenticationclass) used to authenticate the users. At the moment only LDAP is supported. If not specified the default authentication (AUTH_DB) will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the [AuthenticationClass](https://docs.stackable.tech/home/nightly/concepts/authentication.html#authenticationclass) used to authenticate the users. At the moment only LDAP is supported. If not specified the default authentication (AUTH_DB) will be used.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String authenticationClass;

    public String getAuthenticationClass() {
        return authenticationClass;
    }

    public void setAuthenticationClass(String authenticationClass) {
        this.authenticationClass = authenticationClass;
    }

    public enum SyncRolesAt {

        @com.fasterxml.jackson.annotation.JsonProperty("Registration")
        REGISTRATION("Registration"), @com.fasterxml.jackson.annotation.JsonProperty("Login")
        LOGIN("Login");

        java.lang.String value;

        SyncRolesAt(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * If we should replace ALL the user's roles each login, or only on registration. Gets mapped to `AUTH_ROLES_SYNC_AT_LOGIN`
     */
    @com.fasterxml.jackson.annotation.JsonProperty("syncRolesAt")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If we should replace ALL the user's roles each login, or only on registration. Gets mapped to `AUTH_ROLES_SYNC_AT_LOGIN`")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private SyncRolesAt syncRolesAt = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"Registration\"", SyncRolesAt.class);

    public SyncRolesAt getSyncRolesAt() {
        return syncRolesAt;
    }

    public void setSyncRolesAt(SyncRolesAt syncRolesAt) {
        this.syncRolesAt = syncRolesAt;
    }

    /**
     * Allow users who are not already in the FAB DB. Gets mapped to `AUTH_USER_REGISTRATION`
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userRegistration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow users who are not already in the FAB DB. Gets mapped to `AUTH_USER_REGISTRATION`")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean userRegistration = true;

    public Boolean getUserRegistration() {
        return userRegistration;
    }

    public void setUserRegistration(Boolean userRegistration) {
        this.userRegistration = userRegistration;
    }

    /**
     * This role will be given in addition to any AUTH_ROLES_MAPPING. Gets mapped to `AUTH_USER_REGISTRATION_ROLE`
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userRegistrationRole")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This role will be given in addition to any AUTH_ROLES_MAPPING. Gets mapped to `AUTH_USER_REGISTRATION_ROLE`")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String userRegistrationRole = "Public";

    public String getUserRegistrationRole() {
        return userRegistrationRole;
    }

    public void setUserRegistrationRole(String userRegistrationRole) {
        this.userRegistrationRole = userRegistrationRole;
    }
}

