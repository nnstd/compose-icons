package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ip: ImageVector
    get() {
        if (_Ip != null) {
            return _Ip!!
        }
        _Ip = ImageVector.Builder(
            name = "Ip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 11f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                moveTo(3f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                moveTo(10f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                moveTo(12f, 17f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 11f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 7f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Ip!!
    }

@Suppress("ObjectPropertyName")
private var _Ip: ImageVector? = null
