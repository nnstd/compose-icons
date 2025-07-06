package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowLeftThick: ImageVector
    get() {
        if (_ArrowLeftThick != null) {
            return _ArrowLeftThick!!
        }
        _ArrowLeftThick = ImageVector.Builder(
            name = "ArrowLeftThick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                lineTo(14.5f, 17.5f)
                lineTo(12.08f, 19.92f)
                lineTo(4.16f, 12f)
                lineTo(12.08f, 4.08f)
                lineTo(14.5f, 6.5f)
                lineTo(11f, 10f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _ArrowLeftThick!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftThick: ImageVector? = null
