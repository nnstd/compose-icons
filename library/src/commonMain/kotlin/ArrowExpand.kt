package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowExpand: ImageVector
    get() {
        if (_ArrowExpand != null) {
            return _ArrowExpand!!
        }
        _ArrowExpand = ImageVector.Builder(
            name = "ArrowExpand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(6.41f)
                lineTo(10.91f, 14.5f)
                lineTo(9.5f, 13.09f)
                lineTo(5f, 17.59f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                moveTo(14.5f, 10.91f)
                lineTo(19f, 6.41f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(17.59f)
                lineTo(13.09f, 9.5f)
                lineTo(14.5f, 10.91f)
                close()
            }
        }.build()

        return _ArrowExpand!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowExpand: ImageVector? = null
