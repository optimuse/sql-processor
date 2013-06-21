/*
 * File: app/store/People.js
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

Ext.define('Simplereg.store.People', {
    extend: 'Ext.data.Store',

    requires: [
        'Simplereg.model.Person'
    ],

    constructor: function(cfg) {
        var me = this;
        cfg = cfg || {};
        me.callParent([Ext.apply({
            model: 'Simplereg.model.Person',
            remoteFilter: true,
            remoteSort: true,
            storeId: 'People',
            pageSize: 5,
            proxy: {
                type: 'direct',
                api: { read: "simpleService.loadPeople" },
                reader: {
                    type: 'json',
                    root: 'records'
                }
            },
            listeners: {
                load: {
                    fn: me.fitin,
                    scope: me
                }
            },
            sorters: {
                property: 'lastName'
            }
        }, cfg)]);
    },

    fitin: function(store, records, successful, eOpts) {
        if (store.currentPage > 1 && !records.length) {
            store.previousPage();
        }   
    }

});