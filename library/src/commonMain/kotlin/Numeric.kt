package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric: ImageVector
    get() {
        if (_Numeric != null) {
            return _Numeric!!
        }
        _Numeric = ImageVector.Builder(
            name = "Numeric",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 17f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                moveTo(22f, 15f)
                curveTo(22f, 16.11f, 21.1f, 17f, 20f, 17f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 9f)
                verticalLineTo(10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 13.5f)
                verticalLineTo(15f)
                moveTo(14f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                curveTo(8f, 11.89f, 8.9f, 11f, 10f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 9f)
                verticalLineTo(11f)
                curveTo(14f, 12.11f, 13.1f, 13f, 12f, 13f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _Numeric!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric: ImageVector? = null
