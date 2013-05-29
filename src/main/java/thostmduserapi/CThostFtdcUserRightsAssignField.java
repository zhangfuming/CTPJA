package thostmduserapi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\u05b1\ufffd\ufffd\ufffd\ufffd\u013d\ufffd\ufffd\ufffd\u0228\ufffd\ufffd<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:5847</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thostmduserapi") 
public class CThostFtdcUserRightsAssignField extends StructObject {
	/**
	 * \u04e6\ufffd\u00f5\ufffd\u052a\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(1) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDRIdentityIDType
	 */
	@Field(2) 
	public int DRIdentityID() {
		return this.io.getIntField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDRIdentityIDType
	 */
	@Field(2) 
	public CThostFtdcUserRightsAssignField DRIdentityID(int DRIdentityID) {
		this.io.setIntField(this, 2, DRIdentityID);
		return this;
	}
	public CThostFtdcUserRightsAssignField() {
		super();
	}
	public CThostFtdcUserRightsAssignField(Pointer pointer) {
		super(pointer);
	}
}
