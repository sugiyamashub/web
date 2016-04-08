package org.support.project.web.entity.gen;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import java.sql.Timestamp;



import org.support.project.common.bean.ValidateError;
import org.support.project.common.validate.Validator;
import org.support.project.common.validate.ValidatorFactory;
import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;

/**
 * 権限
 */
@DI(instance=Instance.Prototype)
public class GenRolesEntity implements Serializable {

	/** SerialVersion */
	private static final long serialVersionUID = 1L;

    /**
     * Get instance from DI container.
     * @return instance
     */
    public static GenRolesEntity get() {
        return Container.getComp(GenRolesEntity.class);
    }

    /**
     * Constructor.
     */
    public GenRolesEntity() {
        super();
    }

	/**
	 * コンストラクタ
	 * @param roleId 権限ID
	 */

	public GenRolesEntity(Integer roleId) {
		super();
		this.roleId = roleId;
	}
	/** 権限ID */
	private Integer roleId;
	/** 権限KEY */
	private String roleKey;
	/** 権限名 */
	private String roleName;
	/** 行ID */
	private String rowId;
	/** 登録ユーザ */
	private Integer insertUser;
	/** 登録日時 */
	private Timestamp insertDatetime;
	/** 更新ユーザ */
	private Integer updateUser;
	/** 更新日時 */
	private Timestamp updateDatetime;
	/** 削除フラグ */
	private Integer deleteFlag;

    /**
     * Get 権限ID.
     */
    public Integer getRoleId() {
        return this.roleId;
    }
    /**
     * Set 権限ID.
     * @param roleId 権限ID
     */
    public GenRolesEntity setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * Get 権限KEY.
     */
    public String getRoleKey() {
        return this.roleKey;
    }
    /**
     * Set 権限KEY.
     * @param roleKey 権限KEY
     */
    public GenRolesEntity setRoleKey(String roleKey) {
        this.roleKey = roleKey;
        return this;
    }

    /**
     * Get 権限名.
     */
    public String getRoleName() {
        return this.roleName;
    }
    /**
     * Set 権限名.
     * @param roleName 権限名
     */
    public GenRolesEntity setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Get 行ID.
     */
    public String getRowId() {
        return this.rowId;
    }
    /**
     * Set 行ID.
     * @param rowId 行ID
     */
    public GenRolesEntity setRowId(String rowId) {
        this.rowId = rowId;
        return this;
    }

    /**
     * Get 登録ユーザ.
     */
    public Integer getInsertUser() {
        return this.insertUser;
    }
    /**
     * Set 登録ユーザ.
     * @param insertUser 登録ユーザ
     */
    public GenRolesEntity setInsertUser(Integer insertUser) {
        this.insertUser = insertUser;
        return this;
    }

    /**
     * Get 登録日時.
     */
    public Timestamp getInsertDatetime() {
        return this.insertDatetime;
    }
    /**
     * Set 登録日時.
     * @param insertDatetime 登録日時
     */
    public GenRolesEntity setInsertDatetime(Timestamp insertDatetime) {
        this.insertDatetime = insertDatetime;
        return this;
    }

    /**
     * Get 更新ユーザ.
     */
    public Integer getUpdateUser() {
        return this.updateUser;
    }
    /**
     * Set 更新ユーザ.
     * @param updateUser 更新ユーザ
     */
    public GenRolesEntity setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * Get 更新日時.
     */
    public Timestamp getUpdateDatetime() {
        return this.updateDatetime;
    }
    /**
     * Set 更新日時.
     * @param updateDatetime 更新日時
     */
    public GenRolesEntity setUpdateDatetime(Timestamp updateDatetime) {
        this.updateDatetime = updateDatetime;
        return this;
    }

