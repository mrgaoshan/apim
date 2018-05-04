package com.example.apmi.controller;

import com.example.apmi.domain.VesselDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by kasimodo on 2018-05-02.
 */
@RestController
@Api(description = "Vessel Controller")
public class VesselController {

    @RequestMapping(value = "/searchVessel", method = RequestMethod.GET)
    @ApiOperation(value = "Search vessel ")
    public List<VesselDTO> selectBkgByDuration() {

        List<VesselDTO> list = new ArrayList();
        VesselDTO v1 = new VesselDTO();
        v1.setVesselName("M3319");
        v1.setImo("91318451");
        v1.setCallSign("YD6651");
        v1.setGt("1216");
        v1.setVesselType("BARGE");
        v1.setFlag("SINGAPORE");
        v1.setLicenceNo("SC220");

        VesselDTO v2 = new VesselDTO();
        v2.setVesselName("M3287");
        v2.setImo("9584224");
        v2.setCallSign("SH6651");
        v2.setGt("200");
        v2.setVesselType("BARGE");
        v2.setFlag("SINGAPORE");
        v2.setLicenceNo("SC855");

        VesselDTO v3 = new VesselDTO();
        v3.setVesselName("F3321");
        v3.setImo("2541");
        v3.setCallSign("HJ5523");
        v3.setGt("3210");
        v3.setVesselType("BARGE");
        v3.setFlag("SINGAPORE");
        v3.setLicenceNo("SC550");

        VesselDTO v4 = new VesselDTO();
        v4.setVesselName("HGA220");
        v4.setImo("254751");
        v4.setCallSign("JI4421");
        v4.setGt("1600");
        v4.setVesselType("BARGE");
        v4.setFlag("SINGAPORE");
        v4.setLicenceNo("SC574");

        VesselDTO v5 = new VesselDTO();
        v5.setVesselName("YH220");
        v5.setImo("24500");
        v5.setCallSign("FF554");
        v5.setGt("3101");
        v5.setVesselType("BARGE");
        v5.setFlag("SINGAPORE");
        v5.setLicenceNo("SC445");

        VesselDTO v6 = new VesselDTO();
        v6.setVesselName("AER543");
        v6.setImo("24521");
        v6.setCallSign("BH444");
        v6.setGt("998");
        v6.setVesselType("BARGE");
        v6.setFlag("SINGAPORE");
        v6.setLicenceNo("SC582");

        VesselDTO v7 = new VesselDTO();
        v7.setVesselName("KLK77H");
        v7.setImo("25412");
        v7.setCallSign("HJ551");
        v7.setGt("860");
        v7.setVesselType("BARGE");
        v7.setFlag("SINGAPORE");
        v7.setLicenceNo("SC443");

        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        list.add(v5);
        list.add(v6);
        list.add(v7);
        return list;
    }
}
