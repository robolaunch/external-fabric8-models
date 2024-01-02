package tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"reconciliationPaused","stopped"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ClusterOperation implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Flag to stop cluster reconciliation by the operator. This means that all changes in the custom resource spec are ignored until this flag is set to false or removed. The operator will however still watch the deployed resources at the time and update the custom resource status field. If applied at the same time with `stopped`, `reconciliationPaused` will take precedence over `stopped` and stop the reconciliation immediately.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reconciliationPaused")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Flag to stop cluster reconciliation by the operator. This means that all changes in the custom resource spec are ignored until this flag is set to false or removed. The operator will however still watch the deployed resources at the time and update the custom resource status field. If applied at the same time with `stopped`, `reconciliationPaused` will take precedence over `stopped` and stop the reconciliation immediately.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean reconciliationPaused = false;

    public Boolean getReconciliationPaused() {
        return reconciliationPaused;
    }

    public void setReconciliationPaused(Boolean reconciliationPaused) {
        this.reconciliationPaused = reconciliationPaused;
    }

    /**
     * Flag to stop the cluster. This means all deployed resources (e.g. Services, StatefulSets, ConfigMaps) are kept but all deployed Pods (e.g. replicas from a StatefulSet) are scaled to 0 and therefore stopped and removed. If applied at the same time with `reconciliationPaused`, the latter will pause reconciliation and `stopped` will take no effect until `reconciliationPaused` is set to false or removed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stopped")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Flag to stop the cluster. This means all deployed resources (e.g. Services, StatefulSets, ConfigMaps) are kept but all deployed Pods (e.g. replicas from a StatefulSet) are scaled to 0 and therefore stopped and removed. If applied at the same time with `reconciliationPaused`, the latter will pause reconciliation and `stopped` will take no effect until `reconciliationPaused` is set to false or removed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean stopped = false;

    public Boolean getStopped() {
        return stopped;
    }

    public void setStopped(Boolean stopped) {
        this.stopped = stopped;
    }
}

