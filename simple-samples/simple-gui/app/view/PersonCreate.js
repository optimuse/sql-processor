/*
 * File: app/view/PersonCreate.js
 *
 * This file was generated by Sencha Architect version 2.2.2.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.2.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.2.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('Simplereg.view.PersonCreate', {
    extend: 'Ext.window.Window',

    requires: [
        'Simplereg.view.override.PersonCreate'
    ],

    id: 'person-create',
    itemId: 'dialog',
    width: 400,
    closeAction: 'hide',
    iconCls: 'icon-add',
    title: 'Add Person',
    modal: true,

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    header: false,
                    title: 'Data',
                    standardSubmit: false,
                    trackResetOnLoad: true,
                    dockedItems: [
                        {
                            xtype: 'toolbar',
                            dock: 'bottom',
                            items: [
                                {
                                    xtype: 'button',
                                    itemId: 'reset',
                                    iconCls: 'icon-reset',
                                    text: 'Reset'
                                },
                                {
                                    xtype: 'tbfill'
                                },
                                {
                                    xtype: 'button',
                                    itemId: 'cancel',
                                    iconCls: 'icon-cancel',
                                    text: 'Cancel'
                                },
                                {
                                    xtype: 'button',
                                    itemId: 'submit',
                                    iconCls: 'icon-add',
                                    text: 'Add Person'
                                }
                            ]
                        }
                    ],
                    items: [
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'First Name',
                            name: 'firstName',
                            allowBlank: false
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Last Name',
                            name: 'lastName',
                            allowBlank: false
                        },
                        {
                            xtype: 'datefield',
                            anchor: '100%',
                            fieldLabel: 'Date of Birth',
                            name: 'dateOfBirth',
                            altFormats: 'd.m.Y',
                            format: 'd.m.Y'
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'SSN',
                            name: 'ssn'
                        },
                        {
                            xtype: 'combobox',
                            anchor: '100%',
                            fieldLabel: 'Gender',
                            name: 'gender',
                            allowBlank: false,
                            displayField: 'name',
                            forceSelection: true,
                            queryMode: 'local',
                            store: 'genders',
                            valueField: 'value'
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    }

});