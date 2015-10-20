----------------20150921---------------------------
--1

insert into as_role_func (ROLE_ID, COMPO_ID, FUNC_ID, TRANS_DATE)
values ('R_SF_DENGJI', 'SF_JD_RESULT', 'funaudit', to_date('21-10-2010 16:43:33', 'dd-mm-yyyy hh24:mi:ss'));

insert into as_role_func (ROLE_ID, COMPO_ID, FUNC_ID, TRANS_DATE)
values ('R_SF_DENGJI', 'SF_JD_RESULT', 'funtread', to_date('21-10-2010 16:43:33', 'dd-mm-yyyy hh24:mi:ss'));

--2

insert into as_wf_activity_field (WF_TEMPLATE_ID, WF_NODE_ID, DATA_ITEM, COMPO_ID, TAB_ID, READ_WRITE)
values (31079, 31110082, 'BRIEF', 'SF_JD_RESULT', 'SF_JD_RESULT', 2);

insert into as_wf_activity_field (WF_TEMPLATE_ID, WF_NODE_ID, DATA_ITEM, COMPO_ID, TAB_ID, READ_WRITE)
values (31079, 31110082, 'ENTRUST_CODE', 'SF_JD_RESULT', 'SF_JD_RESULT', 2);

insert into as_wf_activity_field (WF_TEMPLATE_ID, WF_NODE_ID, DATA_ITEM, COMPO_ID, TAB_ID, READ_WRITE)
values (31079, 31110082, 'JDR', 'SF_JD_RESULT', 'SF_JD_RESULT', 2);

insert into as_wf_activity_field (WF_TEMPLATE_ID, WF_NODE_ID, DATA_ITEM, COMPO_ID, TAB_ID, READ_WRITE)
values (31079, 31110082, 'JD_ADDRESS', 'SF_JD_RESULT', 'SF_JD_RESULT', 2);

insert into as_wf_activity_field (WF_TEMPLATE_ID, WF_NODE_ID, DATA_ITEM, COMPO_ID, TAB_ID, READ_WRITE)
values (31079, 31110082, 'JD_DATE', 'SF_JD_RESULT', 'SF_JD_RESULT', 2);

insert into as_wf_activity_field (WF_TEMPLATE_ID, WF_NODE_ID, DATA_ITEM, COMPO_ID, TAB_ID, READ_WRITE)
values (31079, 31110082, 'JD_METHOD', 'SF_JD_RESULT', 'SF_JD_RESULT', 2);

insert into as_wf_activity_field (WF_TEMPLATE_ID, WF_NODE_ID, DATA_ITEM, COMPO_ID, TAB_ID, READ_WRITE)
values (31079, 31110082, 'JD_OPINION', 'SF_JD_RESULT', 'SF_JD_RESULT', 2);

insert into as_wf_activity_field (WF_TEMPLATE_ID, WF_NODE_ID, DATA_ITEM, COMPO_ID, TAB_ID, READ_WRITE)
values (31079, 31110082, 'JD_PROCESS', 'SF_JD_RESULT', 'SF_JD_RESULT', 2);

insert into as_wf_activity_field (WF_TEMPLATE_ID, WF_NODE_ID, DATA_ITEM, COMPO_ID, TAB_ID, READ_WRITE)
values (31079, 31110082, 'JD_RESULT', 'SF_JD_RESULT', 'SF_JD_RESULT', 2);

insert into as_wf_activity_field (WF_TEMPLATE_ID, WF_NODE_ID, DATA_ITEM, COMPO_ID, TAB_ID, READ_WRITE)
values (31079, 31110082, 'JD_TARGET', 'SF_JD_RESULT', 'SF_JD_RESULT', 2);

insert into as_wf_activity_field (WF_TEMPLATE_ID, WF_NODE_ID, DATA_ITEM, COMPO_ID, TAB_ID, READ_WRITE)
values (31079, 31110082, 'NAME', 'SF_JD_RESULT', 'SF_JD_RESULT', 2);

insert into as_wf_activity_field (WF_TEMPLATE_ID, WF_NODE_ID, DATA_ITEM, COMPO_ID, TAB_ID, READ_WRITE)
values (31079, 31110082, 'REMARK', 'SF_JD_RESULT', 'SF_JD_RESULT', 2);

insert into as_wf_activity_field (WF_TEMPLATE_ID, WF_NODE_ID, DATA_ITEM, COMPO_ID, TAB_ID, READ_WRITE)
values (31079, 31110082, 'RESULT_TYPE', 'SF_JD_RESULT', 'SF_JD_RESULT', 2);

insert into as_wf_activity_field (WF_TEMPLATE_ID, WF_NODE_ID, DATA_ITEM, COMPO_ID, TAB_ID, READ_WRITE)
values (31079, 31110082, 'ZC_PERSONS', 'SF_JD_RESULT', 'SF_JD_RESULT', 2);

insert into as_wf_activity_field (WF_TEMPLATE_ID, WF_NODE_ID, DATA_ITEM, COMPO_ID, TAB_ID, READ_WRITE)
values (31079, 31110082, 'ZHU_SU', 'SF_JD_RESULT', 'SF_JD_RESULT', 2);