package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThermometerMinus: ImageVector
    get() {
        if (_ThermometerMinus != null) {
            return _ThermometerMinus!!
        }
        _ThermometerMinus = ImageVector.Builder(
            name = "ThermometerMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 11f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                moveTo(11f, 13f)
                verticalLineTo(5f)
                curveTo(11f, 3.34f, 9.66f, 2f, 8f, 2f)
                reflectiveCurveTo(5f, 3.34f, 5f, 5f)
                verticalLineTo(13f)
                curveTo(2.79f, 14.66f, 2.34f, 17.79f, 4f, 20f)
                reflectiveCurveTo(8.79f, 22.66f, 11f, 21f)
                reflectiveCurveTo(13.66f, 16.21f, 12f, 14f)
                curveTo(11.72f, 13.62f, 11.38f, 13.28f, 11f, 13f)
                moveTo(8f, 4f)
                curveTo(8.55f, 4f, 9f, 4.45f, 9f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                curveTo(7f, 4.45f, 7.45f, 4f, 8f, 4f)
                close()
            }
        }.build()

        return _ThermometerMinus!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerMinus: ImageVector? = null
