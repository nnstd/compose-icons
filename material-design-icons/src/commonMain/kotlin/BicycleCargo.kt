package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BicycleCargo: ImageVector
    get() {
        if (_BicycleCargo != null) {
            return _BicycleCargo!!
        }
        _BicycleCargo = ImageVector.Builder(
            name = "BicycleCargo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11.5f)
                verticalLineTo(10f)
                lineTo(13.5f, 9f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(6.5f)
                horizontalLineTo(12f)
                verticalLineTo(14.3f)
                horizontalLineTo(11f)
                lineTo(9f, 10f)
                curveTo(9.3f, 9.9f, 9.5f, 9.6f, 9.5f, 9.3f)
                curveTo(9.5f, 8.9f, 9.2f, 8.5f, 8.8f, 8.5f)
                horizontalLineTo(6.8f)
                curveTo(6.3f, 8.5f, 6f, 8.8f, 6f, 9.2f)
                reflectiveCurveTo(6.3f, 10f, 6.8f, 10f)
                horizontalLineTo(7.4f)
                lineTo(9.4f, 14.2f)
                horizontalLineTo(7.9f)
                curveTo(7.6f, 12.4f, 6f, 11f, 4f, 11f)
                curveTo(1.8f, 11f, 0f, 12.8f, 0f, 15f)
                reflectiveCurveTo(1.8f, 19f, 4f, 19f)
                curveTo(6f, 19f, 7.6f, 17.6f, 7.9f, 15.8f)
                horizontalLineTo(16.5f)
                curveTo(16.7f, 13.4f, 18.6f, 11.5f, 21f, 11.5f)
                moveTo(6.4f, 15.8f)
                curveTo(6.1f, 16.8f, 5.1f, 17.6f, 4f, 17.6f)
                curveTo(2.6f, 17.6f, 1.5f, 16.5f, 1.5f, 15.1f)
                reflectiveCurveTo(2.6f, 12.6f, 4f, 12.6f)
                curveTo(5.1f, 12.6f, 6.1f, 13.3f, 6.4f, 14.4f)
                horizontalLineTo(4f)
                verticalLineTo(15.9f)
                horizontalLineTo(6.4f)
                moveTo(21f, 13f)
                curveTo(19.3f, 13f, 18f, 14.3f, 18f, 16f)
                reflectiveCurveTo(19.3f, 19f, 21f, 19f)
                reflectiveCurveTo(24f, 17.7f, 24f, 16f)
                reflectiveCurveTo(22.7f, 13f, 21f, 13f)
                moveTo(21f, 17.5f)
                curveTo(20.2f, 17.5f, 19.5f, 16.8f, 19.5f, 16f)
                reflectiveCurveTo(20.2f, 14.5f, 21f, 14.5f)
                reflectiveCurveTo(22.5f, 15.2f, 22.5f, 16f)
                reflectiveCurveTo(21.8f, 17.5f, 21f, 17.5f)
                close()
            }
        }.build()

        return _BicycleCargo!!
    }

@Suppress("ObjectPropertyName")
private var _BicycleCargo: ImageVector? = null
