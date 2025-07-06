package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Xmpp: ImageVector
    get() {
        if (_Xmpp != null) {
            return _Xmpp!!
        }
        _Xmpp = ImageVector.Builder(
            name = "Xmpp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.4f)
                curveTo(9.75f, 13.09f, 8f, 9.54f, 8f, 6f)
                curveTo(2f, 4f, 8f, 6f, 2f, 4f)
                curveTo(2f, 9.65f, 6.33f, 14.11f, 10.55f, 16.66f)
                curveTo(9.38f, 17.5f, 8.15f, 18f, 7f, 18f)
                curveTo(7f, 19f, 7f, 18f, 7f, 19f)
                curveTo(8.2f, 19f, 10.03f, 18.46f, 12f, 17.46f)
                curveTo(13.97f, 18.46f, 15.8f, 19f, 17f, 19f)
                curveTo(17f, 18f, 17f, 19f, 17f, 18f)
                curveTo(15.85f, 18f, 14.62f, 17.5f, 13.45f, 16.66f)
                curveTo(17.66f, 14.11f, 22f, 9.65f, 22f, 4f)
                curveTo(16f, 6f, 22f, 4f, 16f, 6f)
                curveTo(16f, 9.54f, 14.25f, 13.09f, 12f, 15.4f)
                close()
            }
        }.build()

        return _Xmpp!!
    }

@Suppress("ObjectPropertyName")
private var _Xmpp: ImageVector? = null
