package com.sh.chicken.admin.application;

import com.sh.chicken.admin.controller.dto.ChickenBrandUploadDto;
import com.sh.chicken.admin.repository.ChickenBrandUploadRepository;
import com.sh.chicken.domain.chickenbrand.domain.ChickenBrand;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class ChickenBrandUploadService {

    private final ChickenBrandUploadRepository chickenBrandUploadRepository;

    /**
     * 치킨 브랜드 업로드
     */
    public void saveBrand(List<ChickenBrandUploadDto> dataList) {

        for (ChickenBrandUploadDto chickenExcelUploadDto : dataList) {
            ChickenBrand chickenBrand = ChickenBrand.createChickenBrand(chickenExcelUploadDto);
            chickenBrandUploadRepository.save(chickenBrand);
        }

    }
}
