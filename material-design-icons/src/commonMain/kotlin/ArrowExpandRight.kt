package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowExpandRight: ImageVector
    get() {
        if (_ArrowExpandRight != null) {
            return _ArrowExpandRight!!
        }
        _ArrowExpandRight = ImageVector.Builder(
            name = "ArrowExpandRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(18.17f)
                lineTo(12.67f, 18.5f)
                lineTo(14.08f, 19.92f)
                lineTo(22f, 12f)
                lineTo(14.08f, 4.08f)
                lineTo(12.67f, 5.5f)
                lineTo(18.17f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _ArrowExpandRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowExpandRight: ImageVector? = null
