package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpThinCircleOutline: ImageVector
    get() {
        if (_ArrowUpThinCircleOutline != null) {
            return _ArrowUpThinCircleOutline!!
        }
        _ArrowUpThinCircleOutline = ImageVector.Builder(
            name = "ArrowUpThinCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3.97f)
                curveTo(7.59f, 3.97f, 3.97f, 7.59f, 3.97f, 12f)
                curveTo(3.97f, 16.41f, 7.59f, 20.03f, 12f, 20.03f)
                curveTo(16.41f, 20.03f, 20.03f, 16.41f, 20.03f, 12f)
                curveTo(20.03f, 7.59f, 16.41f, 3.97f, 12f, 3.97f)
                moveTo(12f, 2f)
                curveTo(17.54f, 2f, 22f, 6.46f, 22f, 12f)
                curveTo(22f, 17.54f, 17.54f, 22f, 12f, 22f)
                curveTo(6.46f, 22f, 2f, 17.54f, 2f, 12f)
                curveTo(2f, 6.46f, 6.46f, 2f, 12f, 2f)
                moveTo(13f, 10.46f)
                horizontalLineTo(16f)
                lineTo(12f, 6.5f)
                lineTo(8f, 10.46f)
                horizontalLineTo(11f)
                verticalLineTo(17.5f)
                horizontalLineTo(13f)
            }
        }.build()

        return _ArrowUpThinCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpThinCircleOutline: ImageVector? = null
