package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowExpandUp: ImageVector
    get() {
        if (_ArrowExpandUp != null) {
            return _ArrowExpandUp!!
        }
        _ArrowExpandUp = ImageVector.Builder(
            name = "ArrowExpandUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(5.83f)
                lineTo(18.5f, 11.33f)
                lineTo(19.92f, 9.92f)
                lineTo(12f, 2f)
                lineTo(4.08f, 9.92f)
                lineTo(5.5f, 11.33f)
                lineTo(11f, 5.83f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _ArrowExpandUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowExpandUp: ImageVector? = null
