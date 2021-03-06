package app.revanced.patches.youtube.misc.forcevp9.fingerprints

import app.revanced.patcher.annotation.Name
import app.revanced.patcher.annotation.Version
import app.revanced.patcher.extensions.or
import app.revanced.patcher.fingerprint.method.annotation.DirectPatternScanMethod
import app.revanced.patcher.fingerprint.method.annotation.MatchingMethod
import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint
import app.revanced.patches.youtube.misc.forcevp9.annotations.ForceVP9Compatibility
import org.jf.dexlib2.AccessFlags

@Name("force-vp9-codec-parent-fingerprint")
@MatchingMethod(
    "Lqaa;", "U"
)
@DirectPatternScanMethod
@ForceVP9Compatibility
@Version("0.0.1")
object ForceVP9ParentFingerprint : MethodFingerprint(
    "L", AccessFlags.PUBLIC or AccessFlags.STATIC, listOf(), null,
    listOf(
        "sys.display-size", "x"
    )
)