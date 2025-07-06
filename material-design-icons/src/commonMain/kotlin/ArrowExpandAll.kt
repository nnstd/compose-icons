package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowExpandAll: ImageVector
    get() {
        if (_ArrowExpandAll != null) {
            return _ArrowExpandAll!!
        }
        _ArrowExpandAll = ImageVector.Builder(
            name = "ArrowExpandAll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 13.09f)
                lineTo(10.91f, 14.5f)
                lineTo(6.41f, 19f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(17.59f)
                lineTo(9.5f, 13.09f)
                moveTo(10.91f, 9.5f)
                lineTo(9.5f, 10.91f)
                lineTo(5f, 6.41f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(6.41f)
                lineTo(10.91f, 9.5f)
                moveTo(14.5f, 13.09f)
                lineTo(19f, 17.59f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(17.59f)
                lineTo(13.09f, 14.5f)
                lineTo(14.5f, 13.09f)
                moveTo(13.09f, 9.5f)
                lineTo(17.59f, 5f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                verticalLineTo(6.41f)
                lineTo(14.5f, 10.91f)
                lineTo(13.09f, 9.5f)
                close()
            }
        }.build()

        return _ArrowExpandAll!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowExpandAll: ImageVector? = null
