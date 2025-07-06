package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Tram: ImageVector
    get() {
        if (_Tram != null) {
            return _Tram!!
        }
        _Tram = ImageVector.Builder(
            name = "Tram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 16.94f)
                verticalLineTo(8.5f)
                curveTo(19f, 5.71f, 16.39f, 5.1f, 13f, 5f)
                lineTo(13.75f, 3.5f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                verticalLineTo(3.5f)
                horizontalLineTo(11.75f)
                lineTo(11f, 5f)
                curveTo(7.86f, 5.11f, 5f, 5.73f, 5f, 8.5f)
                verticalLineTo(16.94f)
                curveTo(5f, 18.39f, 6.19f, 19.6f, 7.59f, 19.91f)
                lineTo(6f, 21.5f)
                verticalLineTo(22f)
                horizontalLineTo(8.23f)
                lineTo(10.23f, 20f)
                horizontalLineTo(14f)
                lineTo(16f, 22f)
                horizontalLineTo(18f)
                verticalLineTo(21.5f)
                lineTo(16.5f, 20f)
                horizontalLineTo(16.42f)
                curveTo(18.11f, 20f, 19f, 18.63f, 19f, 16.94f)
                moveTo(12f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18.5f)
                moveTo(17f, 14f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _Tram!!
    }

@Suppress("ObjectPropertyName")
private var _Tram: ImageVector? = null
