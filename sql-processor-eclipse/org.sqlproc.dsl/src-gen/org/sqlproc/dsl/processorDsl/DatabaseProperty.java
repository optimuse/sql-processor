/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbUrl <em>Db Url</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbPassword <em>Db Password</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbSchema <em>Db Schema</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbDriver <em>Db Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty()
 * @model
 * @generated
 */
public interface DatabaseProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Db Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Url</em>' attribute.
   * @see #setDbUrl(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbUrl()
   * @model
   * @generated
   */
  String getDbUrl();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbUrl <em>Db Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Url</em>' attribute.
   * @see #getDbUrl()
   * @generated
   */
  void setDbUrl(String value);

  /**
   * Returns the value of the '<em><b>Db Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Username</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Username</em>' attribute.
   * @see #setDbUsername(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbUsername()
   * @model
   * @generated
   */
  String getDbUsername();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbUsername <em>Db Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Username</em>' attribute.
   * @see #getDbUsername()
   * @generated
   */
  void setDbUsername(String value);

  /**
   * Returns the value of the '<em><b>Db Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Password</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Password</em>' attribute.
   * @see #setDbPassword(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbPassword()
   * @model
   * @generated
   */
  String getDbPassword();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbPassword <em>Db Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Password</em>' attribute.
   * @see #getDbPassword()
   * @generated
   */
  void setDbPassword(String value);

  /**
   * Returns the value of the '<em><b>Db Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Schema</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Schema</em>' attribute.
   * @see #setDbSchema(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbSchema()
   * @model
   * @generated
   */
  String getDbSchema();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbSchema <em>Db Schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Schema</em>' attribute.
   * @see #getDbSchema()
   * @generated
   */
  void setDbSchema(String value);

  /**
   * Returns the value of the '<em><b>Db Driver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Driver</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Driver</em>' attribute.
   * @see #setDbDriver(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbDriver()
   * @model
   * @generated
   */
  String getDbDriver();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbDriver <em>Db Driver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Driver</em>' attribute.
   * @see #getDbDriver()
   * @generated
   */
  void setDbDriver(String value);

} // DatabaseProperty