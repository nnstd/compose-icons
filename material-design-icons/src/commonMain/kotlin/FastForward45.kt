package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FastForward45: ImageVector
    get() {
        if (_FastForward45 != null) {
            return _FastForward45!!
        }
        _FastForward45 = ImageVector.Builder(
            name = "FastForward45",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 3f)
                curveTo(14.1f, 3f, 16.5f, 4f, 18.4f, 5.6f)
                lineTo(21f, 3f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                lineTo(16.6f, 7.4f)
                curveTo(15.2f, 6.2f, 13.4f, 5.5f, 11.5f, 5.5f)
                curveTo(8f, 5.5f, 4.9f, 7.8f, 3.9f, 11f)
                lineTo(1.5f, 10.2f)
                curveTo(2.9f, 6f, 6.8f, 3f, 11.5f, 3f)
                moveTo(13f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                curveTo(18.1f, 16f, 19f, 16.9f, 19f, 18f)
                verticalLineTo(20f)
                curveTo(19f, 21.1f, 18.1f, 22f, 17f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                moveTo(5f, 12f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _FastForward45!!
    }

@Suppress("ObjectPropertyName")
private var _FastForward45: ImageVector? = null
