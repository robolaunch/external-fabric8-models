package tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.admin;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"ldapServer","ldapTlsCaSecret","passwordCacheSecret","schemaDistinguishedName","userDistinguishedName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ActiveDirectory implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * An AD LDAP server, such as the AD Domain Controller. This must match the server’s FQDN, or GSSAPI authentication will fail.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ldapServer")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("An AD LDAP server, such as the AD Domain Controller. This must match the server’s FQDN, or GSSAPI authentication will fail.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ldapServer;

    public String getLdapServer() {
        return ldapServer;
    }

    public void setLdapServer(String ldapServer) {
        this.ldapServer = ldapServer;
    }

    /**
     * Reference (name and namespace) to a Kubernetes Secret object containing the TLS CA (in `ca.crt`) that the LDAP server’s certificate should be authenticated against.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ldapTlsCaSecret")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reference (name and namespace) to a Kubernetes Secret object containing the TLS CA (in `ca.crt`) that the LDAP server’s certificate should be authenticated against.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.admin.activedirectory.LdapTlsCaSecret ldapTlsCaSecret;

    public tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.admin.activedirectory.LdapTlsCaSecret getLdapTlsCaSecret() {
        return ldapTlsCaSecret;
    }

    public void setLdapTlsCaSecret(tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.admin.activedirectory.LdapTlsCaSecret ldapTlsCaSecret) {
        this.ldapTlsCaSecret = ldapTlsCaSecret;
    }

    /**
     * Reference (name and namespace) to a Kubernetes Secret object where workload passwords will be stored. This must not be accessible to end users.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordCacheSecret")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reference (name and namespace) to a Kubernetes Secret object where workload passwords will be stored. This must not be accessible to end users.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.admin.activedirectory.PasswordCacheSecret passwordCacheSecret;

    public tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.admin.activedirectory.PasswordCacheSecret getPasswordCacheSecret() {
        return passwordCacheSecret;
    }

    public void setPasswordCacheSecret(tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.admin.activedirectory.PasswordCacheSecret passwordCacheSecret) {
        this.passwordCacheSecret = passwordCacheSecret;
    }

    /**
     * The root Distinguished Name (DN) for AD-managed schemas, typically `CN=Schema,CN=Configuration,{domain_dn}`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaDistinguishedName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The root Distinguished Name (DN) for AD-managed schemas, typically `CN=Schema,CN=Configuration,{domain_dn}`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String schemaDistinguishedName;

    public String getSchemaDistinguishedName() {
        return schemaDistinguishedName;
    }

    public void setSchemaDistinguishedName(String schemaDistinguishedName) {
        this.schemaDistinguishedName = schemaDistinguishedName;
    }

    /**
     * The root Distinguished Name (DN) where service accounts should be provisioned, typically `CN=Users,{domain_dn}`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userDistinguishedName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The root Distinguished Name (DN) where service accounts should be provisioned, typically `CN=Users,{domain_dn}`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String userDistinguishedName;

    public String getUserDistinguishedName() {
        return userDistinguishedName;
    }

    public void setUserDistinguishedName(String userDistinguishedName) {
        this.userDistinguishedName = userDistinguishedName;
    }
}

