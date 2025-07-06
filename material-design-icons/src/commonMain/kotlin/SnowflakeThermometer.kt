package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SnowflakeThermometer: ImageVector
    get() {
        if (_SnowflakeThermometer != null) {
            return _SnowflakeThermometer!!
        }
        _SnowflakeThermometer = ImageVector.Builder(
            name = "SnowflakeThermometer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.46f, 9.41f)
                lineTo(11f, 7.38f)
                verticalLineTo(5.12f)
                lineTo(12.71f, 3.41f)
                lineTo(11.29f, 2f)
                lineTo(10f, 3.29f)
                lineTo(8.71f, 2f)
                lineTo(7.29f, 3.41f)
                lineTo(9f, 5.12f)
                verticalLineTo(7.38f)
                lineTo(6.5f, 8.82f)
                lineTo(4.5f, 7.69f)
                lineTo(3.92f, 5.36f)
                lineTo(2f, 5.88f)
                lineTo(2.47f, 7.65f)
                lineTo(0.7f, 8.12f)
                lineTo(1.22f, 10.05f)
                lineTo(3.55f, 9.43f)
                lineTo(5.55f, 10.56f)
                verticalLineTo(13.45f)
                lineTo(3.55f, 14.58f)
                lineTo(1.22f, 13.96f)
                lineTo(0.7f, 15.89f)
                lineTo(2.47f, 16.36f)
                lineTo(2f, 18.12f)
                lineTo(3.93f, 18.64f)
                lineTo(4.55f, 16.31f)
                lineTo(6.55f, 15.18f)
                lineTo(9f, 16.62f)
                verticalLineTo(18.88f)
                lineTo(7.29f, 20.59f)
                lineTo(8.71f, 22f)
                lineTo(10f, 20.71f)
                lineTo(11.29f, 22f)
                lineTo(12.7f, 20.59f)
                lineTo(11f, 18.88f)
                verticalLineTo(16.62f)
                lineTo(14.46f, 14.61f)
                moveTo(7.5f, 10.56f)
                lineTo(10f, 9.11f)
                lineTo(12.5f, 10.56f)
                verticalLineTo(13.44f)
                lineTo(10f, 14.89f)
                lineTo(7.5f, 13.44f)
                moveTo(19f, 5f)
                curveTo(17.89f, 5f, 17f, 5.89f, 17f, 7f)
                verticalLineTo(13.76f)
                curveTo(16.36f, 14.33f, 16f, 15.15f, 16f, 16f)
                curveTo(16f, 17.66f, 17.34f, 19f, 19f, 19f)
                reflectiveCurveTo(22f, 17.66f, 22f, 16f)
                curveTo(22f, 15.15f, 21.64f, 14.33f, 21f, 13.77f)
                verticalLineTo(7f)
                curveTo(21f, 5.89f, 20.11f, 5f, 19f, 5f)
                moveTo(19f, 6f)
                curveTo(19.55f, 6f, 20f, 6.45f, 20f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                curveTo(18f, 6.45f, 18.45f, 6f, 19f, 6f)
            }
        }.build()

        return _SnowflakeThermometer!!
    }

@Suppress("ObjectPropertyName")
private var _SnowflakeThermometer: ImageVector? = null
