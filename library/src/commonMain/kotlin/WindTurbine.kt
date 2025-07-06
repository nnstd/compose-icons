package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WindTurbine: ImageVector
    get() {
        if (_WindTurbine != null) {
            return _WindTurbine!!
        }
        _WindTurbine = ImageVector.Builder(
            name = "WindTurbine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.33f, 11.67f)
                lineTo(16.21f, 14.58f)
                curveTo(17.62f, 13.16f, 16.21f, 11.75f, 16.21f, 11.75f)
                lineTo(14.72f, 10.24f)
                curveTo(14.9f, 9.86f, 15f, 9.44f, 15f, 9f)
                curveTo(15f, 7.95f, 14.46f, 7.03f, 13.64f, 6.5f)
                lineTo(15f, 2.11f)
                curveTo(13.09f, 1.53f, 12.5f, 3.44f, 12.5f, 3.44f)
                lineTo(11.69f, 6.03f)
                curveTo(10.46f, 6.16f, 9.46f, 7f, 9.13f, 8.18f)
                lineTo(4.67f, 9.63f)
                curveTo(5.31f, 11.53f, 7.2f, 10.9f, 7.2f, 10.9f)
                lineTo(9.27f, 10.23f)
                curveTo(9.61f, 10.97f, 10.23f, 11.54f, 11f, 11.82f)
                verticalLineTo(19f)
                curveTo(11f, 19f, 9f, 19f, 9f, 21f)
                curveTo(9f, 21.5f, 9f, 21.81f, 9f, 22f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                curveTo(15f, 21f, 15f, 19f, 13f, 19f)
                verticalLineTo(11.82f)
                curveTo(13.12f, 11.78f, 13.23f, 11.72f, 13.33f, 11.67f)
                moveTo(10.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 9f)
                close()
            }
        }.build()

        return _WindTurbine!!
    }

@Suppress("ObjectPropertyName")
private var _WindTurbine: ImageVector? = null
