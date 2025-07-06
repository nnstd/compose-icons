package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopLeftThinCircleOutline: ImageVector
    get() {
        if (_ArrowTopLeftThinCircleOutline != null) {
            return _ArrowTopLeftThinCircleOutline!!
        }
        _ArrowTopLeftThinCircleOutline = ImageVector.Builder(
            name = "ArrowTopLeftThinCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3.97f)
                curveTo(16.41f, 3.97f, 20.03f, 7.59f, 20.03f, 12f)
                curveTo(20.03f, 16.41f, 16.41f, 20.03f, 12f, 20.03f)
                curveTo(7.59f, 20.03f, 3.97f, 16.41f, 3.97f, 12f)
                curveTo(3.97f, 7.59f, 7.59f, 3.97f, 12f, 3.97f)
                moveTo(12f, 2f)
                curveTo(6.46f, 2f, 2f, 6.46f, 2f, 12f)
                curveTo(2f, 17.54f, 6.46f, 22f, 12f, 22f)
                curveTo(17.54f, 22f, 22f, 17.54f, 22f, 12f)
                curveTo(22f, 6.46f, 17.54f, 2f, 12f, 2f)
                moveTo(10.12f, 11.53f)
                lineTo(8f, 13.64f)
                verticalLineTo(8f)
                horizontalLineTo(13.64f)
                lineTo(11.53f, 10.12f)
                lineTo(16.5f, 15.1f)
                lineTo(15.1f, 16.5f)
            }
        }.build()

        return _ArrowTopLeftThinCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopLeftThinCircleOutline: ImageVector? = null
