package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneLock: ImageVector
    get() {
        if (_CellphoneLock != null) {
            return _CellphoneLock!!
        }
        _CellphoneLock = ImageVector.Builder(
            name = "CellphoneLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 1f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 23f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 21f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 1f)
                moveTo(8.8f, 11f)
                verticalLineTo(9.5f)
                curveTo(8.8f, 8.1f, 7.4f, 7f, 6f, 7f)
                curveTo(4.6f, 7f, 3.2f, 8.1f, 3.2f, 9.5f)
                verticalLineTo(11f)
                curveTo(2.6f, 11f, 2f, 11.6f, 2f, 12.2f)
                verticalLineTo(15.7f)
                curveTo(2f, 16.4f, 2.6f, 17f, 3.2f, 17f)
                horizontalLineTo(8.7f)
                curveTo(9.4f, 17f, 10f, 16.4f, 10f, 15.8f)
                verticalLineTo(12.3f)
                curveTo(10f, 11.6f, 9.4f, 11f, 8.8f, 11f)
                moveTo(7.5f, 11f)
                horizontalLineTo(4.5f)
                verticalLineTo(9.5f)
                curveTo(4.5f, 8.7f, 5.2f, 8.2f, 6f, 8.2f)
                curveTo(6.8f, 8.2f, 7.5f, 8.7f, 7.5f, 9.5f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _CellphoneLock!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneLock: ImageVector? = null
