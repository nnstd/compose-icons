package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableSplitCell: ImageVector
    get() {
        if (_TableSplitCell != null) {
            return _TableSplitCell!!
        }
        _TableSplitCell = ImageVector.Builder(
            name = "TableSplitCell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 14f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                moveTo(3f, 4f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                moveTo(11f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                lineTo(5f, 12f)
                lineTo(8f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                moveTo(16f, 11f)
                verticalLineTo(9f)
                lineTo(19f, 12f)
                lineTo(16f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _TableSplitCell!!
    }

@Suppress("ObjectPropertyName")
private var _TableSplitCell: ImageVector? = null
