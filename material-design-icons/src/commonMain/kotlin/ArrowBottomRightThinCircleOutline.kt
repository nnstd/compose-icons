package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowBottomRightThinCircleOutline: ImageVector
    get() {
        if (_ArrowBottomRightThinCircleOutline != null) {
            return _ArrowBottomRightThinCircleOutline!!
        }
        _ArrowBottomRightThinCircleOutline = ImageVector.Builder(
            name = "ArrowBottomRightThinCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20.03f)
                curveTo(7.59f, 20.03f, 3.97f, 16.41f, 3.97f, 12f)
                curveTo(3.97f, 7.59f, 7.59f, 3.97f, 12f, 3.97f)
                curveTo(16.41f, 3.97f, 20.03f, 7.59f, 20.03f, 12f)
                curveTo(20.03f, 16.41f, 16.41f, 20.03f, 12f, 20.03f)
                moveTo(12f, 22f)
                curveTo(17.54f, 22f, 22f, 17.54f, 22f, 12f)
                curveTo(22f, 6.46f, 17.54f, 2f, 12f, 2f)
                curveTo(6.46f, 2f, 2f, 6.46f, 2f, 12f)
                curveTo(2f, 17.54f, 6.46f, 22f, 12f, 22f)
                moveTo(13.88f, 12.47f)
                lineTo(16f, 10.36f)
                verticalLineTo(16f)
                horizontalLineTo(10.36f)
                lineTo(12.47f, 13.88f)
                lineTo(7.5f, 8.9f)
                lineTo(8.9f, 7.5f)
            }
        }.build()

        return _ArrowBottomRightThinCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottomRightThinCircleOutline: ImageVector? = null
