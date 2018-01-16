
    create table additional_parties_involved (
       additional_parties_involved_id bigint not null auto_increment,
        explanation_of_involvement varchar(255),
        party_name varchar(255),
        supervisor varchar(255),
        intake_form_id bigint,
        primary key (additional_parties_involved_id)
    ) engine=MyISAM;

    create table approval_colleges (
       approval_college_id bigint not null,
        fringe_cost integer,
        meeting_expenses integer,
        personnel_cost integer,
        total_cost integer,
        form_form_id bigint,
        primary key (approval_college_id)
    ) engine=MyISAM;

    create table ApprovalForm_coPis (
       ApprovalForm_form_id bigint not null,
        co_pis varchar(255)
    ) engine=MyISAM;

    create table ApprovalForm_internalNotes (
       ApprovalForm_form_id bigint not null,
        internal_notes varchar(255)
    ) engine=MyISAM;

    create table budget (
       budget_form_id bigint not null,
        date datetime,
        file_path varchar(255),
        file_name varchar(255),
        uploader varchar(255),
        file_type varchar(255),
        primary key (budget_form_id)
    ) engine=MyISAM;

    create table chemicals (
       id bigint not null,
        amount varchar(255),
        chemical_name integer not null,
        primary key (id, chemical_name)
    ) engine=MyISAM;

    create table colleges (
       college_id bigint not null,
        dean tinyblob,
        college_name varchar(255),
        primary key (college_id)
    ) engine=MyISAM;

    create table departments (
       department_id bigint not null,
        college tinyblob,
        department_chair tinyblob,
        department_name varchar(255) not null,
        primary key (department_id)
    ) engine=MyISAM;

    create table EquipmentForm_listOfRequirements (
       EquipmentForm_form_id bigint not null,
        list_of_requirements varchar(255)
    ) engine=MyISAM;

    create table EquipmentForm_typeOfEquipment (
       EquipmentForm_form_id bigint not null,
        type_of_equipment varchar(255)
    ) engine=MyISAM;

    create table file_info (
       file_info_id bigint not null,
        file_name varchar(255),
        file_path varchar(255),
        file_Type varchar(255),
        uploader varchar(255),
        upload_date date,
        primary key (file_info_id)
    ) engine=MyISAM;

    create table form (
       DTYPE varchar(31) not null,
        form_id bigint not null auto_increment,
        is_complete bit,
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
        end_date date,
        pi varchar(255),
        proposed_funding_amount integer,
        start_date date,
        stage_id bigint,
        primary key (form_id)
    ) engine=MyISAM;

    create table hazardous_substances (
       hazardous_substances_id bigint not null,
        substance_type varchar(255),
        name_of_agent varchar(255) not null,
        primary key (hazardous_substances_id, name_of_agent)
    ) engine=MyISAM;

    create table hibernate_sequence (
       next_val bigint
    ) engine=MyISAM;

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    insert into hibernate_sequence values ( 1 );

    create table other_activities (
       intake_form_id bigint not null,
        other_activity varchar(255)
    ) engine=MyISAM;

    create table personnel (
       personnel_id bigint not null auto_increment,
        employer varchar(255),
        name varchar(255),
        percent_of_time_proposed integer,
        position_title_on_grant varchar(255),
        units integer,
        intake_form_id bigint,
        primary key (personnel_id)
    ) engine=MyISAM;

    create table project_locations (
       project_locations_id bigint not null auto_increment,
        agreement_arranged bit,
        time_on_site integer,
        site_address varchar(255),
        site_name varchar(255),
        intake_form_id bigint,
        primary key (project_locations_id)
    ) engine=MyISAM;

    create table proposal (
       proposal_id bigint not null auto_increment,
        date_created date,
        proposal_name varchar(255),
        status varchar(255),
        intake_form_id bigint,
        timeline_id bigint,
        user_id bigint,
        primary key (proposal_id)
    ) engine=MyISAM;

    create table requested_equipment (
       requested_equipment_id bigint not null,
        amount integer,
        equipment_name varchar(255) not null,
        primary key (requested_equipment_id, equipment_name)
    ) engine=MyISAM;

    create table required_forms (
       timeline_id bigint not null,
        form_name varchar(255)
    ) engine=MyISAM;

    create table signature (
       signature_id bigint not null,
        name varchar(255),
        primary key (signature_id)
    ) engine=MyISAM;

    create table space (
       space_id bigint not null auto_increment,
        item varchar(255),
        source_of_funds varchar(255),
        type_of_use varchar(255),
        intake_form_id bigint,
        primary key (space_id)
    ) engine=MyISAM;

    create table stage (
       stage_id bigint not null auto_increment,
        completed_date datetime,
        expected_date datetime,
        name varchar(255),
        uas_review_required bit,
        uas_reviewed bit,
        timeline_id bigint,
        primary key (stage_id)
    ) engine=MyISAM;

    create table subgrants_or_subcontracts (
       subgrant_or_subcontract_id bigint not null auto_increment,
        address varchar(255),
        contact_person_email varchar(255),
        contact_person_name varchar(255),
        contact_person_phone bigint,
        institution varchar(255),
        proposed_funding_amount integer,
        intake_form_id bigint,
        primary key (subgrant_or_subcontract_id)
    ) engine=MyISAM;

    create table timeline (
       timeline_id bigint not null auto_increment,
        final_sign_date datetime,
        funding_agency varchar(255),
        pi tinyblob,
        proposal varchar(255),
        sponsor_date datetime,
        uas_date datetime,
        primary key (timeline_id)
    ) engine=MyISAM;

    create table Timeline$Stage_addComments (
       Timeline$Stage_stage_id bigint not null,
        add_comments varchar(255)
    ) engine=MyISAM;

    create table Timeline_coPI (
       Timeline_timeline_id bigint not null,
        co_pis varchar(255)
    ) engine=MyISAM;

    create table users (
       user_id bigint not null auto_increment,
        email varchar(255) not null,
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        username varchar(255) not null,
        primary key (user_id)
    ) engine=MyISAM;

    alter table departments 
       add constraint UK_qyf2ekbfpnddm6f3rkgt39i9o unique (department_name);

    alter table users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

    alter table users 
       add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username);

    alter table additional_parties_involved 
       add constraint FKrtaab9m7i4m49rphge66b1xs8 
       foreign key (intake_form_id) 
       references form (form_id);

    alter table approval_colleges 
       add constraint FK2doij7kd3qsdg3gabhesja1hx 
       foreign key (form_form_id) 
       references form (form_id);

    alter table ApprovalForm_coPis 
       add constraint FK83ubpey6delfeb8wao49ye7lr 
       foreign key (ApprovalForm_form_id) 
       references form (form_id);

    alter table ApprovalForm_internalNotes 
       add constraint FKsqf6gfsno2y2kdy022aijk0fd 
       foreign key (ApprovalForm_form_id) 
       references form (form_id);

    alter table chemicals 
       add constraint FK6eqxf50u8va4p06uom0ippo52 
       foreign key (id) 
       references form (form_id);

    alter table EquipmentForm_listOfRequirements 
       add constraint FK4ful3bdtw6hd0vv1a8i9bcc0l 
       foreign key (EquipmentForm_form_id) 
       references form (form_id);

    alter table EquipmentForm_typeOfEquipment 
       add constraint FKb0ql7yie14shqa01xr79hw3xe 
       foreign key (EquipmentForm_form_id) 
       references form (form_id);

    alter table form 
       add constraint FKjr3t0ti0w8f8ch6brn9pgpokc 
       foreign key (stage_id) 
       references stage (stage_id);

    alter table hazardous_substances 
       add constraint FK4igsnfxmjw3wuw8thvwbxgkir 
       foreign key (hazardous_substances_id) 
       references form (form_id);

    alter table other_activities 
       add constraint FK6jy4q546it2biinxtce13cxt7 
       foreign key (intake_form_id) 
       references form (form_id);

    alter table personnel 
       add constraint FKtkdyls5wk8hygf5ke1drcm5d 
       foreign key (intake_form_id) 
       references form (form_id);

    alter table project_locations 
       add constraint FK7ldg8ugry3in3gt9e4quby1y4 
       foreign key (intake_form_id) 
       references form (form_id);

    alter table proposal 
       add constraint FKcy7vdy9wo7ph6fq2jf03twat9 
       foreign key (intake_form_id) 
       references form (form_id);

    alter table proposal 
       add constraint FK1uiqx36h5gwmixwcdm62k6nqk 
       foreign key (timeline_id) 
       references timeline (timeline_id);

    alter table proposal 
       add constraint FKemv61ye7eke2swbwg3to7fmg3 
       foreign key (user_id) 
       references users (user_id);

    alter table proposal 
       add constraint FKbwvl70focwr531ksyn4h6n9pg 
       foreign key (proposal_id) 
       references users (user_id);

    alter table requested_equipment 
       add constraint FK7gr275nbngne7oyl9410liv67 
       foreign key (requested_equipment_id) 
       references form (form_id);

    alter table required_forms 
       add constraint FKe4hmcrcjnts57x9grx3y8bomg 
       foreign key (timeline_id) 
       references stage (stage_id);

    alter table space 
       add constraint FKmphxnucd6y15dab1kkud99kca 
       foreign key (intake_form_id) 
       references form (form_id);

    alter table stage 
       add constraint FKsrwsf01ie8mk2fxl0yi7xgwu2 
       foreign key (timeline_id) 
       references timeline (timeline_id);

    alter table subgrants_or_subcontracts 
       add constraint FKqjtd9l0ey95ytghk4twncx2ek 
       foreign key (intake_form_id) 
       references form (form_id);

    alter table Timeline$Stage_addComments 
       add constraint FKrsvm5tmc4ssilxlmpup9o3k4c 
       foreign key (Timeline$Stage_stage_id) 
       references stage (stage_id);

    alter table Timeline_coPI 
       add constraint FK6c981s1inlvmxia9judmtkgfu 
       foreign key (Timeline_timeline_id) 
       references timeline (timeline_id);
