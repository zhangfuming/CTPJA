package thostmduserapi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\u9fb2\u032c\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:2412</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thostmduserapi") 
public class CThostFtdcMarketDataStaticField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(0) 
	public double OpenPrice() {
		return this.io.getDoubleField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(0) 
	public CThostFtdcMarketDataStaticField OpenPrice(double OpenPrice) {
		this.io.setDoubleField(this, 0, OpenPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\u07fc\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(1) 
	public double HighestPrice() {
		return this.io.getDoubleField(this, 1);
	}
	/**
	 * \ufffd\ufffd\u07fc\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(1) 
	public CThostFtdcMarketDataStaticField HighestPrice(double HighestPrice) {
		this.io.setDoubleField(this, 1, HighestPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\u037c\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(2) 
	public double LowestPrice() {
		return this.io.getDoubleField(this, 2);
	}
	/**
	 * \ufffd\ufffd\u037c\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(2) 
	public CThostFtdcMarketDataStaticField LowestPrice(double LowestPrice) {
		this.io.setDoubleField(this, 2, LowestPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(3) 
	public double ClosePrice() {
		return this.io.getDoubleField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(3) 
	public CThostFtdcMarketDataStaticField ClosePrice(double ClosePrice) {
		this.io.setDoubleField(this, 3, ClosePrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0363\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(4) 
	public double UpperLimitPrice() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \ufffd\ufffd\u0363\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(4) 
	public CThostFtdcMarketDataStaticField UpperLimitPrice(double UpperLimitPrice) {
		this.io.setDoubleField(this, 4, UpperLimitPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0363\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(5) 
	public double LowerLimitPrice() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u0363\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(5) 
	public CThostFtdcMarketDataStaticField LowerLimitPrice(double LowerLimitPrice) {
		this.io.setDoubleField(this, 5, LowerLimitPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u03bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(6) 
	public double SettlementPrice() {
		return this.io.getDoubleField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\u03bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(6) 
	public CThostFtdcMarketDataStaticField SettlementPrice(double SettlementPrice) {
		this.io.setDoubleField(this, 6, SettlementPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b5\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(7) 
	public double CurrDelta() {
		return this.io.getDoubleField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b5\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(7) 
	public CThostFtdcMarketDataStaticField CurrDelta(double CurrDelta) {
		this.io.setDoubleField(this, 7, CurrDelta);
		return this;
	}
	public CThostFtdcMarketDataStaticField() {
		super();
	}
	public CThostFtdcMarketDataStaticField(Pointer pointer) {
		super(pointer);
	}
}
