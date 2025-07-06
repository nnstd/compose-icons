package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowCollapse: ImageVector
    get() {
        if (_ArrowCollapse != null) {
            return _ArrowCollapse!!
        }
        _ArrowCollapse = ImageVector.Builder(
            name = "ArrowCollapse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 3.09f)
                lineTo(15f, 7.59f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(16.41f)
                lineTo(20.91f, 4.5f)
                lineTo(19.5f, 3.09f)
                moveTo(4f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(7.59f)
                lineTo(3.09f, 19.5f)
                lineTo(4.5f, 20.91f)
                lineTo(9f, 16.41f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _ArrowCollapse!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCollapse: ImageVector? = null
