/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.get_upgrade.Response
@JsonpDeserializable
public class GetUpgradeResponse implements JsonpSerializable {
	private final List<OverlappingIndexTemplate> overlapping;

	@Nullable
	private final TemplateMapping template;

	// ---------------------------------------------------------------------------------------------

	private GetUpgradeResponse(Builder builder) {

		this.overlapping = ModelTypeHelper.unmodifiable(builder.overlapping);
		this.template = builder.template;

	}

	public static GetUpgradeResponse of(Function<Builder, ObjectBuilder<GetUpgradeResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Any templates that were superseded by the specified template.
	 * <p>
	 * API name: {@code overlapping}
	 */
	public final List<OverlappingIndexTemplate> overlapping() {
		return this.overlapping;
	}

	/**
	 * The settings, mappings, and aliases that would be applied to matching
	 * indices.
	 * <p>
	 * API name: {@code template}
	 */
	@Nullable
	public final TemplateMapping template() {
		return this.template;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ModelTypeHelper.isDefined(this.overlapping)) {
			generator.writeKey("overlapping");
			generator.writeStartArray();
			for (OverlappingIndexTemplate item0 : this.overlapping) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.template != null) {
			generator.writeKey("template");
			this.template.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetUpgradeResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetUpgradeResponse> {
		@Nullable
		private List<OverlappingIndexTemplate> overlapping;

		@Nullable
		private TemplateMapping template;

		/**
		 * Any templates that were superseded by the specified template.
		 * <p>
		 * API name: {@code overlapping}
		 */
		public final Builder overlapping(@Nullable List<OverlappingIndexTemplate> value) {
			this.overlapping = value;
			return this;
		}

		/**
		 * Any templates that were superseded by the specified template.
		 * <p>
		 * API name: {@code overlapping}
		 */
		public final Builder overlapping(OverlappingIndexTemplate... value) {
			this.overlapping = Arrays.asList(value);
			return this;
		}

		/**
		 * Any templates that were superseded by the specified template.
		 * <p>
		 * API name: {@code overlapping}
		 */
		@SafeVarargs
		public final Builder overlapping(
				Function<OverlappingIndexTemplate.Builder, ObjectBuilder<OverlappingIndexTemplate>>... fns) {
			this.overlapping = new ArrayList<>(fns.length);
			for (Function<OverlappingIndexTemplate.Builder, ObjectBuilder<OverlappingIndexTemplate>> fn : fns) {
				this.overlapping.add(fn.apply(new OverlappingIndexTemplate.Builder()).build());
			}
			return this;
		}

		/**
		 * The settings, mappings, and aliases that would be applied to matching
		 * indices.
		 * <p>
		 * API name: {@code template}
		 */
		public final Builder template(@Nullable TemplateMapping value) {
			this.template = value;
			return this;
		}

		/**
		 * The settings, mappings, and aliases that would be applied to matching
		 * indices.
		 * <p>
		 * API name: {@code template}
		 */
		public final Builder template(Function<TemplateMapping.Builder, ObjectBuilder<TemplateMapping>> fn) {
			return this.template(fn.apply(new TemplateMapping.Builder()).build());
		}

		/**
		 * Builds a {@link GetUpgradeResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetUpgradeResponse build() {
			_checkSingleUse();

			return new GetUpgradeResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetUpgradeResponse}
	 */
	public static final JsonpDeserializer<GetUpgradeResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetUpgradeResponse::setupGetUpgradeResponseDeserializer, Builder::build);

	protected static void setupGetUpgradeResponseDeserializer(DelegatingDeserializer<GetUpgradeResponse.Builder> op) {

		op.add(Builder::overlapping, JsonpDeserializer.arrayDeserializer(OverlappingIndexTemplate._DESERIALIZER),
				"overlapping");
		op.add(Builder::template, TemplateMapping._DESERIALIZER, "template");

	}

}
