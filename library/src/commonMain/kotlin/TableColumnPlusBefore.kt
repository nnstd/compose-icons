package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableColumnPlusBefore: ImageVector
    get() {
        if (_TableColumnPlusBefore != null) {
            return _TableColumnPlusBefore!!
        }
        _TableColumnPlusBefore = ImageVector.Builder(
            name = "TableColumnPlusBefore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                moveTo(20f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                moveTo(20f, 16f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                moveTo(20f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                moveTo(9f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _TableColumnPlusBefore!!
    }

@Suppress("ObjectPropertyName")
private var _TableColumnPlusBefore: ImageVector? = null
