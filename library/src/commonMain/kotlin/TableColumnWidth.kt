package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableColumnWidth: ImageVector
    get() {
        if (_TableColumnWidth != null) {
            return _TableColumnWidth!!
        }
        _TableColumnWidth = ImageVector.Builder(
            name = "TableColumnWidth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 8f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 22f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8f)
                moveTo(5f, 12f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                moveTo(13f, 12f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                moveTo(5f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                moveTo(13f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                moveTo(11f, 2f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _TableColumnWidth!!
    }

@Suppress("ObjectPropertyName")
private var _TableColumnWidth: ImageVector? = null
