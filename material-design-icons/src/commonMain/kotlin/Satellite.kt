package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Satellite: ImageVector
    get() {
        if (_Satellite != null) {
            return _Satellite!!
        }
        _Satellite = ImageVector.Builder(
            name = "Satellite",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 18f)
                lineTo(8.5f, 13.5f)
                lineTo(11f, 16.5f)
                lineTo(14.5f, 12f)
                lineTo(19f, 18f)
                moveTo(5f, 12f)
                verticalLineTo(10f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 5f)
                horizontalLineTo(12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 12f)
                moveTo(5f, 5f)
                horizontalLineTo(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                close()
            }
        }.build()

        return _Satellite!!
    }

@Suppress("ObjectPropertyName")
private var _Satellite: ImageVector? = null
