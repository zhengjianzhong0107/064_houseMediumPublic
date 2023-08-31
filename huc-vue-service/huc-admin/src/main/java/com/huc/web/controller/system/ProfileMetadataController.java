package com.huc.web.controller.system;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.huc.common.core.domain.AjaxResult;
import com.huc.system.domain.ProfileMetadata;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

@Slf4j
@RequestMapping("/profilemeta")
@RestController
public class ProfileMetadataController {
    @Autowired
    private ProfileMetadata profileMetadata;

    private final Supplier<Object> locationSupplier =
            Suppliers.memoize(this::readLocationJSON);

    @GetMapping("/location")
    public AjaxResult locationMetadata() {
        final Object jsonObject = locationSupplier.get();
        if (jsonObject == null) {
            return AjaxResult.error("read location fail");
        }
        return AjaxResult.success(jsonObject);
    }

    private Object readLocationJSON() {
        try {
            final InputStream inputStream = new ClassPathResource(profileMetadata.getLocationPath())
                    .getInputStream();
            return new Gson().fromJson(new InputStreamReader(inputStream), List.class);
        } catch (Exception e) {
            log.error("readLocationJSON fail ", e);
            return null;
        }
    }
}
