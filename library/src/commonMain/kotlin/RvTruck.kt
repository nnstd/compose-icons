package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RvTruck: ImageVector
    get() {
        if (_RvTruck != null) {
            return _RvTruck!!
        }
        _RvTruck = ImageVector.Builder(
            name = "RvTruck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                lineTo(20f, 4f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 6f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 17f)
                horizontalLineTo(4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 17f)
                horizontalLineTo(15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(12f)
                moveTo(7f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 18.5f)
                moveTo(9f, 12f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                moveTo(14f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                moveTo(18f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19.5f, 17f)
                arcTo(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 18.5f)
                moveTo(17f, 12f)
                verticalLineTo(9.5f)
                horizontalLineTo(19.5f)
                lineTo(21.5f, 12f)
                close()
            }
        }.build()

        return _RvTruck!!
    }

@Suppress("ObjectPropertyName")
private var _RvTruck: ImageVector? = null
