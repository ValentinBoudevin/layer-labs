FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI:append = " file://system.conf \
    file://ca.cert.pem "

do_install:append() {
    install -d ${D}/etc/rauc
    install -m 0755 ${WORKDIR}/ca.cert.pem ${D}/etc/rauc
}