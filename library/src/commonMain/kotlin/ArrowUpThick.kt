package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpThick: ImageVector
    get() {
        if (_ArrowUpThick != null) {
            return _ArrowUpThick!!
        }
        _ArrowUpThick = ImageVector.Builder(
            name = "ArrowUpThick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 20f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                lineTo(6.5f, 14.5f)
                lineTo(4.08f, 12.08f)
                lineTo(12f, 4.16f)
                lineTo(19.92f, 12.08f)
                lineTo(17.5f, 14.5f)
                lineTo(14f, 11f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _ArrowUpThick!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpThick: ImageVector? = null
