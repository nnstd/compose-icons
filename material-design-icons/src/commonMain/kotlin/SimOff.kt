package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SimOff: ImageVector
    get() {
        if (_SimOff != null) {
            return _SimOff!!
        }
        _SimOff = ImageVector.Builder(
            name = "SimOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(19.46f, 21.35f)
                curveTo(19.1f, 21.75f, 18.58f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.11f, 4f, 20f)
                verticalLineTo(8f)
                lineTo(5.06f, 6.95f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(20f, 4f)
                curveTo(20f, 2.9f, 19.11f, 2f, 18f, 2f)
                horizontalLineTo(10f)
                lineTo(7.6f, 4.4f)
                lineTo(20f, 16.8f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _SimOff!!
    }

@Suppress("ObjectPropertyName")
private var _SimOff: ImageVector? = null
