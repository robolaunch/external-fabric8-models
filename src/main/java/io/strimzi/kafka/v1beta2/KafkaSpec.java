package io.strimzi.kafka.v1beta2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clientsCa","clusterCa","cruiseControl","entityOperator","jmxTrans","kafka","kafkaExporter","maintenanceTimeWindows","zookeeper"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KafkaSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Configuration of the clients certificate authority.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientsCa")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration of the clients certificate authority.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.ClientsCa clientsCa;

    public io.strimzi.kafka.v1beta2.kafkaspec.ClientsCa getClientsCa() {
        return clientsCa;
    }

    public void setClientsCa(io.strimzi.kafka.v1beta2.kafkaspec.ClientsCa clientsCa) {
        this.clientsCa = clientsCa;
    }

    /**
     * Configuration of the cluster certificate authority.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterCa")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration of the cluster certificate authority.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.ClusterCa clusterCa;

    public io.strimzi.kafka.v1beta2.kafkaspec.ClusterCa getClusterCa() {
        return clusterCa;
    }

    public void setClusterCa(io.strimzi.kafka.v1beta2.kafkaspec.ClusterCa clusterCa) {
        this.clusterCa = clusterCa;
    }

    /**
     * Configuration for Cruise Control deployment. Deploys a Cruise Control instance when specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cruiseControl")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration for Cruise Control deployment. Deploys a Cruise Control instance when specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.CruiseControl cruiseControl;

    public io.strimzi.kafka.v1beta2.kafkaspec.CruiseControl getCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(io.strimzi.kafka.v1beta2.kafkaspec.CruiseControl cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    /**
     * Configuration of the Entity Operator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entityOperator")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration of the Entity Operator.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.EntityOperator entityOperator;

    public io.strimzi.kafka.v1beta2.kafkaspec.EntityOperator getEntityOperator() {
        return entityOperator;
    }

    public void setEntityOperator(io.strimzi.kafka.v1beta2.kafkaspec.EntityOperator entityOperator) {
        this.entityOperator = entityOperator;
    }

    /**
     * As of Strimzi 0.35.0, JMXTrans is not supported anymore and this option is ignored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jmxTrans")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("As of Strimzi 0.35.0, JMXTrans is not supported anymore and this option is ignored.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.JmxTrans jmxTrans;

    public io.strimzi.kafka.v1beta2.kafkaspec.JmxTrans getJmxTrans() {
        return jmxTrans;
    }

    public void setJmxTrans(io.strimzi.kafka.v1beta2.kafkaspec.JmxTrans jmxTrans) {
        this.jmxTrans = jmxTrans;
    }

    /**
     * Configuration of the Kafka cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration of the Kafka cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.Kafka kafka;

    public io.strimzi.kafka.v1beta2.kafkaspec.Kafka getKafka() {
        return kafka;
    }

    public void setKafka(io.strimzi.kafka.v1beta2.kafkaspec.Kafka kafka) {
        this.kafka = kafka;
    }

    /**
     * Configuration of the Kafka Exporter. Kafka Exporter can provide additional metrics, for example lag of consumer group at topic/partition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafkaExporter")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration of the Kafka Exporter. Kafka Exporter can provide additional metrics, for example lag of consumer group at topic/partition.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.KafkaExporter kafkaExporter;

    public io.strimzi.kafka.v1beta2.kafkaspec.KafkaExporter getKafkaExporter() {
        return kafkaExporter;
    }

    public void setKafkaExporter(io.strimzi.kafka.v1beta2.kafkaspec.KafkaExporter kafkaExporter) {
        this.kafkaExporter = kafkaExporter;
    }

    /**
     * A list of time windows for maintenance tasks (that is, certificates renewal). Each time window is defined by a cron expression.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceTimeWindows")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of time windows for maintenance tasks (that is, certificates renewal). Each time window is defined by a cron expression.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> maintenanceTimeWindows;

    public java.util.List<String> getMaintenanceTimeWindows() {
        return maintenanceTimeWindows;
    }

    public void setMaintenanceTimeWindows(java.util.List<String> maintenanceTimeWindows) {
        this.maintenanceTimeWindows = maintenanceTimeWindows;
    }

    /**
     * Configuration of the ZooKeeper cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("zookeeper")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration of the ZooKeeper cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.Zookeeper zookeeper;

    public io.strimzi.kafka.v1beta2.kafkaspec.Zookeeper getZookeeper() {
        return zookeeper;
    }

    public void setZookeeper(io.strimzi.kafka.v1beta2.kafkaspec.Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
    }
}

