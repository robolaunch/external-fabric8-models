package tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"algorithm","autoGenerate","keySecret"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class SensitiveProperties implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum Algorithm {

        @com.fasterxml.jackson.annotation.JsonProperty("nifiArgon2AesGcm128")
        NIFIARGON2AESGCM128("nifiArgon2AesGcm128"),
        @com.fasterxml.jackson.annotation.JsonProperty("nifiArgon2AesGcm256")
        NIFIARGON2AESGCM256("nifiArgon2AesGcm256"),
        @com.fasterxml.jackson.annotation.JsonProperty("nifiBcryptAesGcm128")
        NIFIBCRYPTAESGCM128("nifiBcryptAesGcm128"),
        @com.fasterxml.jackson.annotation.JsonProperty("nifiBcryptAesGcm256")
        NIFIBCRYPTAESGCM256("nifiBcryptAesGcm256"),
        @com.fasterxml.jackson.annotation.JsonProperty("nifiPbkdf2AesGcm128")
        NIFIPBKDF2AESGCM128("nifiPbkdf2AesGcm128"),
        @com.fasterxml.jackson.annotation.JsonProperty("nifiPbkdf2AesGcm256")
        NIFIPBKDF2AESGCM256("nifiPbkdf2AesGcm256"),
        @com.fasterxml.jackson.annotation.JsonProperty("nifiScryptAesGcm128")
        NIFISCRYPTAESGCM128("nifiScryptAesGcm128"),
        @com.fasterxml.jackson.annotation.JsonProperty("nifiScryptAesGcm256")
        NIFISCRYPTAESGCM256("nifiScryptAesGcm256");

        java.lang.String value;

        Algorithm(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * This is setting the `nifi.sensitive.props.algorithm` property in NiFi. This setting configures the encryption algorithm to use to encrypt sensitive properties. Valid values are: `nifiArgon2AesGcm128`, `nifiArgon2AesGcm256`, `nifiBcryptAesGcm128`, `nifiBcryptAesGcm256`, `nifiPbkdf2AesGcm128`, `nifiPbkdf2AesGcm256`, `nifiScryptAesGcm128`, `nifiScryptAesGcm256`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This is setting the `nifi.sensitive.props.algorithm` property in NiFi. This setting configures the encryption algorithm to use to encrypt sensitive properties. Valid values are: `nifiArgon2AesGcm128`, `nifiArgon2AesGcm256`, `nifiBcryptAesGcm128`, `nifiBcryptAesGcm256`, `nifiPbkdf2AesGcm128`, `nifiPbkdf2AesGcm256`, `nifiScryptAesGcm128`, `nifiScryptAesGcm256`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private Algorithm algorithm;

    public Algorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * Whether to generate the `keySecret` if it is missing. Defaults to `false`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoGenerate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether to generate the `keySecret` if it is missing. Defaults to `false`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean autoGenerate = false;

    public Boolean getAutoGenerate() {
        return autoGenerate;
    }

    public void setAutoGenerate(Boolean autoGenerate) {
        this.autoGenerate = autoGenerate;
    }

    /**
     * A reference to a Secret. The Secret needs to contain a key `nifiSensitivePropsKey`. If `autoGenerate` is false and this object is missing, the Operator will raise an error.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keySecret")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A reference to a Secret. The Secret needs to contain a key `nifiSensitivePropsKey`. If `autoGenerate` is false and this object is missing, the Operator will raise an error.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String keySecret;

    public String getKeySecret() {
        return keySecret;
    }

    public void setKeySecret(String keySecret) {
        this.keySecret = keySecret;
    }
}

