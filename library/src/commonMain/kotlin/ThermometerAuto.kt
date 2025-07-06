package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThermometerAuto: ImageVector
    get() {
        if (_ThermometerAuto != null) {
            return _ThermometerAuto!!
        }
        _ThermometerAuto = ImageVector.Builder(
            name = "ThermometerAuto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                curveTo(11.7f, 13.6f, 11.4f, 13.3f, 11f, 13f)
                verticalLineTo(5f)
                curveTo(11f, 3.3f, 9.7f, 2f, 8f, 2f)
                reflectiveCurveTo(5f, 3.3f, 5f, 5f)
                verticalLineTo(13f)
                curveTo(2.8f, 14.7f, 2.3f, 17.8f, 4f, 20f)
                reflectiveCurveTo(8.8f, 22.7f, 11f, 21f)
                reflectiveCurveTo(13.7f, 16.2f, 12f, 14f)
                moveTo(9f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                curveTo(7f, 4.5f, 7.5f, 4f, 8f, 4f)
                reflectiveCurveTo(9f, 4.5f, 9f, 5f)
                verticalLineTo(8f)
                moveTo(18f, 3f)
                horizontalLineTo(16f)
                lineTo(12.8f, 12f)
                horizontalLineTo(14.7f)
                lineTo(15.4f, 10f)
                horizontalLineTo(18.6f)
                lineTo(19.3f, 12f)
                horizontalLineTo(21.2f)
                lineTo(18f, 3f)
                moveTo(15.8f, 8.7f)
                lineTo(17f, 5f)
                lineTo(18.2f, 8.7f)
                horizontalLineTo(15.8f)
                close()
            }
        }.build()

        return _ThermometerAuto!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerAuto: ImageVector? = null
