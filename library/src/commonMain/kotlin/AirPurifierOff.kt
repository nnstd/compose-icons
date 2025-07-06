package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirPurifierOff: ImageVector
    get() {
        if (_AirPurifierOff != null) {
            return _AirPurifierOff!!
        }
        _AirPurifierOff = ImageVector.Builder(
            name = "AirPurifierOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11f)
                curveTo(18.6f, 11f, 18.5f, 12.9f, 16.2f, 13f)
                lineTo(16f, 12.8f)
                verticalLineTo(11f)
                curveTo(18.5f, 11f, 18.5f, 9f, 21f, 9f)
                verticalLineTo(11f)
                moveTo(22.1f, 21.5f)
                lineTo(20.8f, 22.8f)
                lineTo(18f, 19.9f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                curveTo(3f, 7.1f, 3.3f, 6.3f, 3.8f, 5.7f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.5f)
                moveTo(9f, 13f)
                curveTo(9f, 14.1f, 9.9f, 15f, 11f, 15f)
                curveTo(11.6f, 15f, 12.1f, 14.7f, 12.5f, 14.4f)
                lineTo(9.7f, 11.6f)
                curveTo(9.3f, 11.9f, 9f, 12.4f, 9f, 13f)
                moveTo(16f, 17.9f)
                lineTo(13.9f, 15.8f)
                curveTo(13.2f, 16.5f, 12.1f, 17f, 11f, 17f)
                curveTo(8.8f, 17f, 7f, 15.2f, 7f, 13f)
                curveTo(7f, 11.9f, 7.5f, 10.8f, 8.2f, 10.1f)
                lineTo(5.2f, 7.1f)
                curveTo(5.1f, 7.4f, 5f, 7.7f, 5f, 8f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(17.9f)
                moveTo(21f, 15f)
                verticalLineTo(13f)
                curveTo(19.3f, 13f, 18.7f, 14f, 17.7f, 14.5f)
                lineTo(18.8f, 15.6f)
                curveTo(19.4f, 15.3f, 20f, 15f, 21f, 15f)
                moveTo(14f, 6f)
                curveTo(15.1f, 6f, 16f, 6.9f, 16f, 8f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                curveTo(18f, 5.8f, 16.2f, 4f, 14f, 4f)
                horizontalLineTo(7.2f)
                lineTo(9.2f, 6f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _AirPurifierOff!!
    }

@Suppress("ObjectPropertyName")
private var _AirPurifierOff: ImageVector? = null
