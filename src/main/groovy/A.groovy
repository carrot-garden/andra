
class A {

	/**
	 *
	 * ${type-id}-${type-version}://${node-id}/${path-id}
	 *
	 * andra.Node-1.0://wks0.test.com/
	 * andra.Group-1.5://wks0.test.com/admin
	 * andra.User-1.1://wks0.test.com/andra
	 * andra.Path-1.1://wks0.test.com/var/lib/store
	 * andra.Service-1.2://wks0.test.com/ntp
	 *
	 * andra.User-1.1://wks0.test.com/?id=b330869d-ee0c-4ea2-aaa8-795e1c33e31a
	 */

	/**
	 *
	 * andra://${node-id}/${type-id}/${item-id}
	 *
	 * andra://wks0.test.com/andra.Path/
	 */

	/**
	 *
	 * andra://${node-id}/${type-id}/${type-version}/${item-id}
	 *
	 * andra://wks0.test.com/andra.Path//var/lib/store
	 * andra://wks0.test.com/andra.Path/1.0/var/lib/store
	 * andra://wks0.test.com/andra.Path/1.0/?id=b330869d-ee0c-4ea2-aaa8-795e1c33e31a
	 */
}
