package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraSwitchOutline: ImageVector
    get() {
        if (_CameraSwitchOutline != null) {
            return _CameraSwitchOutline!!
        }
        _CameraSwitchOutline = ImageVector.Builder(
            name = "CameraSwitchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                horizontalLineTo(16.8f)
                lineTo(15f, 2f)
                horizontalLineTo(9f)
                lineTo(7.2f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(6f)
                curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                moveTo(9.9f, 4f)
                horizontalLineTo(14.1f)
                lineTo(15.9f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(8.1f)
                moveTo(15f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(8.5f)
                lineTo(5.5f, 12f)
                lineTo(9f, 15.5f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(15.5f)
                lineTo(18.5f, 12f)
                lineTo(15f, 8.5f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _CameraSwitchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CameraSwitchOutline: ImageVector? = null
