package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowExpandLeft: ImageVector
    get() {
        if (_ArrowExpandLeft != null) {
            return _ArrowExpandLeft!!
        }
        _ArrowExpandLeft = ImageVector.Builder(
            name = "ArrowExpandLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(5.83f)
                lineTo(11.33f, 5.5f)
                lineTo(9.92f, 4.08f)
                lineTo(2f, 12f)
                lineTo(9.92f, 19.92f)
                lineTo(11.33f, 18.5f)
                lineTo(5.83f, 13f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _ArrowExpandLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowExpandLeft: ImageVector? = null
