package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableRowRemove: ImageVector
    get() {
        if (_TableRowRemove != null) {
            return _TableRowRemove!!
        }
        _TableRowRemove = ImageVector.Builder(
            name = "TableRowRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.41f, 13f)
                lineTo(12f, 15.59f)
                lineTo(14.59f, 13f)
                lineTo(16f, 14.41f)
                lineTo(13.41f, 17f)
                lineTo(16f, 19.59f)
                lineTo(14.59f, 21f)
                lineTo(12f, 18.41f)
                lineTo(9.41f, 21f)
                lineTo(8f, 19.59f)
                lineTo(10.59f, 17f)
                lineTo(8f, 14.41f)
                lineTo(9.41f, 13f)
                moveTo(22f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 11f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 9f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(9f)
                moveTo(4f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                moveTo(10f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                moveTo(16f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _TableRowRemove!!
    }

@Suppress("ObjectPropertyName")
private var _TableRowRemove: ImageVector? = null
