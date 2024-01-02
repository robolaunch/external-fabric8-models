package tech.stackable.s3.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("s3.stackable.tech")
@io.fabric8.kubernetes.model.annotation.Singular("s3bucket")
@io.fabric8.kubernetes.model.annotation.Plural("s3buckets")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class S3Bucket extends io.fabric8.kubernetes.client.CustomResource<tech.stackable.s3.v1alpha1.S3BucketSpec, java.lang.Void> implements io.fabric8.kubernetes.api.model.Namespaced {
}

