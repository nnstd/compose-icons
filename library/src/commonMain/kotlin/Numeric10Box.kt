package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric10Box: ImageVector
    get() {
        if (_Numeric10Box != null) {
            return _Numeric10Box!!
        }
        _Numeric10Box = ImageVector.Builder(
            name = "Numeric10Box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                moveTo(21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.11f, 20.11f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.9f, 21f, 5f)
                moveTo(10f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                moveTo(18f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 7f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                verticalLineTo(15f)
                curveTo(12f, 16.11f, 12.9f, 17f, 14f, 17f)
                horizontalLineTo(16f)
                curveTo(17.11f, 17f, 18f, 16.11f, 18f, 15f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Numeric10Box!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric10Box: ImageVector? = null
