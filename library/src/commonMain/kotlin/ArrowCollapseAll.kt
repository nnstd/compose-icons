package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowCollapseAll: ImageVector
    get() {
        if (_ArrowCollapseAll != null) {
            return _ArrowCollapseAll!!
        }
        _ArrowCollapseAll = ImageVector.Builder(
            name = "ArrowCollapseAll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 3.09f)
                lineTo(20.91f, 4.5f)
                lineTo(16.41f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(7.59f)
                lineTo(19.5f, 3.09f)
                moveTo(20.91f, 19.5f)
                lineTo(19.5f, 20.91f)
                lineTo(15f, 16.41f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(16.41f)
                lineTo(20.91f, 19.5f)
                moveTo(4.5f, 3.09f)
                lineTo(9f, 7.59f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(7.59f)
                lineTo(3.09f, 4.5f)
                lineTo(4.5f, 3.09f)
                moveTo(3.09f, 19.5f)
                lineTo(7.59f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(16.41f)
                lineTo(4.5f, 20.91f)
                lineTo(3.09f, 19.5f)
                close()
            }
        }.build()

        return _ArrowCollapseAll!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCollapseAll: ImageVector? = null
