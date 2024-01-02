package io.strimzi.kafka.v1beta2;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1beta2" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("kafka.strimzi.io")
@io.fabric8.kubernetes.model.annotation.Singular("kafka")
@io.fabric8.kubernetes.model.annotation.Plural("kafkas")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Kafka extends io.fabric8.kubernetes.client.CustomResource<io.strimzi.kafka.v1beta2.KafkaSpec, io.strimzi.kafka.v1beta2.KafkaStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

