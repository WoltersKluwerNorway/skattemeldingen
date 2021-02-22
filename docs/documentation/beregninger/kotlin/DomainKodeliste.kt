@file:Suppress("ClassName")package no.skatteetaten.fastsetting.formueinntekt.skattemelding.naering



object resultatOgBalansekonti_2020 : KodeverdierHovedkodeliste() {
    object balanseverdiForAnleggsmiddel : KodeverdierUnderkodeliste() {
        val kode_1000 = KodeVerdi("1000", "Forskning og utvikling", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_1020 = KodeVerdi("1020", "Konsesjoner, patenter, lisenser o.l. rettigheter (immaterielle eiendeler)", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1070 = KodeVerdi("1070", "Utsatt skattefordel", Kodetillegg(true, listOf("2"), false))
        val kode_1080 = KodeVerdi("1080", "Goodwill", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_1105 = KodeVerdi("1105", "Forretningsbygg", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1115 = KodeVerdi("1115", "Bygg, anlegg, hotell o.l.", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1117 = KodeVerdi("1117", "Elektroteknisk utrustning i kraftforetak mv.", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1120 = KodeVerdi("1120", "Fast teknisk installasjon i byggninger", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1130 = KodeVerdi("1130", "Anlegg, maskiner under utførelse", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1150 = KodeVerdi("1150", "Tomter og andre grunnarealer", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1160 = KodeVerdi("1160", "Bolig inkl. boligtomter, hytter mv.", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1180 = KodeVerdi("1180", "Investeringseiendommer", Kodetillegg(true, listOf("2"), true))
        val kode_1205 = KodeVerdi("1205", "Personbiler, maskiner, inventar", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1221 = KodeVerdi("1221", "Skip, rigger mv.", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1225 = KodeVerdi("1225", "Fly, helikopter mv.", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1238 = KodeVerdi("1238", "Vare- og lastebiler, busser mv.", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1239 = KodeVerdi("1239", "Varebiler med nullutslipp", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1280 = KodeVerdi("1280", "Kontormaskiner o.l.", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1290 = KodeVerdi("1290", "Andre driftsmidler", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1296 = KodeVerdi("1296", "Negativ gevinst- og tapskonto", Kodetillegg(true, listOf("1", "5"), false))
        val kode_1298 = KodeVerdi("1298", "Negativ tømmerkonto", Kodetillegg(true, listOf("1", "5"), false))
        val kode_1312 = KodeVerdi("1312", "Investeringer i datter- og konsernselskap med deltakerfastsetting", Kodetillegg(true, listOf("2"), false))
        val kode_1313 = KodeVerdi("1313", "Investeringer i andre datter- og konsernselskap", Kodetillegg(true, listOf("2"), false))
        val kode_1320 = KodeVerdi("1320", "Lån til foretak i samme konsern", Kodetillegg(true, listOf("2"), false))
        val kode_1331 = KodeVerdi("1331", "Investeringer i tilknyttede selskap med deltakerfastsetting", Kodetillegg(true, listOf("2"), false))
        val kode_1332 = KodeVerdi("1332", "Investeringer i andre tilknyttede selskap", Kodetillegg(true, listOf("2"), false))
        val kode_1340 = KodeVerdi("1340", "Lån til tilknyttet selskap og felles kontrollert virksomhet", Kodetillegg(true, listOf("2"), false))
        val kode_1350 = KodeVerdi("1350", "Investeringer i aksjer, andeler og verdipapirfondsandeler", Kodetillegg(true, listOf("2", "5"), true))
        val kode_1360 = KodeVerdi("1360", "Obligasjoner", Kodetillegg(true, listOf("2", "5"), false))
        val kode_1370 = KodeVerdi("1370", "Fordringer på personlige eiere, styremedl. o.l.", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_1380 = KodeVerdi("1380", "Fordringer på ansatte", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_1390 = KodeVerdi("1390", "Andre langsiktige fordringer", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_1395 = KodeVerdi("1395", "Netto pensjonsmidler", Kodetillegg(true, listOf("2"), false))
    }
    object balanseverdiForOmloepsmiddel : KodeverdierUnderkodeliste() {
        val kode_1400 = KodeVerdi("1400", "Varelager", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_1490 = KodeVerdi("1490", "Biologiske eiendeler", Kodetillegg(true, listOf("2"), false))
        val kode_1500 = KodeVerdi("1500", "Kundefordringer", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_1501 = KodeVerdi("1501", "Kunderfordringer på selskap i samme konsern", Kodetillegg(true, listOf("2"), false))
        val kode_1530 = KodeVerdi("1530", "Opptjente ikke fakturerte driftsinntekter", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_1560 = KodeVerdi("1560", "Andre fordringer på selskap i samme konsern", Kodetillegg(true, listOf("2"), false))
        val kode_1565 = KodeVerdi("1565", "Kortsiktige fordringer mot personlig eier, styremedlem o.l.", Kodetillegg(true, listOf("2", "5"), false))
        val kode_1570 = KodeVerdi("1570", "Andre kortsiktige fordringer", Kodetillegg(true, listOf("2", "5"), false))
        val kode_1780 = KodeVerdi("1780", "Krav på innbetalt selskapskapital", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_1800 = KodeVerdi("1800", "Ikke-markedsbaserte aksjer og verdipapirfondsandeler", Kodetillegg(true, listOf("2"), true))
        val kode_1810 = KodeVerdi("1810", "Markedsbaserte aksjer og verdipapirfondsandeler", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1830 = KodeVerdi("1830", "Markedsbaserte obligasjoner, sertifikater mv.", Kodetillegg(true, listOf("1", "2", "5"), true))
        val kode_1840 = KodeVerdi("1840", "Andre obligasjoner og sertifikater", Kodetillegg(true, listOf("2"), false))
        val kode_1880 = KodeVerdi("1880", "Andre finansielle instrumenter", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_1895 = KodeVerdi("1895", "Andel i selskap med deltakerfastsetting", Kodetillegg(true, listOf("1", "5"), true))
        val kode_1900 = KodeVerdi("1900", "Kontantbeholdning", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_1920 = KodeVerdi("1920", "Bankinnskudd", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_1950 = KodeVerdi("1950", "Bankinnskudd for skattetrekk", Kodetillegg(true, listOf("1", "5"), false))
    }
    object langsiktigGjeld : KodeverdierUnderkodeliste() {
        val kode_2100 = KodeVerdi("2100", "Pensjonsforpliktelser", Kodetillegg(true, listOf("2"), false))
        val kode_2120 = KodeVerdi("2120", "Utsatt skatt", Kodetillegg(true, listOf("2"), false))
        val kode_2130 = KodeVerdi("2130", "Derivater - langsiktige", Kodetillegg(true, listOf("2"), false))
        val kode_2160 = KodeVerdi("2160", "Uopptjent inntekt - langsiktig", Kodetillegg(true, listOf("2"), false))
        val kode_2180 = KodeVerdi("2180", "Avsetninger for forpliktelser - langsiktige", Kodetillegg(true, listOf("2"), false))
        val kode_2200 = KodeVerdi("2200", "Konvertible lån - langsiktige", Kodetillegg(true, listOf("2"), false))
        val kode_2210 = KodeVerdi("2210", "Obligasjonslån - langsiktige", Kodetillegg(true, listOf("2"), false))
        val kode_2220 = KodeVerdi("2220", "Gjeld til kredittinstitusjoner - langsiktige", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_2250 = KodeVerdi("2250", "Gjeld til ansatte og personlige eiere - langsiktig", Kodetillegg(true, listOf("2", "5"), false))
        val kode_2260 = KodeVerdi("2260", "Gjeld til selskap i samme konsern - langsiktig", Kodetillegg(true, listOf("2"), false))
        val kode_2280 = KodeVerdi("2280", "Stille interessentinnskudd og ansvarlig lånekapital", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_2290 = KodeVerdi("2290", "Annen langsiktig gjeld", Kodetillegg(true, listOf("1", "2", "5"), false))
    }
    object kortsiktigGjeld : KodeverdierUnderkodeliste() {
        val kode_2310 = KodeVerdi("2310", "Konvertible lån - kortsiktige", Kodetillegg(true, listOf("2"), false))
        val kode_2320 = KodeVerdi("2320", "Obligasjonslån - kortsiktige", Kodetillegg(true, listOf("2"), false))
        val kode_2330 = KodeVerdi("2330", "Derivater - kortsiktige", Kodetillegg(true, listOf("2"), false))
        val kode_2380 = KodeVerdi("2380", "Gjeld til kredittinstitusjoner - kortsiktige", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_2400 = KodeVerdi("2400", "Leverandørgjeld", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_2460 = KodeVerdi("2460", "Leverandørgjeld til selskap i samme konsern", Kodetillegg(true, listOf("2"), false))
        val kode_2500 = KodeVerdi("2500", "Betalbar skatt, ikke fastsatt", Kodetillegg(true, listOf("2"), false))
        val kode_2510 = KodeVerdi("2510", "Betalbar skatt, fastsatt", Kodetillegg(true, listOf("2"), false))
        val kode_2600 = KodeVerdi("2600", "Skattetrekk og andre trekk", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_2740 = KodeVerdi("2740", "Skyldig merverdiavgift", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_2770 = KodeVerdi("2770", "Skyldig arbeidsgiveravgift", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_2790 = KodeVerdi("2790", "Andre offentlige avgifter", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_2800 = KodeVerdi("2800", "Avsatt utbytte", Kodetillegg(true, listOf("1", "5"), false))
        val kode_2900 = KodeVerdi("2900", "Forskudd fra kunder", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_2910 = KodeVerdi("2910", "Gjeld til ansatte og personlige eiere - kortsiktig", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_2920 = KodeVerdi("2920", "Gjeld til selskap i samme konsern - kortsiktig", Kodetillegg(true, listOf("2"), false))
        val kode_2949 = KodeVerdi("2949", "Lønn, feriepenger o.l.", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_2950 = KodeVerdi("2950", "Påløpt rente", Kodetillegg(true, listOf("1", "5"), false))
        val kode_2970 = KodeVerdi("2970", "Uopptjent inntekt - kortsiktig", Kodetillegg(true, listOf("2"), false))
        val kode_2980 = KodeVerdi("2980", "Avsetninger for forpliktelser - kortsiktig", Kodetillegg(true, listOf("2"), false))
        val kode_2990 = KodeVerdi("2990", "Annen kortsiktig gjeld", Kodetillegg(true, listOf("1", "2", "5"), false))
    }
    object egenkapital : KodeverdierUnderkodeliste() {
        val kode_2000 = KodeVerdi("2000", "Aksjekapital/Egenkapital andre foretak", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_2010 = KodeVerdi("2010", "Egne aksjer", Kodetillegg(true, listOf("2"), false))
        val kode_2020 = KodeVerdi("2020", "Overkurs", Kodetillegg(true, listOf("2"), false))
        val kode_2030 = KodeVerdi("2030", "Annen innskutt egenkapital", Kodetillegg(true, listOf("2"), false))
        val kode_2043 = KodeVerdi("2043", "Fond for vurderingsforskjeller", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_2045 = KodeVerdi("2045", "Fond for urealiserte gevinster", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_2055 = KodeVerdi("2055", "Avsatt utbytte - IFRS", Kodetillegg(true, listOf("1", "2"), false))
        val kode_2080 = KodeVerdi("2080", "Udekket tap", Kodetillegg(true, listOf("1", "2"), false))
        val kode_2015 = KodeVerdi("2015", "Felleseid andelskapital", Kodetillegg(true, listOf("1"), false))
        val kode_2050 = KodeVerdi("2050", "Annen egenkapital", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_2095 = KodeVerdi("2095", "Negativ saldo", Kodetillegg(true, listOf("1", "5"), false))
        val kode_2096 = KodeVerdi("2096", "Positiv gevinst og tapskonto", Kodetillegg(true, listOf("1", "5"), false))
        val kode_2097 = KodeVerdi("2097", "Betinget avsatt gevinst", Kodetillegg(true, listOf("1", "5"), false))
        val kode_2098 = KodeVerdi("2098", "Positiv tømmerkonto", Kodetillegg(true, listOf("1", "5"), false))
    }
    object salgsinntekt : KodeverdierUnderkodeliste() {
        val kode_3000 = KodeVerdi("3000", "Salgsinntekt og uttak, avgiftspliktig", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_3100 = KodeVerdi("3100", "Salgsinntekt og uttak, avgiftsfritt", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_3200 = KodeVerdi("3200", "Salgsinntekt og uttak, utenfor merverdiavgiftsloven", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_3300 = KodeVerdi("3300", "Spesielle offentlige avgifter vedrørende salg", Kodetillegg(true, listOf("1", "2", "5"), false))
    }
    object annenDriftsinntekt : KodeverdierUnderkodeliste() {
        val kode_3400 = KodeVerdi("3400", "Offentlig tilskudd/refusjon", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_3410 = KodeVerdi("3410", "Tilskudd kompensasjonsordning", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_3500 = KodeVerdi("3500", "Endring uopptjent inntekt", Kodetillegg(true, listOf("2"), false))
        val kode_3600 = KodeVerdi("3600", "Leieinntekt fast eiendom", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_3650 = KodeVerdi("3650", "Leieinntekt av rettigheter fast eiendom", Kodetillegg(true, listOf("1"), false))
        val kode_3695 = KodeVerdi("3695", "Annen leieinntekt", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_3700 = KodeVerdi("3700", "Provisjonsinntekt", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_3710 = KodeVerdi("3710", "Lisens-, patent- og royaltyinntekt", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_3850 = KodeVerdi("3850", "Verdiendringer av investeringseiendommer", Kodetillegg(true, listOf("2"), false))
        val kode_3870 = KodeVerdi("3870", "Verdiendringer biologiske eiendeler", Kodetillegg(true, listOf("2"), false))
        val kode_3880 = KodeVerdi("3880", "Gevinst ved avgang av immaterielle eiendeler og varige driftsmidler", Kodetillegg(true, listOf("2"), false))
        val kode_3885 = KodeVerdi("3885", "Gevinst ved avgang av finansielle anleggsmidler", Kodetillegg(true, listOf("2"), false))
        val kode_3890 = KodeVerdi("3890", "Inntektsføring fra positiv gevinst-/tapskonto", Kodetillegg(true, listOf("1", "5"), false))
        val kode_3895 = KodeVerdi("3895", "Inntektsføring fra negativ saldo", Kodetillegg(true, listOf("1", "5"), false))
        val kode_3900 = KodeVerdi("3900", "Annen driftsrelatert inntekt", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_3910 = KodeVerdi("3910", "Inntektsføring fra tømmerkonto", Kodetillegg(true, listOf("1", "5"), false))
    }
    object varekostnad : KodeverdierUnderkodeliste() {
        val kode_4005 = KodeVerdi("4005", "Varekostnad", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_4295 = KodeVerdi("4295", "Beholdningsendring av varer under tilvirkning og ferdig tilv. Varer", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_4500 = KodeVerdi("4500", "Fremmedytelse og underentreprise", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_4995 = KodeVerdi("4995", "Beholdningsendring av egentilvirkede anleggsmidler", Kodetillegg(true, listOf("1", "2", "5"), false))
    }
    object loennskostnad : KodeverdierUnderkodeliste() {
        val kode_5000 = KodeVerdi("5000", "Kostnadsført lønn, feriepenger mv.", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_5300 = KodeVerdi("5300", "Kostnadsført annen opplysningspliktig godtgjørelse", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_5400 = KodeVerdi("5400", "Kostnadsført arbeidsgiveravgift", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_5420 = KodeVerdi("5420", "Opplysningspliktig pensjonskostnad", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_5600 = KodeVerdi("5600", "Arbeidsgodtgjørelse til eiere i ANS mv.", Kodetillegg(true, listOf("2", "5"), false))
        val kode_5900 = KodeVerdi("5900", "Annen personalkostnad", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_5950 = KodeVerdi("5950", "Kostnad til egen pensjonsordning", Kodetillegg(true, listOf("1", "5"), false))
    }
    object annenDriftskostnad : KodeverdierUnderkodeliste() {
        val kode_6000 = KodeVerdi("6000", "Avskrivning på varige driftsmidler og immaterielle eiendeler", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_6050 = KodeVerdi("6050", "Nedskrivning på varige driftsmidler og immaterielle eiendeler", Kodetillegg(true, listOf("2"), false))
        val kode_6100 = KodeVerdi("6100", "Frakt og transportkostnad vedrørende salg", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_6200 = KodeVerdi("6200", "Kostnadsført energi, brensel mv. vedrørende produksjon", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_6300 = KodeVerdi("6300", "Kostnadsført leie lokale", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_6340 = KodeVerdi("6340", "Kostnadsført lys, varme", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_6395 = KodeVerdi("6395", "Kostnadsført renovasjon, vann, avløp, renhold mv.", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_6400 = KodeVerdi("6400", "Kostnadsført leie maskiner, inventar, transportmidler o.l.", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_6440 = KodeVerdi("6440", "Kostnadsført leasingleie av bil", Kodetillegg(true, listOf("1"), false))
        val kode_6500 = KodeVerdi("6500", "Kostnadsført verktøy, inventar mv. som ikke skal aktiveres", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_6600 = KodeVerdi("6600", "Kostnadsført reparasjon og vedlikehold av bygning", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_6695 = KodeVerdi("6695", "Kostnadsført reparasjon og annet vedlikehold", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_6700 = KodeVerdi("6700", "Kostnadsført fremmed tjeneste", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_6995 = KodeVerdi("6995", "Kostnadsført elektronisk kommunikasjon, porto mv.", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_6998 = KodeVerdi("6998", "Privat bruk av elektronisk kommunikasjon", Kodetillegg(true, listOf("1", "5"), false))
        val kode_7000 = KodeVerdi("7000", "Kostnadsført drivstoff transportmidler", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_7020 = KodeVerdi("7020", "Kostnadsført vedlikehold mv. transportmidler", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_7040 = KodeVerdi("7040", "Kostnadsført forsikring og avgifter på transportmidler", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_7080 = KodeVerdi("7080", "Bilkostnader, bruk av privat bil i næring", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_7099 = KodeVerdi("7099", "Privat bruk av yrkesbil", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_7155 = KodeVerdi("7155", "Kostnadsført reise-, diett- og bilgodtgjørelse (opplysningspliktig)", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_7165 = KodeVerdi("7165", "Reise- og diettkostnader (ikke opplysningspliktig)", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_7295 = KodeVerdi("7295", "Provisjonskostnad", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_7330 = KodeVerdi("7330", "Salgs- og reklamekostnader", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_7350 = KodeVerdi("7350", "Representasjonskostnader, fradragsberettiget", Kodetillegg(true, listOf("1", "5"), false))
        val kode_7370 = KodeVerdi("7370", "Representasjonskostnader", Kodetillegg(true, listOf("2"), false))
        val kode_7400 = KodeVerdi("7400", "Kostnadsført kontingenter, fradragsberettiget", Kodetillegg(true, listOf("1", "5"), false))
        val kode_7490 = KodeVerdi("7490", "Kostnadsført kontingenter", Kodetillegg(true, listOf("2"), false))
        val kode_7420 = KodeVerdi("7420", "Kostnadsført gaver, fradragsberettiget", Kodetillegg(true, listOf("1", "5"), false))
        val kode_7440 = KodeVerdi("7440", "Kostnadsført gaver", Kodetillegg(true, listOf("2"), false))
        val kode_7500 = KodeVerdi("7500", "Kostnadsført forsikringspremie", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_7565 = KodeVerdi("7565", "Garanti- og servicekostnad", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_7600 = KodeVerdi("7600", "Lisens, patent og royaltykostnad", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_7700 = KodeVerdi("7700", "Annen kostnad", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_7830 = KodeVerdi("7830", "Tap på fordringer", Kodetillegg(true, listOf("2"), false))
        val kode_7860 = KodeVerdi("7860", "Tap på kontrakter", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_7880 = KodeVerdi("7880", "Tap ved avgang av immaterielle eiendeler og varige driftsmidler", Kodetillegg(true, listOf("2"), false))
        val kode_7885 = KodeVerdi("7885", "Tap ved avgang av finansielle anleggsmidler", Kodetillegg(true, listOf("2"), false))
        val kode_7890 = KodeVerdi("7890", "Fradragsføring av negativ gevinst- og tapskonto", Kodetillegg(true, listOf("1", "5"), false))
        val kode_7895 = KodeVerdi("7895", "Skattemessig tap på fordringer", Kodetillegg(true, listOf("1", "5"), false))
        val kode_7897 = KodeVerdi("7897", "Endring i skattemessig tap på fordringer", Kodetillegg(true, listOf("1", "5"), false))
        val kode_7910 = KodeVerdi("7910", "Overført til tømmerkonto av årets overskudd/underskudd", Kodetillegg(true, listOf("1", "5"), false))
        val kode_7911 = KodeVerdi("7911", "Kostnadsføring tømmerkonto", Kodetillegg(true, listOf("1", "5"), false))
    }
    object finansinntekt : KodeverdierUnderkodeliste() {
        val kode_8005 = KodeVerdi("8005", "Netto positiv resultatandel vedrørende investering i DS, TS og FKV", Kodetillegg(true, listOf("2", "5"), false))
        val kode_8030 = KodeVerdi("8030", "Renteinntekt fra foretak i samme konsern", Kodetillegg(true, listOf("2"), false))
        val kode_8050 = KodeVerdi("8050", "Annen renteinntekt", Kodetillegg(true, listOf("2", "5"), false))
        val kode_8060 = KodeVerdi("8060", "Vautagevinst (agio)", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_8074 = KodeVerdi("8074", "Gevinst ved realisasjon av aksjer, egenkapitalbevis og fondsandeler", Kodetillegg(true, listOf("2", "5"), false))
        val kode_8079 = KodeVerdi("8079", "Annen finansinntekt", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_8080 = KodeVerdi("8080", "Verdiøkning av finansielle instrumenter vurdert til virkelig verdi", Kodetillegg(true, listOf("2"), false))
        val kode_8090 = KodeVerdi("8090", "Inntekt av andre investeringer/utbytte", Kodetillegg(true, listOf("2", "5"), false))
        val kode_8091 = KodeVerdi("8091", "3 % av netto skattefrie inntekter etter fritaksmetoden og 3 % av utdeling fra selskap med deltakerfastsetting til selskapsdeltaker", Kodetillegg(true, listOf("5"), false))
    }
    object finanskostnad : KodeverdierUnderkodeliste() {
        val kode_8006 = KodeVerdi("8006", "Netto negativ resultatandel vedrørende investering i DS, TS og FKV", Kodetillegg(true, listOf("2", "5"), false))
        val kode_8100 = KodeVerdi("8100", "Verdireduksjon av finansielle instrumenter vurdert til virkelig verdi", Kodetillegg(true, listOf("2"), false))
        val kode_8115 = KodeVerdi("8115", "Nedskriving av finansielle eiendeler", Kodetillegg(true, listOf("2"), false))
        val kode_8130 = KodeVerdi("8130", "Rentekostnad til foretak i samme konsern", Kodetillegg(true, listOf("2"), false))
        val kode_8150 = KodeVerdi("8150", "Annen rentekostnad", Kodetillegg(true, listOf("2", "5"), false))
        val kode_8160 = KodeVerdi("8160", "Valutatap (disagio)", Kodetillegg(true, listOf("1", "2", "5"), false))
        val kode_8174 = KodeVerdi("8174", "Tap ved realisasjon av aksjer, egenkapitalbevis og fondsandeler", Kodetillegg(true, listOf("2", "5"), false))
        val kode_8179 = KodeVerdi("8179", "Annen finanskostnad", Kodetillegg(true, listOf("1", "2", "5"), false))
    }
    object skattekostnad : KodeverdierUnderkodeliste() {
        val kode_8300 = KodeVerdi("8300", "Betalbar skatt på ordinært resultat", Kodetillegg(true, listOf("2"), false))
        val kode_8320 = KodeVerdi("8320", "Endring utsatt skatt/skattefordel på ordinært resultat", Kodetillegg(true, listOf("2"), false))
        val kode_8600 = KodeVerdi("8600", "Betalbar skatt på resultat etter ekstraordinære poster", Kodetillegg(true, listOf("2"), false))
        val kode_8620 = KodeVerdi("8620", "Endring utsatt skatt/skattefordel på resultat etter ekstraordinære poster", Kodetillegg(true, listOf("2"), false))
    }
    object resultatkomponentForIFRSForetak : KodeverdierUnderkodeliste() {
        val kode_8901 = KodeVerdi("8901", "Endring i verdireguleringsreserve - eiendom, anlegg og utstyr", Kodetillegg(true, listOf("2"), false))
        val kode_8902 = KodeVerdi("8902", "Endring i verdireguleringsreserve - immaterielle eiendeler", Kodetillegg(true, listOf("2"), false))
        val kode_8903 = KodeVerdi("8903", "Aktuariell gevinst og tap på ytelsesbaserte pensjonsordninger - ytelser til ansatte", Kodetillegg(true, listOf("2"), false))
        val kode_8904 = KodeVerdi("8904", "Valutakursdifferanse fra utenlandsk virksomhet", Kodetillegg(true, listOf("2"), false))
        val kode_8905 = KodeVerdi("8905", "Gevinst og tap på finansielle eiendeler tilgjengelige for salg", Kodetillegg(true, listOf("2"), false))
        val kode_8906 = KodeVerdi("8906", "Effektiv andel av gevinst og tap på sikringsinstrumenter i kontantstrømsikring", Kodetillegg(true, listOf("2"), false))
        val kode_8907 = KodeVerdi("8907", "Andel av annen resultatkomponent ved anvendelse av egenkapitalmetoden", Kodetillegg(true, listOf("2"), false))
        val kode_8908 = KodeVerdi("8908", "Inntekt eller kostnad vedrørende anleggsmidler eller avhendingsgrupper klassifisert som holdt for salg", Kodetillegg(true, listOf("2"), false))
        val kode_8909 = KodeVerdi("8909", "Skatt på andre resultatkomponenter", Kodetillegg(true, listOf("2"), false))
    }
}
