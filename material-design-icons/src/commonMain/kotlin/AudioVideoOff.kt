package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AudioVideoOff: ImageVector
    get() {
        if (_AudioVideoOff != null) {
            return _AudioVideoOff!!
        }
        _AudioVideoOff = ImageVector.Builder(
            name = "AudioVideoOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(5.1f, 7f)
                horizontalLineTo(4f)
                curveTo(2.9f, 7f, 2f, 7.9f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 16.1f, 2.9f, 17f, 4f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                curveTo(5f, 18.6f, 5.4f, 19f, 6f, 19f)
                horizontalLineTo(8f)
                curveTo(8.6f, 19f, 9f, 18.6f, 9f, 18f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                curveTo(15f, 18.6f, 15.4f, 19f, 16f, 19f)
                horizontalLineTo(17.1f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(6f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                moveTo(4f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(8.1f)
                lineTo(10.1f, 12f)
                horizontalLineTo(4f)
                moveTo(10f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                moveTo(12f, 15f)
                verticalLineTo(14f)
                horizontalLineTo(12.1f)
                lineTo(13.1f, 15f)
                horizontalLineTo(12f)
                moveTo(14f, 10f)
                verticalLineTo(10.8f)
                lineTo(20.2f, 17f)
                curveTo(21.2f, 16.9f, 22f, 16.1f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 7.9f, 21.1f, 7f, 20f, 7f)
                horizontalLineTo(10.2f)
                lineTo(13.2f, 10f)
                horizontalLineTo(14f)
                moveTo(18f, 9f)
                curveTo(19.1f, 9f, 20f, 9.9f, 20f, 11f)
                reflectiveCurveTo(19.1f, 13f, 18f, 13f)
                reflectiveCurveTo(16f, 12.1f, 16f, 11f)
                reflectiveCurveTo(16.9f, 9f, 18f, 9f)
                close()
            }
        }.build()

        return _AudioVideoOff!!
    }

@Suppress("ObjectPropertyName")
private var _AudioVideoOff: ImageVector? = null
