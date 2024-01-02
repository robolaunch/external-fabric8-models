package io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"-XX","-Xms","-Xmx","gcLoggingEnabled","javaSystemProperties"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class JvmOptions implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * A map of -XX options to the JVM.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("-XX")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A map of -XX options to the JVM.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.jvmoptions._XX _XX;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.jvmoptions._XX get_XX() {
        return _XX;
    }

    public void set_XX(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.jvmoptions._XX _XX) {
        this._XX = _XX;
    }

    /**
     * -Xms option to to the JVM.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("-Xms")
    @io.fabric8.generator.annotation.Pattern("^[0-9]+[mMgG]?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("-Xms option to to the JVM.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String _Xms;

    public String get_Xms() {
        return _Xms;
    }

    public void set_Xms(String _Xms) {
        this._Xms = _Xms;
    }

    /**
     * -Xmx option to to the JVM.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("-Xmx")
    @io.fabric8.generator.annotation.Pattern("^[0-9]+[mMgG]?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("-Xmx option to to the JVM.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String _Xmx;

    public String get_Xmx() {
        return _Xmx;
    }

    public void set_Xmx(String _Xmx) {
        this._Xmx = _Xmx;
    }

    /**
     * Specifies whether the Garbage Collection logging is enabled. The default is false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gcLoggingEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies whether the Garbage Collection logging is enabled. The default is false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean gcLoggingEnabled;

    public Boolean getGcLoggingEnabled() {
        return gcLoggingEnabled;
    }

    public void setGcLoggingEnabled(Boolean gcLoggingEnabled) {
        this.gcLoggingEnabled = gcLoggingEnabled;
    }

    /**
     * A map of additional system properties which will be passed using the `-D` option to the JVM.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("javaSystemProperties")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A map of additional system properties which will be passed using the `-D` option to the JVM.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.jvmoptions.JavaSystemProperties> javaSystemProperties;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.jvmoptions.JavaSystemProperties> getJavaSystemProperties() {
        return javaSystemProperties;
    }

    public void setJavaSystemProperties(java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.jvmoptions.JavaSystemProperties> javaSystemProperties) {
        this.javaSystemProperties = javaSystemProperties;
    }
}

