package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Webrtc: ImageVector
    get() {
        if (_Webrtc != null) {
            return _Webrtc!!
        }
        _Webrtc = ImageVector.Builder(
            name = "Webrtc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(14.44f, 2f, 16.5f, 3.75f, 16.91f, 6.07f)
                lineTo(17.75f, 6f)
                curveTo(20.5f, 6f, 22.75f, 8.24f, 22.75f, 11f)
                curveTo(22.75f, 12.89f, 21.7f, 14.53f, 20.16f, 15.38f)
                curveTo(20.54f, 16.09f, 20.75f, 16.89f, 20.75f, 17.75f)
                curveTo(20.75f, 20.5f, 18.5f, 22.75f, 15.75f, 22.75f)
                curveTo(14.26f, 22.75f, 12.92f, 22.1f, 12f, 21.06f)
                curveTo(11.08f, 22.1f, 9.74f, 22.75f, 8.25f, 22.75f)
                curveTo(5.5f, 22.75f, 3.25f, 20.5f, 3.25f, 17.75f)
                curveTo(3.25f, 16.89f, 3.47f, 16.09f, 3.84f, 15.38f)
                curveTo(2.3f, 14.53f, 1.25f, 12.89f, 1.25f, 11f)
                curveTo(1.25f, 8.24f, 3.5f, 6f, 6.25f, 6f)
                lineTo(7.09f, 6.07f)
                curveTo(7.5f, 3.75f, 9.56f, 2f, 12f, 2f)
                moveTo(6.75f, 20.25f)
                lineTo(13.66f, 17f)
                horizontalLineTo(17f)
                curveTo(17.55f, 17f, 18f, 16.55f, 18f, 16f)
                verticalLineTo(9f)
                curveTo(18f, 8.45f, 17.55f, 8f, 17f, 8f)
                horizontalLineTo(7f)
                curveTo(6.45f, 8f, 6f, 8.45f, 6f, 9f)
                verticalLineTo(16f)
                curveTo(6f, 16.55f, 6.45f, 17f, 7f, 17f)
                horizontalLineTo(7.77f)
                lineTo(6.75f, 20.25f)
                close()
            }
        }.build()

        return _Webrtc!!
    }

@Suppress("ObjectPropertyName")
private var _Webrtc: ImageVector? = null
