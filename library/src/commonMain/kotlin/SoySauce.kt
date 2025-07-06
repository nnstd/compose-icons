package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SoySauce: ImageVector
    get() {
        if (_SoySauce != null) {
            return _SoySauce!!
        }
        _SoySauce = ImageVector.Builder(
            name = "SoySauce",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.9f, 7.5f)
                curveTo(13.9f, 6.8f, 14.1f, 6.3f, 14.2f, 6f)
                horizontalLineTo(14.8f)
                lineTo(15.7f, 3.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(2f)
                horizontalLineTo(7.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(8.3f)
                lineTo(9.2f, 6f)
                horizontalLineTo(9.8f)
                curveTo(10f, 6.3f, 10.1f, 6.8f, 10.1f, 7.5f)
                curveTo(10.1f, 8.8f, 6f, 13.7f, 6f, 17.6f)
                verticalLineTo(19.6f)
                curveTo(6f, 21f, 8.7f, 21.9f, 12f, 21.9f)
                curveTo(15.3f, 21.9f, 18f, 21f, 18f, 19.6f)
                verticalLineTo(17.6f)
                curveTo(18f, 13.7f, 13.9f, 8.8f, 13.9f, 7.5f)
                moveTo(12f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                close()
            }
        }.build()

        return _SoySauce!!
    }

@Suppress("ObjectPropertyName")
private var _SoySauce: ImageVector? = null
