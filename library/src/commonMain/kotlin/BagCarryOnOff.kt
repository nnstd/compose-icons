package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BagCarryOnOff: ImageVector
    get() {
        if (_BagCarryOnOff != null) {
            return _BagCarryOnOff!!
        }
        _BagCarryOnOff = ImageVector.Builder(
            name = "BagCarryOnOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.1f, 4.9f)
                lineTo(6f, 8.9f)
                verticalLineTo(19f)
                curveTo(6f, 19.5f, 6.2f, 20f, 6.6f, 20.4f)
                curveTo(7f, 20.8f, 7.5f, 21f, 8f, 21f)
                verticalLineTo(10.8f)
                lineTo(9f, 11.8f)
                verticalLineTo(21f)
                horizontalLineTo(13.2f)
                curveTo(13.1f, 20.6f, 13f, 20.2f, 13f, 20f)
                curveTo(13f, 18.8f, 13.5f, 18f, 14.6f, 17.4f)
                lineTo(15.4f, 18.2f)
                curveTo(14.5f, 18.5f, 14.1f, 19.2f, 14.1f, 20.1f)
                curveTo(14.1f, 20.6f, 14.3f, 21.1f, 14.7f, 21.5f)
                curveTo(15f, 21.8f, 15.5f, 22f, 16f, 22f)
                curveTo(16.9f, 22f, 17.6f, 21.6f, 17.9f, 20.7f)
                lineTo(19.1f, 21.9f)
                lineTo(20.5f, 20.5f)
                lineTo(3.5f, 3.5f)
                lineTo(2.1f, 4.9f)
                moveTo(12f, 2f)
                curveTo(12f, 2.5f, 12.2f, 3f, 12.6f, 3.4f)
                reflectiveCurveTo(13.5f, 4f, 14f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(9.8f)
                lineTo(16f, 13.2f)
                verticalLineTo(2f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _BagCarryOnOff!!
    }

@Suppress("ObjectPropertyName")
private var _BagCarryOnOff: ImageVector? = null
