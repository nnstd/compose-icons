package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoSwitchOutline: ImageVector
    get() {
        if (_VideoSwitchOutline != null) {
            return _VideoSwitchOutline!!
        }
        _VideoSwitchOutline = ImageVector.Builder(
            name = "VideoSwitchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 13f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                lineTo(15f, 12f)
                lineTo(12f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                lineTo(5f, 12f)
                lineTo(8f, 15f)
                verticalLineTo(13f)
                moveTo(18f, 9.5f)
                verticalLineTo(6f)
                curveTo(18f, 5.4f, 17.5f, 5f, 17f, 5f)
                horizontalLineTo(3f)
                curveTo(2.5f, 5f, 2f, 5.4f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 18.5f, 2.5f, 19f, 3f, 19f)
                horizontalLineTo(17f)
                curveTo(17.5f, 19f, 18f, 18.5f, 18f, 18f)
                verticalLineTo(14.5f)
                lineTo(22f, 18.5f)
                verticalLineTo(5.5f)
                lineTo(18f, 9.5f)
                moveTo(16f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _VideoSwitchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _VideoSwitchOutline: ImageVector? = null
