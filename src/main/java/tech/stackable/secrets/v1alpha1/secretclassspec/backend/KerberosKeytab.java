package tech.stackable.secrets.v1alpha1.secretclassspec.backend;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"admin","adminKeytabSecret","adminPrincipal","kdc","realmName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KerberosKeytab implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Kerberos admin configuration settings.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("admin")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kerberos admin configuration settings.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.Admin admin;

    public tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.Admin getAdmin() {
        return admin;
    }

    public void setAdmin(tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.Admin admin) {
        this.admin = admin;
    }

    /**
     * Reference (`name` and `namespace`) to a K8s Secret object where a keytab with administrative privileges is stored in the key `keytab`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminKeytabSecret")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reference (`name` and `namespace`) to a K8s Secret object where a keytab with administrative privileges is stored in the key `keytab`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.AdminKeytabSecret adminKeytabSecret;

    public tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.AdminKeytabSecret getAdminKeytabSecret() {
        return adminKeytabSecret;
    }

    public void setAdminKeytabSecret(tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.AdminKeytabSecret adminKeytabSecret) {
        this.adminKeytabSecret = adminKeytabSecret;
    }

    /**
     * The admin principal.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPrincipal")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The admin principal.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String adminPrincipal;

    public String getAdminPrincipal() {
        return adminPrincipal;
    }

    public void setAdminPrincipal(String adminPrincipal) {
        this.adminPrincipal = adminPrincipal;
    }

    /**
     * The hostname of the Kerberos Key Distribution Center (KDC). This should be provided by the Kerberos administrator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kdc")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The hostname of the Kerberos Key Distribution Center (KDC). This should be provided by the Kerberos administrator.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String kdc;

    public String getKdc() {
        return kdc;
    }

    public void setKdc(String kdc) {
        this.kdc = kdc;
    }

    /**
     * The name of the Kerberos realm. This should be provided by the Kerberos administrator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("realmName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the Kerberos realm. This should be provided by the Kerberos administrator.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String realmName;

    public String getRealmName() {
        return realmName;
    }

    public void setRealmName(String realmName) {
        this.realmName = realmName;
    }
}

