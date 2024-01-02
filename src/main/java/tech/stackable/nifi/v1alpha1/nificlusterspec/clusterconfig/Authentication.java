package tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authenticationClass"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Authentication implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Name of the [AuthenticationClass](https://docs.stackable.tech/home/nightly/concepts/authentication) used to authenticate users. Supported providers are `static` and `ldap`. For `static` the "admin" user needs to be present in the referenced secret, and only this user will be added to NiFi, other users are ignored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationClass")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the [AuthenticationClass](https://docs.stackable.tech/home/nightly/concepts/authentication) used to authenticate users. Supported providers are `static` and `ldap`. For `static` the \"admin\" user needs to be present in the referenced secret, and only this user will be added to NiFi, other users are ignored.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String authenticationClass;

    public String getAuthenticationClass() {
        return authenticationClass;
    }

    public void setAuthenticationClass(String authenticationClass) {
        this.authenticationClass = authenticationClass;
    }
}

