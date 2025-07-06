package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StoolOutline: ImageVector
    get() {
        if (_StoolOutline != null) {
            return _StoolOutline!!
        }
        _StoolOutline = ImageVector.Builder(
            name = "StoolOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                curveTo(20f, 3.79f, 18.21f, 2f, 16f, 2f)
                horizontalLineTo(8f)
                curveTo(5.78f, 2f, 4f, 3.79f, 4f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                lineTo(4f, 22f)
                horizontalLineTo(6f)
                lineTo(7.5f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(16.5f)
                lineTo(18f, 22f)
                horizontalLineTo(20f)
                lineTo(17f, 8f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                moveTo(7.93f, 13f)
                lineTo(9f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(7.93f)
                moveTo(16.07f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                lineTo(16.07f, 13f)
                moveTo(6f, 6f)
                curveTo(6f, 4.9f, 6.89f, 4f, 8f, 4f)
                horizontalLineTo(16f)
                curveTo(17.1f, 4f, 18f, 4.9f, 18f, 6f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _StoolOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StoolOutline: ImageVector? = null
