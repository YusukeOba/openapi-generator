/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis


import org.openapitools.client.infrastructure.*
import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import kotlinx.serialization.json.Json
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

open class DefaultApi : ApiClient {

    private lateinit var client: HttpClient

    constructor(
        baseUrl: String,
        httpClientEngine: HttpClientEngine?,
        httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
        jsonBlock: Json,
    ) : super(baseUrl = baseUrl, httpClientEngine = httpClientEngine, httpClientConfig = httpClientConfig, jsonBlock = jsonBlock)

    constructor(
        baseUrl: String,
        httpClient: HttpClient
    ): super(baseUrl = baseUrl, httpClient = httpClient)

    /**
     * 
     * 
     * @param ids 
     * @return void
     */
    open suspend fun idsGet(ids: kotlin.collections.List<kotlin.String>): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/{ids}".replace("{" + "ids" + "}", ids.joinToString(",")),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


}
