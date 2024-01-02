package tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"activeDirectory","mit"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Admin implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Credentials should be provisioned in a Microsoft Active Directory domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("activeDirectory")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Credentials should be provisioned in a Microsoft Active Directory domain.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.admin.ActiveDirectory activeDirectory;

    public tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.admin.ActiveDirectory getActiveDirectory() {
        return activeDirectory;
    }

    public void setActiveDirectory(tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.admin.ActiveDirectory activeDirectory) {
        this.activeDirectory = activeDirectory;
    }

    /**
     * Credentials should be provisioned in a MIT Kerberos Admin Server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Credentials should be provisioned in a MIT Kerberos Admin Server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.admin.Mit mit;

    public tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.admin.Mit getMit() {
        return mit;
    }

    public void setMit(tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.admin.Mit mit) {
        this.mit = mit;
    }
}

