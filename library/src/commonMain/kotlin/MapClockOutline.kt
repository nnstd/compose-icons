package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapClockOutline: ImageVector
    get() {
        if (_MapClockOutline != null) {
            return _MapClockOutline!!
        }
        _MapClockOutline = ImageVector.Builder(
            name = "MapClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 12f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15f, 17f)
                verticalLineTo(12f)
                moveTo(16f, 9f)
                curveTo(16.69f, 9f, 17.37f, 9.1f, 18f, 9.29f)
                verticalLineTo(4.7f)
                lineTo(15f, 5.86f)
                verticalLineTo(9.07f)
                curveTo(15.33f, 9f, 15.66f, 9f, 16f, 9f)
                moveTo(23f, 16f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 23f)
                curveTo(13f, 23f, 10.4f, 21.08f, 9.42f, 18.4f)
                lineTo(8f, 17.9f)
                lineTo(2.66f, 19.97f)
                lineTo(2.5f, 20f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19.5f)
                verticalLineTo(4.38f)
                curveTo(2f, 4.15f, 2.15f, 3.97f, 2.36f, 3.9f)
                lineTo(8f, 2f)
                lineTo(14f, 4.1f)
                lineTo(19.34f, 2.03f)
                lineTo(19.5f, 2f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 2.5f)
                verticalLineTo(10.25f)
                curveTo(21.81f, 11.5f, 23f, 13.62f, 23f, 16f)
                moveTo(9f, 16f)
                curveTo(9f, 13.21f, 10.63f, 10.8f, 13f, 9.67f)
                verticalLineTo(5.87f)
                lineTo(9f, 4.47f)
                verticalLineTo(16.13f)
                horizontalLineTo(9f)
                curveTo(9f, 16.09f, 9f, 16.04f, 9f, 16f)
                moveTo(16f, 11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 21f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 11f)
                moveTo(4f, 5.46f)
                verticalLineTo(17.31f)
                lineTo(7f, 16.15f)
                verticalLineTo(4.45f)
                lineTo(4f, 5.46f)
                close()
            }
        }.build()

        return _MapClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MapClockOutline: ImageVector? = null
