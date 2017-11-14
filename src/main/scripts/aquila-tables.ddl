
    create table additional_party (
       additional_party_id bigint not null,
        explanation_of_involvement varchar(255),
        party_name varchar(255),
        supervisor varchar(255),
        intake_intake_form_id bigint,
        primary key (additional_party_id)
    ) type=MyISAM;

    create table approval_colleges (
       approval_college_id bigint not null,
        fringe_cost integer,
        meeting_expenses integer,
        personnel_cost integer,
        total_cost integer,
        form_approval_form_id bigint,
        primary key (approval_college_id)
    ) type=MyISAM;

    create table approval_form (
       approval_form_id bigint not null,
        uas_exec_director_signature tinyblob,
        uas_exec_director_signature_date datetime,
        additional_space bit,
        additional_space_approved varchar(255),
        avp_signature tinyblob,
        avp_signature_date datetime,
        biological_hazards bit,
        biological_hazards_approved varchar(255),
        csula_cost_sharing integer,
        cfda_number integer,
        chair_signature tinyblob,
        chair_signature_date datetime,
        chief_financial_officer_signature tinyblob,
        chief_financial_officer_signature_date datetime,
        college tinyblob,
        college_dean_signature tinyblob,
        college_signature_date datetime,
        computer_equipment bit,
        computer_equipment_approved varchar(255),
        conflict_of_interest_statement bit,
        conflict_of_interest_statement_approved varchar(255),
        cost_sharing_required bit,
        deadline_date datetime,
        college_dean_designee tinyblob,
        college_dean_designee_signature datetime,
        dean_signature tinyblob,
        dean_signature_date datetime,
        department tinyblob,
        dep_chair_signature tinyblob,
        dep_chair_signature_date datetime,
        director_signature tinyblob,
        director_signature_date datetime,
        email varchar(255),
        human_subjects bit,
        human_subjects_approved varchar(255),
        pi_name tinyblob,
        pi_signature tinyblob,
        pi_signature_date datetime,
        prepared_by varchar(255),
        prepared_date datetime,
        project_title varchar(255),
        proposal_code float,
        proposal_personnel_signature tinyblob,
        provost_vp_academic_affairs tinyblob,
        provost_vp_academic_affairs_signature datetime,
        project_purpose varchar(255),
        radiological_hazards bit,
        radiological_hazards_approved varchar(255),
        recombinant_dna bit,
        recombinant_dna_approved varchar(255),
        third_party_cost_share integer,
        total_csula_cost_sharing integer,
        total_of_college integer,
        total_proposal_cost_sharing integer,
        grant_contract_type varchar(255),
        proposal_type varchar(255),
        uas_project_id varchar(255),
        unrecovered_fa_cost_sharing integer,
        unrecovered_famtdc double precision,
        university_cost_sharing bit,
        vertebrate_animal bit,
        vertebrate_animal_approved varchar(255),
        primary key (approval_form_id)
    ) type=MyISAM;

    create table ApprovalForm_coPis (
       ApprovalForm_approval_form_id bigint not null,
        co_pis varchar(255)
    ) type=MyISAM;

    create table ApprovalForm_internalNotes (
       ApprovalForm_approval_form_id bigint not null,
        internal_notes varchar(255)
    ) type=MyISAM;

    create table budget (
       budget_form_id bigint not null,
        date datetime,
        file_path varchar(255),
        file_name varchar(255),
        uploader varchar(255),
        file_type varchar(255),
        primary key (budget_form_id)
    ) type=MyISAM;

    create table chemicals (
       id bigint not null,
        amount varchar(255),
        chemical_name integer not null,
        primary key (id, chemical_name)
    ) type=MyISAM;

    create table co_pis (
       timeline_id bigint not null,
        user_id bigint not null
    ) type=MyISAM;

    create table colleges (
       college_id bigint not null,
        dean tinyblob,
        college_name varchar(255),
        primary key (college_id)
    ) type=MyISAM;

    create table conflict_of_interest_non_phs (
       conflict_of_interest_non_phs_id bigint not null,
        ari_date datetime,
        ari_official bit,
        amount_requested double precision,
        budget_period_end datetime,
        budget_period_start datetime,
        iRBACUCIBCNo bigint,
        key_personnel_date datetime,
        key_personnel_sign tinyblob,
        pi tinyblob,
        project_period_end datetime,
        project_period_start datetime,
        proposal_number bigint not null,
        proposal_title varchar(255),
        significat_fin_interest bit,
        sponsor varchar(255),
        sub_award bit,
        subaward_agency varchar(255),
        subaward_sponsor varchar(255),
        primary key (conflict_of_interest_non_phs_id)
    ) type=MyISAM;

    create table conflict_of_interest_phs (
       conflict_of_interest_phs_id bigint not null,
        ari_date datetime,
        ari_official bit,
        amount_requested double precision,
        budget_period_end datetime,
        budget_period_start datetime,
        irb_iacuc_ibc_no bigint,
        key_personnel_date datetime,
        key_personnel_sign tinyblob,
        pi tinyblob,
        project_period_end datetime,
        project_period_start datetime,
        proposal_number bigint,
        proposal_title varchar(255),
        siginificant_financial_interest bit,
        conflict_of_interest_kp_phs bigint not null,
        iRBACUCIBCNo bigint,
        significant_fin_interest bit,
        primary key (conflict_of_interest_kp_phs)
    ) type=MyISAM;

    create table conflict_of_interest_pi_non_phs (
       conflict_of_interest_pi_non_phs_id bigint not null,
        ari_date datetime,
        ari_official varchar(255),
        ari_official_approved bit,
        amount_requested double precision,
        budget_period_end datetime,
        budget_period_start datetime,
        disclosure_reason varchar(255),
        irb_iacuc_ibc_no bigint,
        other_personnel_contribution bit,
        pi_name tinyblob,
        pi_signature tinyblob,
        project_period_end datetime,
        project_period_start datetime,
        proposal_title varchar(255),
        signature_date datetime,
        significant_financial_interest bit,
        subaward_with_federal_agency_pass_through varchar(255),
        primary key (conflict_of_interest_pi_non_phs_id)
    ) type=MyISAM;

    create table ConflictOfInterestKPNonPHS_disclosureReasons (
       ConflictOfInterestKPNonPHS_conflict_of_interest_non_phs_id bigint not null,
        previous_info varchar(255),
        reasons bit not null,
        primary key (ConflictOfInterestKPNonPHS_conflict_of_interest_non_phs_id, reasons)
    ) type=MyISAM;

    create table ConflictOfInterestKPPHS_disclosureReasons (
       ConflictOfInterestKPPHS_conflict_of_interest_kp_phs bigint not null,
        previous_info varchar(255),
        reasons bit not null,
        primary key (ConflictOfInterestKPPHS_conflict_of_interest_kp_phs, reasons)
    ) type=MyISAM;

    create table ConflictOfInterestKPPHS_sponsor (
       ConflictOfInterestKPPHS_conflict_of_interest_kp_phs bigint not null,
        sponsor_name varchar(255),
        sponsor_type bit not null,
        primary key (ConflictOfInterestKPPHS_conflict_of_interest_kp_phs, sponsor_type)
    ) type=MyISAM;

    create table ConflictOfInterestPHS_disclosureReasons (
       ConflictOfInterestPHS_conflict_of_interest_phs_id bigint not null,
        previous_info varchar(255),
        reasons bit not null,
        primary key (ConflictOfInterestPHS_conflict_of_interest_phs_id, reasons)
    ) type=MyISAM;

    create table ConflictOfInterestPHS_sponsor (
       ConflictOfInterestPHS_conflict_of_interest_phs_id bigint not null,
        is_sponsor varchar(255),
        sponsor_name bit not null,
        primary key (ConflictOfInterestPHS_conflict_of_interest_phs_id, sponsor_name)
    ) type=MyISAM;

    create table ConflictOfInterestPINonPHS_sigFinInterstDoesntInclude (
       ConflictOfInterestPINonPHS_conflict_of_interest_pi_non_phs_id bigint not null,
        sig_fin_int_doesnt_include bit
    ) type=MyISAM;

    create table ConflictOfInterestPINonPHS_sigFinInterstReason (
       ConflictOfInterestPINonPHS_conflict_of_interest_pi_non_phs_id bigint not null,
        significant_financial_interest_reason bit
    ) type=MyISAM;

    create table departments (
       department_id bigint not null,
        college tinyblob,
        department_chair tinyblob,
        department_name varchar(255) not null,
        primary key (department_id)
    ) type=MyISAM;

    create table EquipmentForm_listOfRequirements (
       EquipmentForm_equipment_form_id bigint not null,
        list_of_requirements varchar(255)
    ) type=MyISAM;

    create table EquipmentForm_typeOfEquipment (
       EquipmentForm_equipment_form_id bigint not null,
        type_of_equipment varchar(255)
    ) type=MyISAM;

    create table hazardous_substances (
       id bigint not null,
        substance_type varchar(255),
        name_of_agent varchar(255) not null,
        primary key (id, name_of_agent)
    ) type=MyISAM;

    create table hibernate_sequence (
       next_val bigint
    ) type=MyISAM;

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    create table intake_form (
       equipment_form_id bigint not null,
        FWR bit,
        air_chilled_water_flow bit,
        amps bit,
        building_location varchar(255),
        central_package_unit bit,
        circuit_breaker_specification bit,
        company_donating varchar(255),
        cost_share bit,
        dedicated_power bit,
        department varchar(255),
        director_of_facilities_services_signature tinyblob,
        director_of_facilities_services_signature_date datetime,
        director_of_research_development_signature tinyblob,
        director_of_research_development_signature_date datetime,
        donation bit,
        electrical_modification bit,
        extension bit,
        extension_value varchar(255),
        faculty_name varchar(255),
        flow_rate bit,
        fluid bit,
        fluid_temperature bit,
        fwr_paid_by varchar(255),
        hardware bit,
        hazardous_material bit,
        height integer,
        humidity_control bit,
        hvac bit,
        is_donation bit,
        length integer,
        license_requirements bit,
        maintenance bit,
        maintenance_requirement bit,
        motor_compressor_specification bit,
        new_equipment bit,
        noise_requirement bit,
        phase bit,
        plumbing bit,
        pressure bit,
        previous_use varchar(255),
        proposal_title varchar(255),
        pump_compressor_motor bit,
        radiation_use varchar(255),
        room_location varchar(255),
        size_of_equipment bit,
        space_modification_requirement bit,
        special_needs bit,
        special_needs_string varchar(255),
        special_work bit,
        supply_pressure bit,
        temperature bit,
        volts bit,
        width integer,
        intake_form_id bigint not null,
        agency_cost_rate_percentage integer,
        agency_cost_sharing bit,
        anticipate_stipend bit,
        archival_research bit,
        assistance_with_proposal_development bit,
        category_title varchar(255),
        coding_or_data_entry bit,
        college varchar(255),
        computers_requested integer,
        data_analysis bit,
        data_collection bit,
        duplication_of_final_document_package bit,
        end_date datetime,
        faculty_student_research_creative_activities bit,
        human_subject bit,
        lab_assistance bit,
        letter_of_support_assoc_vp_of_research bit,
        letter_of_support_president bit,
        letter_of_support_provost bit,
        literature_review bit,
        number_of_copies integer,
        number_of_graduate_students integer,
        number_of_undergrad_students integer,
        other_activities bit,
        pi_cost_sharing bit,
        presentation bit,
        pi varchar(255),
        project_title varchar(255),
        proposed_funding_amount integer,
        questionaire varchar(255),
        report_writing bit,
        start_date datetime,
        stipends varchar(255),
        students_in_research bit,
        summary varchar(255),
        technical_assistance bit,
        vertebrate_animals bit,
        primary key (intake_form_id)
    ) type=MyISAM;

    create table IntakeForm_otherActivitiesList (
       IntakeForm_intake_form_id bigint not null,
        other_activities varchar(255)
    ) type=MyISAM;

    create table orsp_due_dates (
       id bigint not null,
        orsp_date_due datetime,
        orsp varchar(255) not null,
        primary key (id, orsp)
    ) type=MyISAM;

    create table other_investigators (
       conflict_of_interest_pi_non_phs_id bigint not null,
        user_id bigint not null
    ) type=MyISAM;

    create table personnel (
       personnel_id bigint not null,
        employer varchar(255),
        name varchar(255),
        percent_of_time_proposed integer,
        position_title_on_grant varchar(255),
        units integer,
        intake_intake_form_id bigint,
        primary key (personnel_id)
    ) type=MyISAM;

    create table pi_due_dates (
       id bigint not null,
        pi_date_due datetime,
        principal_investigator varchar(255) not null,
        primary key (id, principal_investigator)
    ) type=MyISAM;

    create table project_location (
       project_location_id bigint not null,
        on_campus_space_or_on_campus_rental_needed bit,
        projected_percent_of_time_at_site integer,
        site_address varchar(255),
        site_name varchar(255),
        intake_intake_form_id bigint,
        primary key (project_location_id)
    ) type=MyISAM;

    create table proposal (
       proposal_id bigint not null,
        approval_form_approval_form_id bigint,
        budget_form_budget_form_id bigint,
        coi_kp_nonphs_conflict_of_interest_non_phs_id bigint,
        coi_kp_phs_conflict_of_interest_kp_phs bigint,
        coi_phs_conflict_of_interest_phs_id bigint,
        coi_pi_nonphs_conflict_of_interest_pi_non_phs_id bigint,
        equipment_form_equipment_form_id bigint,
        intake_form_intake_form_id bigint,
        timeline_timeline_id bigint,
        primary key (proposal_id)
    ) type=MyISAM;

    create table requested_equipment (
       id bigint not null,
        amount double precision,
        equipment_name varchar(255) not null,
        primary key (id, equipment_name)
    ) type=MyISAM;

    create table signature (
       signature_id bigint not null,
        name varchar(255),
        primary key (signature_id)
    ) type=MyISAM;

    create table space (
       space_id bigint not null,
        item varchar(255),
        source_of_funds varchar(255),
        type_of_space varchar(255),
        intake_intake_form_id bigint,
        primary key (space_id)
    ) type=MyISAM;

    create table subgrant_subcontract (
       subgrant_subcontract_id bigint not null,
        address varchar(255),
        contact_info varchar(255),
        contact_person varchar(255),
        institution_name varchar(255),
        proposed_funding_amount double precision,
        intake_intake_form_id bigint,
        primary key (subgrant_subcontract_id)
    ) type=MyISAM;

    create table timeline (
       timeline_id bigint not null,
        analyst_initial varchar(255),
        analyst_sign_date datetime,
        final_sign_date datetime,
        funding_agency varchar(255),
        pi tinyblob,
        pi_initial varchar(255),
        pi_sign_date datetime,
        proposal varchar(255),
        shipping_date datetime,
        shipping_deadline datetime,
        sponsor_date datetime,
        uas_date datetime,
        primary key (timeline_id)
    ) type=MyISAM;

    create table Timeline_addComments (
       Timeline_timeline_id bigint not null,
        add_comments varchar(255)
    ) type=MyISAM;

    create table users (
       user_id bigint not null,
        email varchar(255) not null,
        enabled bit not null,
        first_name varchar(255),
        hash varchar(255) not null,
        last_name varchar(255),
        username varchar(255) not null,
        coi_pi_nonphs_conflict_of_interest_pi_non_phs_id bigint,
        timeline_form_timeline_id bigint,
        primary key (user_id)
    ) type=MyISAM;

    alter table co_pis 
       add constraint UK_aggqgqigbcofv25d45pyt1gjr unique (user_id);

    alter table conflict_of_interest_non_phs 
       add constraint UK_8gwfqrom366hxntdc1407do6m unique (proposal_number);

    alter table departments 
       add constraint UK_qyf2ekbfpnddm6f3rkgt39i9o unique (department_name);

    alter table other_investigators 
       add constraint UK_aofegw22699sv3n7vfohrm7w1 unique (user_id);

    alter table users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

    alter table users 
       add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username);

    alter table additional_party 
       add constraint FK68hsqos0rpo2qf8ler9xdc2fv 
       foreign key (intake_intake_form_id) 
       references intake_form (intake_form_id);

    alter table approval_colleges 
       add constraint FK4f92856b8b67qmf4j9qbbutxp 
       foreign key (form_approval_form_id) 
       references approval_form (approval_form_id);

    alter table ApprovalForm_coPis 
       add constraint FK6wbt37q7o8wkx8jni2m0kq74m 
       foreign key (ApprovalForm_approval_form_id) 
       references approval_form (approval_form_id);

    alter table ApprovalForm_internalNotes 
       add constraint FKa4xe73f4rh5ysjium1svi2lvn 
       foreign key (ApprovalForm_approval_form_id) 
       references approval_form (approval_form_id);

    alter table chemicals 
       add constraint FKn6ccivm08qw80udmlge3nj6hd 
       foreign key (id) 
       references intake_form (intake_form_id);

    alter table co_pis 
       add constraint FKdsig23qv108gwufghwxpvic5s 
       foreign key (user_id) 
       references users (user_id);

    alter table co_pis 
       add constraint FK8vt4et6aaq9jh1crttckt1vbn 
       foreign key (timeline_id) 
       references timeline (timeline_id);

    alter table ConflictOfInterestKPNonPHS_disclosureReasons 
       add constraint FKlqklgtuniwncjtgevs8k8abvk 
       foreign key (ConflictOfInterestKPNonPHS_conflict_of_interest_non_phs_id) 
       references conflict_of_interest_non_phs (conflict_of_interest_non_phs_id);

    alter table ConflictOfInterestKPPHS_disclosureReasons 
       add constraint FKm1e64q2klb8pw29d10c3dmdgk 
       foreign key (ConflictOfInterestKPPHS_conflict_of_interest_kp_phs) 
       references conflict_of_interest_phs (conflict_of_interest_kp_phs);

    alter table ConflictOfInterestKPPHS_sponsor 
       add constraint FK90wmleg52gegwgd3fxcdw57a5 
       foreign key (ConflictOfInterestKPPHS_conflict_of_interest_kp_phs) 
       references conflict_of_interest_phs (conflict_of_interest_kp_phs);

    alter table ConflictOfInterestPHS_disclosureReasons 
       add constraint FK5ghcvaj3xnnbct40lque1judu 
       foreign key (ConflictOfInterestPHS_conflict_of_interest_phs_id) 
       references conflict_of_interest_phs (conflict_of_interest_kp_phs);

    alter table ConflictOfInterestPHS_sponsor 
       add constraint FKd95039gun1b64cvgqu0eag3sn 
       foreign key (ConflictOfInterestPHS_conflict_of_interest_phs_id) 
       references conflict_of_interest_phs (conflict_of_interest_kp_phs);

    alter table ConflictOfInterestPINonPHS_sigFinInterstDoesntInclude 
       add constraint FKdwjr9q8uhwc3ku4j40y1qlnog 
       foreign key (ConflictOfInterestPINonPHS_conflict_of_interest_pi_non_phs_id) 
       references conflict_of_interest_pi_non_phs (conflict_of_interest_pi_non_phs_id);

    alter table ConflictOfInterestPINonPHS_sigFinInterstReason 
       add constraint FKsohsjadxx0ac0qsttihpmctf1 
       foreign key (ConflictOfInterestPINonPHS_conflict_of_interest_pi_non_phs_id) 
       references conflict_of_interest_pi_non_phs (conflict_of_interest_pi_non_phs_id);

    alter table EquipmentForm_listOfRequirements 
       add constraint FK7qlnb3av6j5judr47lsmql5kh 
       foreign key (EquipmentForm_equipment_form_id) 
       references intake_form (intake_form_id);

    alter table EquipmentForm_typeOfEquipment 
       add constraint FK1cg6xmtchddyisy79j27g04r 
       foreign key (EquipmentForm_equipment_form_id) 
       references intake_form (intake_form_id);

    alter table hazardous_substances 
       add constraint FKj5jv2c1a54fq7r0eqha2sgp7c 
       foreign key (id) 
       references intake_form (intake_form_id);

    alter table IntakeForm_otherActivitiesList 
       add constraint FK9sgic2cmk4o4n2ut4ruqdfog3 
       foreign key (IntakeForm_intake_form_id) 
       references intake_form (intake_form_id);

    alter table orsp_due_dates 
       add constraint FKlkyjr1kbqa7q8bwcmxua0iejv 
       foreign key (id) 
       references timeline (timeline_id);

    alter table other_investigators 
       add constraint FK4u9sq5urvayna6xcan7xgkfe7 
       foreign key (user_id) 
       references users (user_id);

    alter table other_investigators 
       add constraint FK3sq5xse6u962bl0vwd0bmends 
       foreign key (conflict_of_interest_pi_non_phs_id) 
       references conflict_of_interest_pi_non_phs (conflict_of_interest_pi_non_phs_id);

    alter table personnel 
       add constraint FK3l8hbyiku137kh8owiikkrdr9 
       foreign key (intake_intake_form_id) 
       references intake_form (intake_form_id);

    alter table pi_due_dates 
       add constraint FKgq6i40qqhsc7n6x64lskv5gbv 
       foreign key (id) 
       references timeline (timeline_id);

    alter table project_location 
       add constraint FK5r24dvppnblui4f2nhjkqvaeo 
       foreign key (intake_intake_form_id) 
       references intake_form (intake_form_id);

    alter table proposal 
       add constraint FKntdt9pyobvfcp1cuvcwbq75pg 
       foreign key (approval_form_approval_form_id) 
       references approval_form (approval_form_id);

    alter table proposal 
       add constraint FKid392390582ebky1lmby5pud5 
       foreign key (budget_form_budget_form_id) 
       references budget (budget_form_id);

    alter table proposal 
       add constraint FKgsmxia0wwg2reu3g867w23vcx 
       foreign key (coi_kp_nonphs_conflict_of_interest_non_phs_id) 
       references conflict_of_interest_non_phs (conflict_of_interest_non_phs_id);

    alter table proposal 
       add constraint FK54kooa5mg77h9go6qi43o0yby 
       foreign key (coi_kp_phs_conflict_of_interest_kp_phs) 
       references conflict_of_interest_phs (conflict_of_interest_kp_phs);

    alter table proposal 
       add constraint FKk3xjn0vv43mice3jrxat601sx 
       foreign key (coi_phs_conflict_of_interest_phs_id) 
       references conflict_of_interest_phs (conflict_of_interest_kp_phs);

    alter table proposal 
       add constraint FK20kna4k0ieamafqb8sux08b7l 
       foreign key (coi_pi_nonphs_conflict_of_interest_pi_non_phs_id) 
       references conflict_of_interest_pi_non_phs (conflict_of_interest_pi_non_phs_id);

    alter table proposal 
       add constraint FKhec7wxej3f742gv6k1qxuhl06 
       foreign key (equipment_form_equipment_form_id) 
       references intake_form (intake_form_id);

    alter table proposal 
       add constraint FKs0rheyyyn53lw735dvtapr0bx 
       foreign key (intake_form_intake_form_id) 
       references intake_form (intake_form_id);

    alter table proposal 
       add constraint FKph4mow8ls5c0yqx0fhvqan8tb 
       foreign key (timeline_timeline_id) 
       references timeline (timeline_id);

    alter table requested_equipment 
       add constraint FKomsg8ifkux0n2gk8i7r8x76ps 
       foreign key (id) 
       references intake_form (intake_form_id);

    alter table space 
       add constraint FK7vaqbjq1q6kvtgkpwoar8a804 
       foreign key (intake_intake_form_id) 
       references intake_form (intake_form_id);

    alter table subgrant_subcontract 
       add constraint FKoecg581ku4vqlcbheldak9v8k 
       foreign key (intake_intake_form_id) 
       references intake_form (intake_form_id);

    alter table Timeline_addComments 
       add constraint FKklde0368tmvglr9oovuebgdw9 
       foreign key (Timeline_timeline_id) 
       references timeline (timeline_id);

    alter table users 
       add constraint FKq1dhratxc9df60217w70q01y3 
       foreign key (coi_pi_nonphs_conflict_of_interest_pi_non_phs_id) 
       references conflict_of_interest_pi_non_phs (conflict_of_interest_pi_non_phs_id);

    alter table users 
       add constraint FK8nkd2vjrykq02esq7cfgn09ld 
       foreign key (timeline_form_timeline_id) 
       references timeline (timeline_id);