    /**
     * Get 削除フラグ.
     */
    public Integer getDeleteFlag() {
        return this.deleteFlag;
    }
    /**
     * Set 削除フラグ.
     * @param deleteFlag 削除フラグ
     */
    public GenRolesEntity setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
        return this;
    }

	/**
	 * キーの値を取得 
	 */
	public Object[] getKeyValues() {
		Object[] keyValues = new Object[1];
		keyValues[0] = this.roleId;
		return keyValues;
	}
	/**
	 * キーの値を設定 
	 * @param roleId 権限ID
	 */
	public void setKeyValues(Integer roleId) {
		this.roleId = roleId;
	}
	/**
	 * キーで比較 
	 */
	public boolean equalsOnKey(GenRolesEntity entity) {
		Object[] keyValues1 = getKeyValues();
		Object[] keyValues2 = entity.getKeyValues();
		for (int i = 0; i < keyValues1.length; i++) {
			Object val1 = keyValues1[i];
			Object val2 = keyValues2[i];
			if (val1 == null && val2 != null) {
				return false;
			}
			if (val1 != null && val2 == null) {
				return false;
			}
			if (val1 != null && val2 != null) {
				if (!val1.equals(val2)) {
					return false;
				}
			}
			
		}
		return true;
	}
	/**
	 * ToString 
	 */
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("roleId = ").append(roleId).append("\n");
		builder.append("roleKey = ").append(roleKey).append("\n");
		builder.append("roleName = ").append(roleName).append("\n");
		builder.append("rowId = ").append(rowId).append("\n");
		builder.append("insertUser = ").append(insertUser).append("\n");
		builder.append("insertDatetime = ").append(insertDatetime).append("\n");
		builder.append("updateUser = ").append(updateUser).append("\n");
		builder.append("updateDatetime = ").append(updateDatetime).append("\n");
		builder.append("deleteFlag = ").append(deleteFlag).append("\n");
		return builder.toString();
	}
	/**
	 * 表示用の名称を変換 
	 */
	protected String convLabelName(String label) {
		return label;
	}
	/**
	 * validate 
	 */
	public List<ValidateError> validate() {
		List<ValidateError> errors = new ArrayList<>();
		Validator validator;
		ValidateError error;
		validator = ValidatorFactory.getInstance(Validator.INTEGER);
		error = validator.validate(this.roleId, convLabelName("Role Id"));
		if (error != null) {
			errors.add(error);
		}
		validator = ValidatorFactory.getInstance(Validator.REQUIRED);
		error = validator.validate(this.roleKey, convLabelName("Role Key"));
		if (error != null) {
			errors.add(error);
		}
		validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
		error = validator.validate(this.roleKey, convLabelName("Role Key"), 12);
		if (error != null) {
			errors.add(error);
		}
		validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
		error = validator.validate(this.roleName, convLabelName("Role Name"), 50);
		if (error != null) {
			errors.add(error);
		}
		validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
		error = validator.validate(this.rowId, convLabelName("Row Id"), 64);
		if (error != null) {
			errors.add(error);
		}
		validator = ValidatorFactory.getInstance(Validator.INTEGER);
		error = validator.validate(this.insertUser, convLabelName("Insert User"));
		if (error != null) {
			errors.add(error);
		}
		validator = ValidatorFactory.getInstance(Validator.INTEGER);
		error = validator.validate(this.updateUser, convLabelName("Update User"));
		if (error != null) {
			errors.add(error);
		}
		validator = ValidatorFactory.getInstance(Validator.INTEGER);
		error = validator.validate(this.deleteFlag, convLabelName("Delete Flag"));
		if (error != null) {
			errors.add(error);
		}
		return errors;
	}
	/**
	 * validate 
	 */
	public List<ValidateError> validate(Map<String, String> values) {
		List<ValidateError> errors = new ArrayList<>();
		Validator validator;
		ValidateError error;
		validator = ValidatorFactory.getInstance(Validator.INTEGER);
		error = validator.validate(values.get("roleId"), convLabelName("Role Id"));
		if (error != null) {
			errors.add(error);
		}
		validator = ValidatorFactory.getInstance(Validator.REQUIRED);
		error = validator.validate(values.get("roleKey"), convLabelName("Role Key"));
		if (error != null) {
			errors.add(error);
		}
		validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
		error = validator.validate(values.get("roleKey"), convLabelName("Role Key"), 12);
		if (error != null) {
			errors.add(error);
		}
		validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
		error = validator.validate(values.get("roleName"), convLabelName("Role Name"), 50);
		if (error != null) {
			errors.add(error);
		}
		validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
		error = validator.validate(values.get("rowId"), convLabelName("Row Id"), 64);
		if (error != null) {
			errors.add(error);
		}
		validator = ValidatorFactory.getInstance(Validator.INTEGER);
		error = validator.validate(values.get("insertUser"), convLabelName("Insert User"));
		if (error != null) {
			errors.add(error);
		}
		validator = ValidatorFactory.getInstance(Validator.INTEGER);
		error = validator.validate(values.get("updateUser"), convLabelName("Update User"));
		if (error != null) {
			errors.add(error);
		}
		validator = ValidatorFactory.getInstance(Validator.INTEGER);
		error = validator.validate(values.get("deleteFlag"), convLabelName("Delete Flag"));
		if (error != null) {
			errors.add(error);
		}
		return errors;
	}

}
