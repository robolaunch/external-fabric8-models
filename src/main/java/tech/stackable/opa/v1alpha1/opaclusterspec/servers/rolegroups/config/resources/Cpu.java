package tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.config.resources;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"max","min"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Cpu implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.
     *
     * The serialization format is:
     *
     * ``` <quantity>        ::= <signedNumber><suffix>
     *
     * 	(Note that <suffix> may be empty, from the "" case in <decimalSI>.)
     *
     * <digit>           ::= 0 | 1 | ... | 9 <digits>          ::= <digit> | <digit><digits> <number>          ::= <digits> | <digits>.<digits> | <digits>. | .<digits> <sign>            ::= "+" | "-" <signedNumber>    ::= <number> | <sign><number> <suffix>          ::= <binarySI> | <decimalExponent> | <decimalSI> <binarySI>        ::= Ki | Mi | Gi | Ti | Pi | Ei
     *
     * 	(International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)
     *
     * <decimalSI>       ::= m | "" | k | M | G | T | P | E
     *
     * 	(Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.)
     *
     * <decimalExponent> ::= "e" <signedNumber> | "E" <signedNumber> ```
     *
     * No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.
     *
     * When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.
     *
     * Before serializing, Quantity will be put in "canonical form". This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:
     *
     * - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.
     *
     * The sign will be omitted unless the number is negative.
     *
     * Examples:
     *
     * - 1.5 will be serialized as "1500m" - 1.5Gi will be serialized as "1536Mi"
     *
     * Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.
     *
     * Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don't diff.)
     *
     * This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.\n\nThe serialization format is:\n\n``` <quantity>        ::= <signedNumber><suffix>\n\n\t(Note that <suffix> may be empty, from the \"\" case in <decimalSI>.)\n\n<digit>           ::= 0 | 1 | ... | 9 <digits>          ::= <digit> | <digit><digits> <number>          ::= <digits> | <digits>.<digits> | <digits>. | .<digits> <sign>            ::= \"+\" | \"-\" <signedNumber>    ::= <number> | <sign><number> <suffix>          ::= <binarySI> | <decimalExponent> | <decimalSI> <binarySI>        ::= Ki | Mi | Gi | Ti | Pi | Ei\n\n\t(International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)\n\n<decimalSI>       ::= m | \"\" | k | M | G | T | P | E\n\n\t(Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.)\n\n<decimalExponent> ::= \"e\" <signedNumber> | \"E\" <signedNumber> ```\n\nNo matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.\n\nWhen a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.\n\nBefore serializing, Quantity will be put in \"canonical form\". This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:\n\n- No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.\n\nThe sign will be omitted unless the number is negative.\n\nExamples:\n\n- 1.5 will be serialized as \"1500m\" - 1.5Gi will be serialized as \"1536Mi\"\n\nNote that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.\n\nNon-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don't diff.)\n\nThis format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String max;

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    /**
     * Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.
     *
     * The serialization format is:
     *
     * ``` <quantity>        ::= <signedNumber><suffix>
     *
     * 	(Note that <suffix> may be empty, from the "" case in <decimalSI>.)
     *
     * <digit>           ::= 0 | 1 | ... | 9 <digits>          ::= <digit> | <digit><digits> <number>          ::= <digits> | <digits>.<digits> | <digits>. | .<digits> <sign>            ::= "+" | "-" <signedNumber>    ::= <number> | <sign><number> <suffix>          ::= <binarySI> | <decimalExponent> | <decimalSI> <binarySI>        ::= Ki | Mi | Gi | Ti | Pi | Ei
     *
     * 	(International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)
     *
     * <decimalSI>       ::= m | "" | k | M | G | T | P | E
     *
     * 	(Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.)
     *
     * <decimalExponent> ::= "e" <signedNumber> | "E" <signedNumber> ```
     *
     * No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.
     *
     * When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.
     *
     * Before serializing, Quantity will be put in "canonical form". This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:
     *
     * - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.
     *
     * The sign will be omitted unless the number is negative.
     *
     * Examples:
     *
     * - 1.5 will be serialized as "1500m" - 1.5Gi will be serialized as "1536Mi"
     *
     * Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.
     *
     * Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don't diff.)
     *
     * This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.\n\nThe serialization format is:\n\n``` <quantity>        ::= <signedNumber><suffix>\n\n\t(Note that <suffix> may be empty, from the \"\" case in <decimalSI>.)\n\n<digit>           ::= 0 | 1 | ... | 9 <digits>          ::= <digit> | <digit><digits> <number>          ::= <digits> | <digits>.<digits> | <digits>. | .<digits> <sign>            ::= \"+\" | \"-\" <signedNumber>    ::= <number> | <sign><number> <suffix>          ::= <binarySI> | <decimalExponent> | <decimalSI> <binarySI>        ::= Ki | Mi | Gi | Ti | Pi | Ei\n\n\t(International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)\n\n<decimalSI>       ::= m | \"\" | k | M | G | T | P | E\n\n\t(Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.)\n\n<decimalExponent> ::= \"e\" <signedNumber> | \"E\" <signedNumber> ```\n\nNo matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.\n\nWhen a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.\n\nBefore serializing, Quantity will be put in \"canonical form\". This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:\n\n- No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.\n\nThe sign will be omitted unless the number is negative.\n\nExamples:\n\n- 1.5 will be serialized as \"1500m\" - 1.5Gi will be serialized as \"1536Mi\"\n\nNote that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.\n\nNon-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don't diff.)\n\nThis format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String min;

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }
}

