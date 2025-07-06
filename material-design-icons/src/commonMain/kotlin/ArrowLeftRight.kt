package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowLeftRight: ImageVector
    get() {
        if (_ArrowLeftRight != null) {
            return _ArrowLeftRight!!
        }
        _ArrowLeftRight = ImageVector.Builder(
            name = "ArrowLeftRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.45f, 17.45f)
                lineTo(1f, 12f)
                lineTo(6.45f, 6.55f)
                lineTo(7.86f, 7.96f)
                lineTo(4.83f, 11f)
                horizontalLineTo(19.17f)
                lineTo(16.14f, 7.96f)
                lineTo(17.55f, 6.55f)
                lineTo(23f, 12f)
                lineTo(17.55f, 17.45f)
                lineTo(16.14f, 16.04f)
                lineTo(19.17f, 13f)
                horizontalLineTo(4.83f)
                lineTo(7.86f, 16.04f)
                lineTo(6.45f, 17.45f)
                close()
            }
        }.build()

        return _ArrowLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftRight: ImageVector? = null
