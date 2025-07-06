package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableColumnRemove: ImageVector
    get() {
        if (_TableColumnRemove != null) {
            return _TableColumnRemove!!
        }
        _TableColumnRemove = ImageVector.Builder(
            name = "TableColumnRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                horizontalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                moveTo(4f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                moveTo(4f, 16f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                moveTo(4f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                moveTo(17.59f, 12f)
                lineTo(15f, 9.41f)
                lineTo(16.41f, 8f)
                lineTo(19f, 10.59f)
                lineTo(21.59f, 8f)
                lineTo(23f, 9.41f)
                lineTo(20.41f, 12f)
                lineTo(23f, 14.59f)
                lineTo(21.59f, 16f)
                lineTo(19f, 13.41f)
                lineTo(16.41f, 16f)
                lineTo(15f, 14.59f)
                lineTo(17.59f, 12f)
                close()
            }
        }.build()

        return _TableColumnRemove!!
    }

@Suppress("ObjectPropertyName")
private var _TableColumnRemove: ImageVector? = null
