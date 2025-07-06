package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockFast: ImageVector
    get() {
        if (_ClockFast != null) {
            return _ClockFast!!
        }
        _ClockFast = ImageVector.Builder(
            name = "ClockFast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 4f)
                moveTo(15f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 18f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 6f)
                moveTo(14f, 8f)
                horizontalLineTo(15.5f)
                verticalLineTo(11.78f)
                lineTo(17.83f, 14.11f)
                lineTo(16.77f, 15.17f)
                lineTo(14f, 12.4f)
                verticalLineTo(8f)
                moveTo(2f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16f)
                horizontalLineTo(5.83f)
                curveTo(6.14f, 16.71f, 6.54f, 17.38f, 7f, 18f)
                horizontalLineTo(2f)
                moveTo(3f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 11f)
                horizontalLineTo(5.05f)
                lineTo(5f, 12f)
                lineTo(5.05f, 13f)
                horizontalLineTo(3f)
                moveTo(4f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 6f)
                horizontalLineTo(7f)
                curveTo(6.54f, 6.62f, 6.14f, 7.29f, 5.83f, 8f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _ClockFast!!
    }

@Suppress("ObjectPropertyName")
private var _ClockFast: ImageVector? = null
