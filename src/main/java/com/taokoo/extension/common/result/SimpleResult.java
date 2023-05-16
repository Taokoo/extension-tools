package com.taokoo.extension.common.result;

/**
 * @Title SimpleResult
 * @Author Taokoo
 * @Date 2022/11/16
 */
public class SimpleResult<T> {
    private static final String SUCCESS_CODE;
    private String resultCode;
    private String resultDesc;
    private T resultData;

    public boolean isSuccess() {
        return ResultCodeEnum.SUCCESS.getCode().equals(this.resultCode);
    }

    public SimpleResult() {
        this.resultCode = ResultCodeEnum.SUCCESS.getCode();
    }

    public SimpleResult(String resultCode, String resultDesc) {
        this.resultCode = ResultCodeEnum.SUCCESS.getCode();
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
    }

    public SimpleResult(String resultCode, String resultDesc, T resultData) {
        this.resultCode = ResultCodeEnum.SUCCESS.getCode();
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
        this.resultData = resultData;
    }

    public SimpleResult(ResultCode resultCode) {
        this.resultCode = ResultCodeEnum.SUCCESS.getCode();
        this.resultCode = resultCode.getCode();
        this.resultDesc = resultCode.getMessage();
    }

    public SimpleResult(ResultCode resultCode, T resultData) {
        this.resultCode = ResultCodeEnum.SUCCESS.getCode();
        this.resultCode = resultCode.getCode();
        this.resultDesc = resultCode.getMessage();
        this.resultData = resultData;
    }

    public static <T> SimpleResult<T> success(T data) {
        return new SimpleResult(ResultCodeEnum.SUCCESS, data);
    }

    public static <T> SimpleResult<T> success() {
        return new SimpleResult(ResultCodeEnum.SUCCESS);
    }

    public static <T> SimpleResult<T> error() {
        return new SimpleResult(ResultCodeEnum.ERROR);
    }

    public static <T> SimpleResult<T> error(String resultDesc) {
        SimpleResult<T> result = new SimpleResult();
        result.setResultCode(ResultCodeEnum.ERROR.getCode());
        result.setResultDesc(resultDesc);
        return result;
    }

    public static <T> SimpleResult<T> error(String code, String resultDesc) {
        SimpleResult<T> result = new SimpleResult();
        result.setResultCode(code);
        result.setResultDesc(resultDesc);
        return result;
    }
    public static <T> SimpleResult<T> error(ResultCodeEnum resultCodeEnum) {
        SimpleResult<T> result = new SimpleResult();
        result.setResultCode(resultCodeEnum.getCode());
        result.setResultDesc(resultCodeEnum.getMessage());
        return result;
    }

    public static <T> SimpleResult<T> error(ResultCodeEnum resultCodeEnum, String message) {
        SimpleResult<T> result = new SimpleResult();
        result.setResultCode(resultCodeEnum.getCode());
        result.setResultDesc(message);
        return result;
    }

    public static <T> SimpleResult<T> errorParameter() {
        return new SimpleResult(ResultCodeEnum.PARAMETER_ERROR);
    }

    public static <T> SimpleResult<T> errorParameter(String resultDesc) {
        SimpleResult<T> result = new SimpleResult();
        result.setResultCode(ResultCodeEnum.PARAMETER_ERROR.getCode());
        result.setResultDesc(resultDesc);
        return result;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public String getResultDesc() {
        return this.resultDesc;
    }

    public T getResultData() {
        return this.resultData;
    }

    public SimpleResult<T> setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    public SimpleResult<T> setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
        return this;
    }

    public SimpleResult<T> setResultData(T resultData) {
        this.resultData = resultData;
        return this;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof SimpleResult)) {
            return false;
        } else {
            SimpleResult<?> other = (SimpleResult)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$resultCode = this.getResultCode();
                    Object other$resultCode = other.getResultCode();
                    if (this$resultCode == null) {
                        if (other$resultCode == null) {
                            break label47;
                        }
                    } else if (this$resultCode.equals(other$resultCode)) {
                        break label47;
                    }

                    return false;
                }

                Object this$resultDesc = this.getResultDesc();
                Object other$resultDesc = other.getResultDesc();
                if (this$resultDesc == null) {
                    if (other$resultDesc != null) {
                        return false;
                    }
                } else if (!this$resultDesc.equals(other$resultDesc)) {
                    return false;
                }

                Object this$resultData = this.getResultData();
                Object other$resultData = other.getResultData();
                if (this$resultData == null) {
                    if (other$resultData != null) {
                        return false;
                    }
                } else if (!this$resultData.equals(other$resultData)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof SimpleResult;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $resultCode = this.getResultCode();
        result = result * 59 + ($resultCode == null ? 43 : $resultCode.hashCode());
        Object $resultDesc = this.getResultDesc();
        result = result * 59 + ($resultDesc == null ? 43 : $resultDesc.hashCode());
        Object $resultData = this.getResultData();
        result = result * 59 + ($resultData == null ? 43 : $resultData.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getResultCode();
        return "SimpleResult(resultCode=" + var10000 + ", resultDesc=" + this.getResultDesc() + ", resultData=" + this.getResultData() + ")";
    }

    static {
        SUCCESS_CODE = ResultCodeEnum.SUCCESS.getCode();
    }
}
