package com.nex1.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nex1.app.entity.Notice;
import com.nex1.app.repository.NoticeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NoticeService {
    private final NoticeRepository noticeRepository;

    public List<Notice> getAll() {
        return noticeRepository.findByOrderByResdateDesc();
    }

    public Notice save(Notice notice) {
        return noticeRepository.save(notice);
    }

    public Optional<Notice> getById(Long no) {
        return noticeRepository.findById(no);
    }
    
    public Notice getNotice(Long no) {
        return noticeRepository.findById(no).orElse(null);
    }

    public void delete(Long no) {
        noticeRepository.deleteById(no);
    }
}

