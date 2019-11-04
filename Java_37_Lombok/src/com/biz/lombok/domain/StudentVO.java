package com.biz.lombok.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
/*
 * lombok.jar (�Һ�������Ʈ)
 * domain, model Ŭ�������� getter(), setter(), toString()
 * ������ ���� �ڵ带 ���ŷӰ� �ۼ��� �ʿ���� 
 * �ڵ����� �������ִ� 3rd party lib �̴�
 * 
 * ��Ŭ������ ���� IDE ������ �ϴ� agent(plug in)�� ��ġ���ְ�
 * ������Ʈ������ build path���� lombok.jar ������ add�ؼ�
 * ����� �� �ִ�
 */
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * Annotation
 * JavaȮ�� Ű����
 * @Keyword ��� �ۼ��ϸ�
 * Java �����Ϸ��� �ش� Ű����� �ۼ���
 * Ŭ������ �����ٰ� �ڵ带 �ϼ��ؼ� �������� �����ش�
 */
//@Data�� �Ʒ� ������ ��� @~~ ���� �����Ѵ�
//@Data�� lombok ���� ����Ҽ� �ִ� ��� ���� enable �ϴ� Ű�����ε�
// ���� ������� �ʴ� method ���� �����Ͽ� �����ϵ� �ڵ带 �����ϱ⵵ �Ѵ�
// @data ���ٴ� �ʿ��� �׸�鸸 �����ؼ� ����϶� �� �����Ѵ�
@Getter
@Setter
@ToString
@AllArgsConstructor // field ������
@NoArgsConstructor 	// �⺻ ������
@Builder 			// ��������
public class StudentVO {

	private String s_num;
	private String s_name;
	private String s_tel;
	private String s_addr;
	private int s_grade;
	private String s_dept;
	
}
