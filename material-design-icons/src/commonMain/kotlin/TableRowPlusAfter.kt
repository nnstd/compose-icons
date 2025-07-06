package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableRowPlusAfter: ImageVector
    get() {
        if (_TableRowPlusAfter != null) {
            return _TableRowPlusAfter!!
        }
        _TableRowPlusAfter = ImageVector.Builder(
            name = "TableRowPlusAfter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 10f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(3f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                moveTo(4f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                moveTo(10f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                moveTo(20f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                moveTo(11f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _TableRowPlusAfter!!
    }

@Suppress("ObjectPropertyName")
private var _TableRowPlusAfter: ImageVector? = null
