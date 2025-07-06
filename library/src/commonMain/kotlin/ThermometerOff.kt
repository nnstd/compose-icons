package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThermometerOff: ImageVector
    get() {
        if (_ThermometerOff != null) {
            return _ThermometerOff!!
        }
        _ThermometerOff = ImageVector.Builder(
            name = "ThermometerOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 7.8f)
                lineTo(9f, 5.8f)
                verticalLineTo(5f)
                curveTo(9f, 3.34f, 10.34f, 2f, 12f, 2f)
                reflectiveCurveTo(15f, 3.34f, 15f, 5f)
                verticalLineTo(11.8f)
                lineTo(11.2f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                curveTo(13f, 4.45f, 12.55f, 4f, 12f, 4f)
                reflectiveCurveTo(11f, 4.45f, 11f, 5f)
                verticalLineTo(7.8f)
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(9f, 10.89f)
                verticalLineTo(13f)
                curveTo(6.79f, 14.66f, 6.34f, 17.79f, 8f, 20f)
                curveTo(9.66f, 22.21f, 12.79f, 22.66f, 15f, 21f)
                curveTo(15.84f, 20.37f, 16.4f, 19.5f, 16.71f, 18.6f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                close()
            }
        }.build()

        return _ThermometerOff!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerOff: ImageVector? = null
