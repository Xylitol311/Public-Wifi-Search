package com.example.publicwifisearch.config.api;

import com.example.publicwifisearch.dto.WifiApiDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;


class ApiExplorerTest {
    static ApiExplorer explorer = new ApiExplorer();
    static JsonConverter jsonConverter = new JsonConverter();

    @Test
    void printTest() throws IOException {
        String apiJson = explorer.getApiJson(1, 3);
        WifiApiDTO[] wifiApiDTOS = jsonConverter.jsonToWifiObject(apiJson);
        int i = 1;
        for (WifiApiDTO wi : wifiApiDTOS) {
            System.out.println("[" + i++ + "]");
            System.out.println(wi);
            System.out.println("====================");
        }
    }
}