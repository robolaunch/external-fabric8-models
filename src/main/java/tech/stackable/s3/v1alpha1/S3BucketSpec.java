package tech.stackable.s3.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"bucketName","connection"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class S3BucketSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The name of the S3 bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the S3 bucket.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String bucketName;

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * The definition of an S3 connection, either inline or as a reference.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connection")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The definition of an S3 connection, either inline or as a reference.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.s3.v1alpha1.s3bucketspec.Connection connection;

    public tech.stackable.s3.v1alpha1.s3bucketspec.Connection getConnection() {
        return connection;
    }

    public void setConnection(tech.stackable.s3.v1alpha1.s3bucketspec.Connection connection) {
        this.connection = connection;
    }
}

