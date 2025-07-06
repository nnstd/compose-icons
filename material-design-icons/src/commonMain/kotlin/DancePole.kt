package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DancePole: ImageVector
    get() {
        if (_DancePole != null) {
            return _DancePole!!
        }
        _DancePole = ImageVector.Builder(
            name = "DancePole",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                verticalLineTo(2f)
                lineTo(11.23f, 1.36f)
                lineTo(7.76f, 5.5f)
                lineTo(11f, 7.5f)
                verticalLineTo(5.16f)
                lineTo(10.78f, 5f)
                lineTo(12f, 3.56f)
                verticalLineTo(23f)
                horizontalLineTo(14f)
                verticalLineTo(13.24f)
                lineTo(15.93f, 11.31f)
                curveTo(18.5f, 11.71f, 21.13f, 10.36f, 22.66f, 8.83f)
                lineTo(21.24f, 7.41f)
                curveTo(20.1f, 8.56f, 17.7f, 9.61f, 16f, 9.26f)
                lineTo(14f, 7.24f)
                verticalLineTo(1f)
                moveTo(17f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 4f)
                moveTo(11f, 7.76f)
                lineTo(7.1f, 11.66f)
                curveTo(5.25f, 13.5f, 4.31f, 14.85f, 3.06f, 18.16f)
                lineTo(4.94f, 18.86f)
                curveTo(5.94f, 16.2f, 6.66f, 15.14f, 7.87f, 13.84f)
                lineTo(9.22f, 15.19f)
                lineTo(4.27f, 20.14f)
                lineTo(5.69f, 21.56f)
                lineTo(11f, 16.24f)
                close()
            }
        }.build()

        return _DancePole!!
    }

@Suppress("ObjectPropertyName")
private var _DancePole: ImageVector? = null
