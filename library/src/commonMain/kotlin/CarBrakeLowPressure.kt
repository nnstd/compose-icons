package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarBrakeLowPressure: ImageVector
    get() {
        if (_CarBrakeLowPressure != null) {
            return _CarBrakeLowPressure!!
        }
        _CarBrakeLowPressure = ImageVector.Builder(
            name = "CarBrakeLowPressure",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 12f)
                curveTo(13f, 12.55f, 12.55f, 13f, 12f, 13f)
                reflectiveCurveTo(11f, 12.55f, 11f, 12f)
                reflectiveCurveTo(11.45f, 11f, 12f, 11f)
                reflectiveCurveTo(13f, 11.45f, 13f, 12f)
                moveTo(10f, 12f)
                lineTo(7f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                lineTo(10f, 12f)
                moveTo(14f, 12f)
                lineTo(17f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                lineTo(14f, 12f)
                moveTo(20.5f, 3.5f)
                lineTo(19.42f, 4.58f)
                curveTo(21.32f, 6.5f, 22.5f, 9.11f, 22.5f, 12f)
                curveTo(22.5f, 14.9f, 21.32f, 17.5f, 19.42f, 19.42f)
                lineTo(20.5f, 20.5f)
                curveTo(22.66f, 18.31f, 24f, 15.31f, 24f, 12f)
                reflectiveCurveTo(22.66f, 5.69f, 20.5f, 3.5f)
                moveTo(5.69f, 9f)
                curveTo(6.81f, 6.64f, 9.22f, 5f, 12f, 5f)
                reflectiveCurveTo(17.19f, 6.64f, 18.32f, 9f)
                horizontalLineTo(20.5f)
                curveTo(19.24f, 5.5f, 15.92f, 3f, 12f, 3f)
                reflectiveCurveTo(4.76f, 5.5f, 3.5f, 9f)
                horizontalLineTo(5.69f)
                moveTo(4.58f, 4.58f)
                lineTo(3.5f, 3.5f)
                curveTo(1.34f, 5.69f, 0f, 8.69f, 0f, 12f)
                reflectiveCurveTo(1.34f, 18.31f, 3.5f, 20.5f)
                lineTo(4.58f, 19.42f)
                curveTo(2.68f, 17.5f, 1.5f, 14.9f, 1.5f, 12f)
                curveTo(1.5f, 9.11f, 2.68f, 6.5f, 4.58f, 4.58f)
                moveTo(18.32f, 15f)
                curveTo(17.19f, 17.36f, 14.79f, 19f, 12f, 19f)
                reflectiveCurveTo(6.81f, 17.36f, 5.69f, 15f)
                horizontalLineTo(3.5f)
                curveTo(4.76f, 18.5f, 8.08f, 21f, 12f, 21f)
                reflectiveCurveTo(19.24f, 18.5f, 20.5f, 15f)
                horizontalLineTo(18.32f)
                close()
            }
        }.build()

        return _CarBrakeLowPressure!!
    }

@Suppress("ObjectPropertyName")
private var _CarBrakeLowPressure: ImageVector? = null
