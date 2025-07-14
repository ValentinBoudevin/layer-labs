inherit bundle

SUMMARY = "Bundle image for Copro"
LICENSE = "CLOSED"

SRC_URI = "file://development-1.cert.pem \
          file://development-1.key.pem \
          file://hooks \
"

RAUC_BUNDLE_SLOTS = "rootfs"
RAUC_SLOT_rootfs = "yoctolabs-image-minimal"
RAUC_BUNDLE_COMPATIBLE= "yoctolabs"

RAUC_KEY_FILE = "${WORKDIR}/development-1.key.pem"
RAUC_CERT_FILE = "${WORKDIR}/development-1.cert.pem"

#Ajout du CASYNC
RAUC_BUNDLE_FORMAT = "verity"
RAUC_CASYNC_BUNDLE ?= "1"
RAUC_KEYRING_FILE= "${THISDIR}/../rauc/files/ca.cert.pem"

#Ajout du Hook
RAUC_BUNDLE_HOOKS[file] = "hooks"
RAUC_SLOT_rootfs[hooks] = "post-install"