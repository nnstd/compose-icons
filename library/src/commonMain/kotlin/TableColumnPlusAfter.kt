package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableColumnPlusAfter: ImageVector
    get() {
        if (_TableColumnPlusAfter != null) {
            return _TableColumnPlusAfter!!
        }
        _TableColumnPlusAfter = ImageVector.Builder(
            name = "TableColumnPlusAfter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(11f)
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
                moveTo(15f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _TableColumnPlusAfter!!
    }

@Suppress("ObjectPropertyName")
private var _TableColumnPlusAfter: ImageVector? = null
