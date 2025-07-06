package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableRowHeight: ImageVector
    get() {
        if (_TableRowHeight != null) {
            return _TableRowHeight!!
        }
        _TableRowHeight = ImageVector.Builder(
            name = "TableRowHeight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 19f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 17f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 5f)
                moveTo(3f, 9f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                moveTo(10f, 9f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                moveTo(3f, 14f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                moveTo(10f, 14f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                moveTo(23f, 14f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(23f)
                close()
            }
        }.build()

        return _TableRowHeight!!
    }

@Suppress("ObjectPropertyName")
private var _TableRowHeight: ImageVector? = null
