package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VolumeOff: ImageVector
    get() {
        if (_VolumeOff != null) {
            return _VolumeOff!!
        }
        _VolumeOff = ImageVector.Builder(
            name = "VolumeOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                lineTo(9.91f, 6.09f)
                lineTo(12f, 8.18f)
                moveTo(4.27f, 3f)
                lineTo(3f, 4.27f)
                lineTo(7.73f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                lineTo(12f, 20f)
                verticalLineTo(13.27f)
                lineTo(16.25f, 17.53f)
                curveTo(15.58f, 18.04f, 14.83f, 18.46f, 14f, 18.7f)
                verticalLineTo(20.77f)
                curveTo(15.38f, 20.45f, 16.63f, 19.82f, 17.68f, 18.96f)
                lineTo(19.73f, 21f)
                lineTo(21f, 19.73f)
                lineTo(12f, 10.73f)
                moveTo(19f, 12f)
                curveTo(19f, 12.94f, 18.8f, 13.82f, 18.46f, 14.64f)
                lineTo(19.97f, 16.15f)
                curveTo(20.62f, 14.91f, 21f, 13.5f, 21f, 12f)
                curveTo(21f, 7.72f, 18f, 4.14f, 14f, 3.23f)
                verticalLineTo(5.29f)
                curveTo(16.89f, 6.15f, 19f, 8.83f, 19f, 12f)
                moveTo(16.5f, 12f)
                curveTo(16.5f, 10.23f, 15.5f, 8.71f, 14f, 7.97f)
                verticalLineTo(10.18f)
                lineTo(16.45f, 12.63f)
                curveTo(16.5f, 12.43f, 16.5f, 12.21f, 16.5f, 12f)
                close()
            }
        }.build()

        return _VolumeOff!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeOff: ImageVector? = null
