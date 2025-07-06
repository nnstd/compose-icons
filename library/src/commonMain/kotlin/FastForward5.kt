package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FastForward5: ImageVector
    get() {
        if (_FastForward5 != null) {
            return _FastForward5!!
        }
        _FastForward5 = ImageVector.Builder(
            name = "FastForward5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 3f)
                curveTo(14.15f, 3f, 16.55f, 4f, 18.4f, 5.6f)
                lineTo(21f, 3f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                lineTo(16.62f, 7.38f)
                curveTo(15.23f, 6.22f, 13.46f, 5.5f, 11.5f, 5.5f)
                curveTo(7.96f, 5.5f, 4.95f, 7.81f, 3.9f, 11f)
                lineTo(1.53f, 10.22f)
                curveTo(2.92f, 6.03f, 6.85f, 3f, 11.5f, 3f)
                moveTo(9f, 12f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                curveTo(14.11f, 16f, 15f, 16.9f, 15f, 18f)
                verticalLineTo(20f)
                curveTo(15f, 21.11f, 14.11f, 22f, 13f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _FastForward5!!
    }

@Suppress("ObjectPropertyName")
private var _FastForward5: ImageVector? = null
