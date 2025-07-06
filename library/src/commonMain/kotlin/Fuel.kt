package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Fuel: ImageVector
    get() {
        if (_Fuel != null) {
            return _Fuel!!
        }
        _Fuel = ImageVector.Builder(
            name = "Fuel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 2f)
                horizontalLineTo(6f)
                curveTo(6.28f, 2f, 6.53f, 2.11f, 6.71f, 2.29f)
                lineTo(8.79f, 4.38f)
                lineTo(9.59f, 3.59f)
                curveTo(10f, 3.2f, 10.5f, 3f, 11f, 3f)
                horizontalLineTo(17f)
                curveTo(17.5f, 3f, 18f, 3.2f, 18.41f, 3.59f)
                lineTo(19.41f, 4.59f)
                curveTo(19.8f, 5f, 20f, 5.5f, 20f, 6f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 21f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 19f)
                verticalLineTo(13f)
                lineTo(6f, 12f)
                verticalLineTo(8f)
                curveTo(6f, 7.5f, 6.2f, 7f, 6.59f, 6.59f)
                lineTo(7.38f, 5.79f)
                lineTo(5.59f, 4f)
                horizontalLineTo(3f)
                verticalLineTo(2f)
                moveTo(11f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                moveTo(11.41f, 11f)
                lineTo(9.41f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(10.41f)
                lineTo(10f, 12.41f)
                verticalLineTo(15.59f)
                lineTo(8f, 17.59f)
                verticalLineTo(19f)
                horizontalLineTo(9.41f)
                lineTo(11.41f, 17f)
                horizontalLineTo(14.59f)
                lineTo(16.59f, 19f)
                horizontalLineTo(18f)
                verticalLineTo(17.59f)
                lineTo(16f, 15.59f)
                verticalLineTo(12.41f)
                lineTo(18f, 10.41f)
                verticalLineTo(9f)
                horizontalLineTo(16.59f)
                lineTo(14.59f, 11f)
                horizontalLineTo(11.41f)
                moveTo(12f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Fuel!!
    }

@Suppress("ObjectPropertyName")
private var _Fuel: ImageVector? = null
