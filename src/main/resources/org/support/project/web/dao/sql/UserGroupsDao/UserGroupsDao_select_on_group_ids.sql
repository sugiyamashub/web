SELECT * FROM USER_GROUPS
 WHERE 
GROUP_ID IN (%GROUPS%)
 AND DELETE_FLAG = 0;
