package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirConditioner: ImageVector
    get() {
        if (_AirConditioner != null) {
            return _AirConditioner!!
        }
        _AirConditioner = ImageVector.Builder(
            name = "AirConditioner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.59f, 0.66f)
                curveTo(8.93f, -1.15f, 11.47f, 1.06f, 12.04f, 4.5f)
                curveTo(12.47f, 4.5f, 12.89f, 4.62f, 13.27f, 4.84f)
                curveTo(13.79f, 4.24f, 14.25f, 3.42f, 14.07f, 2.5f)
                curveTo(13.65f, 0.35f, 16.06f, -1.39f, 18.35f, 1.58f)
                curveTo(20.16f, 3.92f, 17.95f, 6.46f, 14.5f, 7.03f)
                curveTo(14.5f, 7.46f, 14.39f, 7.89f, 14.16f, 8.27f)
                curveTo(14.76f, 8.78f, 15.58f, 9.24f, 16.5f, 9.06f)
                curveTo(18.63f, 8.64f, 20.38f, 11.04f, 17.41f, 13.34f)
                curveTo(15.07f, 15.15f, 12.53f, 12.94f, 11.96f, 9.5f)
                curveTo(11.53f, 9.5f, 11.11f, 9.37f, 10.74f, 9.15f)
                curveTo(10.22f, 9.75f, 9.75f, 10.58f, 9.93f, 11.5f)
                curveTo(10.35f, 13.64f, 7.94f, 15.39f, 5.65f, 12.42f)
                curveTo(3.83f, 10.07f, 6.05f, 7.53f, 9.5f, 6.97f)
                curveTo(9.5f, 6.54f, 9.63f, 6.12f, 9.85f, 5.74f)
                curveTo(9.25f, 5.23f, 8.43f, 4.76f, 7.5f, 4.94f)
                curveTo(5.37f, 5.36f, 3.62f, 2.96f, 6.59f, 0.66f)
                moveTo(5f, 16f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 18f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(24f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 16f)
                moveTo(5f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                moveTo(12.93f, 16f)
                horizontalLineTo(15f)
                lineTo(12.07f, 24f)
                horizontalLineTo(10f)
                lineTo(12.93f, 16f)
                moveTo(18f, 16f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(21f)
                verticalLineTo(24f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 22f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 16f)
                close()
            }
        }.build()

        return _AirConditioner!!
    }

@Suppress("ObjectPropertyName")
private var _AirConditioner: ImageVector? = null
