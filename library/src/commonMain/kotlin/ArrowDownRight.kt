package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDownRight: ImageVector
    get() {
        if (_ArrowDownRight != null) {
            return _ArrowDownRight!!
        }
        _ArrowDownRight = ImageVector.Builder(
            name = "ArrowDownRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 14.5f)
                lineTo(16f, 20f)
                lineTo(10.5f, 14.5f)
                lineTo(11.91f, 13.09f)
                lineTo(15f, 16.17f)
                verticalLineTo(10.5f)
                curveTo(15f, 8f, 13f, 6f, 10.5f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(10.5f)
                curveTo(14.09f, 4f, 17f, 6.91f, 17f, 10.5f)
                verticalLineTo(16.17f)
                lineTo(20.09f, 13.08f)
                lineTo(21.5f, 14.5f)
                close()
            }
        }.build()

        return _ArrowDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownRight: ImageVector? = null
