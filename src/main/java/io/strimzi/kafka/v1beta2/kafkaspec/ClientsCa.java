package io.strimzi.kafka.v1beta2.kafkaspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"certificateExpirationPolicy","generateCertificateAuthority","generateSecretOwnerReference","renewalDays","validityDays"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ClientsCa implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum CertificateExpirationPolicy {

        @com.fasterxml.jackson.annotation.JsonProperty("renew-certificate")
        RENEWCERTIFICATE("renew-certificate"), @com.fasterxml.jackson.annotation.JsonProperty("replace-key")
        REPLACEKEY("replace-key");

        java.lang.String value;

        CertificateExpirationPolicy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * How should CA certificate expiration be handled when `generateCertificateAuthority=true`. The default is for a new CA certificate to be generated reusing the existing private key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateExpirationPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("How should CA certificate expiration be handled when `generateCertificateAuthority=true`. The default is for a new CA certificate to be generated reusing the existing private key.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private CertificateExpirationPolicy certificateExpirationPolicy;

    public CertificateExpirationPolicy getCertificateExpirationPolicy() {
        return certificateExpirationPolicy;
    }

    public void setCertificateExpirationPolicy(CertificateExpirationPolicy certificateExpirationPolicy) {
        this.certificateExpirationPolicy = certificateExpirationPolicy;
    }

    /**
     * If true then Certificate Authority certificates will be generated automatically. Otherwise the user will need to provide a Secret with the CA certificate. Default is true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("generateCertificateAuthority")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If true then Certificate Authority certificates will be generated automatically. Otherwise the user will need to provide a Secret with the CA certificate. Default is true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean generateCertificateAuthority;

    public Boolean getGenerateCertificateAuthority() {
        return generateCertificateAuthority;
    }

    public void setGenerateCertificateAuthority(Boolean generateCertificateAuthority) {
        this.generateCertificateAuthority = generateCertificateAuthority;
    }

    /**
     * If `true`, the Cluster and Client CA Secrets are configured with the `ownerReference` set to the `Kafka` resource. If the `Kafka` resource is deleted when `true`, the CA Secrets are also deleted. If `false`, the `ownerReference` is disabled. If the `Kafka` resource is deleted when `false`, the CA Secrets are retained and available for reuse. Default is `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("generateSecretOwnerReference")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If `true`, the Cluster and Client CA Secrets are configured with the `ownerReference` set to the `Kafka` resource. If the `Kafka` resource is deleted when `true`, the CA Secrets are also deleted. If `false`, the `ownerReference` is disabled. If the `Kafka` resource is deleted when `false`, the CA Secrets are retained and available for reuse. Default is `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean generateSecretOwnerReference;

    public Boolean getGenerateSecretOwnerReference() {
        return generateSecretOwnerReference;
    }

    public void setGenerateSecretOwnerReference(Boolean generateSecretOwnerReference) {
        this.generateSecretOwnerReference = generateSecretOwnerReference;
    }

    /**
     * The number of days in the certificate renewal period. This is the number of days before the a certificate expires during which renewal actions may be performed. When `generateCertificateAuthority` is true, this will cause the generation of a new certificate. When `generateCertificateAuthority` is true, this will cause extra logging at WARN level about the pending certificate expiry. Default is 30.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("renewalDays")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of days in the certificate renewal period. This is the number of days before the a certificate expires during which renewal actions may be performed. When `generateCertificateAuthority` is true, this will cause the generation of a new certificate. When `generateCertificateAuthority` is true, this will cause extra logging at WARN level about the pending certificate expiry. Default is 30.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long renewalDays;

    public Long getRenewalDays() {
        return renewalDays;
    }

    public void setRenewalDays(Long renewalDays) {
        this.renewalDays = renewalDays;
    }

    /**
     * The number of days generated certificates should be valid for. The default is 365.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validityDays")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of days generated certificates should be valid for. The default is 365.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long validityDays;

    public Long getValidityDays() {
        return validityDays;
    }

    public void setValidityDays(Long validityDays) {
        this.validityDays = validityDays;
    }
}

