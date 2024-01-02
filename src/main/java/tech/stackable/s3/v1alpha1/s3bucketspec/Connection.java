package tech.stackable.s3.v1alpha1.s3bucketspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"inline","reference"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Connection implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Inline definition of an S3 connection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inline")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Inline definition of an S3 connection.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.s3.v1alpha1.s3bucketspec.connection.Inline inline;

    public tech.stackable.s3.v1alpha1.s3bucketspec.connection.Inline getInline() {
        return inline;
    }

    public void setInline(tech.stackable.s3.v1alpha1.s3bucketspec.connection.Inline inline) {
        this.inline = inline;
    }

    /**
     * A reference to an S3Connection resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A reference to an S3Connection resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String reference;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}

