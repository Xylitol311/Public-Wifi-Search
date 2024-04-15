package com.example.publicwifisearch.service;


import com.example.publicwifisearch.domain.History;
import com.example.publicwifisearch.dto.LocationDTO;
import com.example.publicwifisearch.repository.HistoryRepository;

import java.util.List;

public class HistoryService {
    private static HistoryRepository historyRepository = new HistoryRepository();

    public List<History> findLatest20Histories() {
        return historyRepository.findAll();
    }

    public void saveHistory(LocationDTO loc) {
        historyRepository.save(loc);
    }

    public void deleteHistoryById(String id) {
        historyRepository.deleteById(Long.parseLong(id));
    }
}
