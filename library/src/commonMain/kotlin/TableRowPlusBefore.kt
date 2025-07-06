package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableRowPlusBefore: ImageVector
    get() {
        if (_TableRowPlusBefore != null) {
            return _TableRowPlusBefore!!
        }
        _TableRowPlusBefore = ImageVector.Builder(
            name = "TableRowPlusBefore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 14f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                moveTo(4f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                moveTo(10f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                moveTo(20f, 14f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                moveTo(11f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _TableRowPlusBefore!!
    }

@Suppress("ObjectPropertyName")
private var _TableRowPlusBefore: ImageVector? = null
