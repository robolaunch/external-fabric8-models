package tech.stackable.secrets.v1alpha1.secretclassspec.backend;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"ca","maxCertificateLifetime"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class AutoTls implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Configures the certificate authority used to issue Pod certificates.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ca")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures the certificate authority used to issue Pod certificates.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.secrets.v1alpha1.secretclassspec.backend.autotls.Ca ca;

    public tech.stackable.secrets.v1alpha1.secretclassspec.backend.autotls.Ca getCa() {
        return ca;
    }

    public void setCa(tech.stackable.secrets.v1alpha1.secretclassspec.backend.autotls.Ca ca) {
        this.ca = ca;
    }

    /**
     * Maximum lifetime the created certificates are allowed to have. In case consumers request a longer lifetime than allowed by this setting, the lifetime will be the minimum of both, so this setting takes precedence. The default value is 15 days.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxCertificateLifetime")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum lifetime the created certificates are allowed to have. In case consumers request a longer lifetime than allowed by this setting, the lifetime will be the minimum of both, so this setting takes precedence. The default value is 15 days.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String maxCertificateLifetime = "15d";

    public String getMaxCertificateLifetime() {
        return maxCertificateLifetime;
    }

    public void setMaxCertificateLifetime(String maxCertificateLifetime) {
        this.maxCertificateLifetime = maxCertificateLifetime;
    }
}

