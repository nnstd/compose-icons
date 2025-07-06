package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GasStation: ImageVector
    get() {
        if (_GasStation != null) {
            return _GasStation!!
        }
        _GasStation = ImageVector.Builder(
            name = "GasStation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10f)
                moveTo(12f, 10f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                moveTo(19.77f, 7.23f)
                lineTo(19.78f, 7.22f)
                lineTo(16.06f, 3.5f)
                lineTo(15f, 4.56f)
                lineTo(17.11f, 6.67f)
                curveTo(16.17f, 7f, 15.5f, 7.93f, 15.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 11.5f)
                curveTo(18.36f, 11.5f, 18.69f, 11.42f, 19f, 11.29f)
                verticalLineTo(18.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 19.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 18.5f)
                verticalLineTo(14f)
                curveTo(17f, 12.89f, 16.1f, 12f, 15f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                curveTo(14f, 3.89f, 13.1f, 3f, 12f, 3f)
                horizontalLineTo(6f)
                curveTo(4.89f, 3f, 4f, 3.89f, 4f, 5f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                verticalLineTo(13.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(18.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 21f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 18.5f)
                verticalLineTo(9f)
                curveTo(20.5f, 8.31f, 20.22f, 7.68f, 19.77f, 7.23f)
                close()
            }
        }.build()

        return _GasStation!!
    }

@Suppress("ObjectPropertyName")
private var _GasStation: ImageVector? = null
