package tech.stackable.s3.v1alpha1.s3bucketspec.connection;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"accessStyle","credentials","host","port","tls"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Inline implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum AccessStyle {

        @com.fasterxml.jackson.annotation.JsonProperty("Path")
        PATH("Path"), @com.fasterxml.jackson.annotation.JsonProperty("VirtualHosted")
        VIRTUALHOSTED("VirtualHosted");

        java.lang.String value;

        AccessStyle(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Which access style to use. Defaults to virtual hosted-style as most of the data products out there. Have a look at the [AWS documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/VirtualHosting.html).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessStyle")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Which access style to use. Defaults to virtual hosted-style as most of the data products out there. Have a look at the [AWS documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/VirtualHosting.html).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private AccessStyle accessStyle;

    public AccessStyle getAccessStyle() {
        return accessStyle;
    }

    public void setAccessStyle(AccessStyle accessStyle) {
        this.accessStyle = accessStyle;
    }

    /**
     * If the S3 uses authentication you have to specify you S3 credentials. In the most cases a [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass) providing `accessKey` and `secretKey` is sufficient.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If the S3 uses authentication you have to specify you S3 credentials. In the most cases a [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass) providing `accessKey` and `secretKey` is sufficient.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.s3.v1alpha1.s3bucketspec.connection.inline.Credentials credentials;

    public tech.stackable.s3.v1alpha1.s3bucketspec.connection.inline.Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(tech.stackable.s3.v1alpha1.s3bucketspec.connection.inline.Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * Hostname of the S3 server without any protocol or port. For example: `west1.my-cloud.com`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hostname of the S3 server without any protocol or port. For example: `west1.my-cloud.com`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Port the S3 server listens on. If not specified the product will determine the port to use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Port the S3 server listens on. If not specified the product will determine the port to use.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private Long port;

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    /**
     * If you want to use TLS when talking to S3 you can enable TLS encrypted communication with this setting.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If you want to use TLS when talking to S3 you can enable TLS encrypted communication with this setting.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.s3.v1alpha1.s3bucketspec.connection.inline.Tls tls;

    public tech.stackable.s3.v1alpha1.s3bucketspec.connection.inline.Tls getTls() {
        return tls;
    }

    public void setTls(tech.stackable.s3.v1alpha1.s3bucketspec.connection.inline.Tls tls) {
        this.tls = tls;
    }
}

