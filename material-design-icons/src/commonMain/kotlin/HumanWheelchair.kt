package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanWheelchair: ImageVector
    get() {
        if (_HumanWheelchair != null) {
            return _HumanWheelchair!!
        }
        _HumanWheelchair = ImageVector.Builder(
            name = "HumanWheelchair",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 4f)
                moveTo(5f, 7f)
                curveTo(3.89f, 7f, 3f, 7.89f, 3f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(22f)
                horizontalLineTo(8.61f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 17f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 10.95f)
                verticalLineTo(9f)
                curveTo(10f, 7.89f, 9.11f, 7f, 8f, 7f)
                moveTo(13f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(18.5f)
                lineTo(21.2f, 19.6f)
                lineTo(22.8f, 18.4f)
                lineTo(19.5f, 14f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                moveTo(12f, 12.23f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 22f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 17f)
                horizontalLineTo(16.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14.41f)
                close()
            }
        }.build()

        return _HumanWheelchair!!
    }

@Suppress("ObjectPropertyName")
private var _HumanWheelchair: ImageVector? = null
