package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VolumeVibrate: ImageVector
    get() {
        if (_VolumeVibrate != null) {
            return _VolumeVibrate!!
        }
        _VolumeVibrate = ImageVector.Builder(
            name = "VolumeVibrate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                lineTo(13f, 20f)
                verticalLineTo(4f)
                lineTo(8f, 9f)
                horizontalLineTo(4f)
                moveTo(16.55f, 2.47f)
                lineTo(15.5f, 3.53f)
                lineTo(17.93f, 6f)
                lineTo(15f, 9f)
                lineTo(17.93f, 12f)
                lineTo(15f, 15f)
                lineTo(17.93f, 18f)
                lineTo(15.5f, 20.47f)
                lineTo(16.55f, 21.53f)
                lineTo(20f, 18f)
                lineTo(17.07f, 15f)
                lineTo(20f, 12f)
                lineTo(17.07f, 9f)
                lineTo(20f, 6f)
                lineTo(16.55f, 2.47f)
                close()
            }
        }.build()

        return _VolumeVibrate!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeVibrate: ImageVector? = null
