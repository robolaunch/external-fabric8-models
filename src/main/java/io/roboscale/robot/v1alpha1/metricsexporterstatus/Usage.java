package io.roboscale.robot.v1alpha1.metricsexporterstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"gpu","gpuInstanceUsage","gpuModel","network"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Usage implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * GPU usage information. Will be deprecated after implementing checks for each GPU instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gpu")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GPU usage information. Will be deprecated after implementing checks for each GPU instance.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.Gpu gpu;

    public io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.Gpu getGpu() {
        return gpu;
    }

    public void setGpu(io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.Gpu gpu) {
        this.gpu = gpu;
    }

    /**
     * GPU virtual cores.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuInstanceUsage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GPU virtual cores.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.GpuInstanceUsage> gpuInstanceUsage;

    public java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.GpuInstanceUsage> getGpuInstanceUsage() {
        return gpuInstanceUsage;
    }

    public void setGpuInstanceUsage(java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.GpuInstanceUsage> gpuInstanceUsage) {
        this.gpuInstanceUsage = gpuInstanceUsage;
    }

    /**
     * GPU model
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuModel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GPU model")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String gpuModel;

    public String getGpuModel() {
        return gpuModel;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    /**
     * Network usage information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("network")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Network usage information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.Network network;

    public io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.Network getNetwork() {
        return network;
    }

    public void setNetwork(io.roboscale.robot.v1alpha1.metricsexporterstatus.usage.Network network) {
        this.network = network;
    }
}

