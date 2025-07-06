package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Nas: ImageVector
    get() {
        if (_Nas != null) {
            return _Nas!!
        }
        _Nas = ImageVector.Builder(
            name = "Nas",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 5f)
                curveTo(2.89f, 5f, 2f, 5.89f, 2f, 7f)
                verticalLineTo(17f)
                curveTo(2f, 18.11f, 2.89f, 19f, 4f, 19f)
                horizontalLineTo(20f)
                curveTo(21.11f, 19f, 22f, 18.11f, 22f, 17f)
                verticalLineTo(7f)
                curveTo(22f, 5.89f, 21.11f, 5f, 20f, 5f)
                horizontalLineTo(4f)
                moveTo(4.5f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 7f)
                moveTo(7f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                moveTo(8f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                moveTo(12f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                moveTo(16f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                moveTo(9f, 9f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                moveTo(13f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                moveTo(17f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Nas!!
    }

@Suppress("ObjectPropertyName")
private var _Nas: ImageVector? = null
