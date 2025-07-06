package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WindowShutterAuto: ImageVector
    get() {
        if (_WindowShutterAuto != null) {
            return _WindowShutterAuto!!
        }
        _WindowShutterAuto = ImageVector.Builder(
            name = "WindowShutterAuto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 14f)
                horizontalLineTo(18f)
                lineTo(14.8f, 23f)
                horizontalLineTo(16.7f)
                lineTo(17.4f, 21f)
                horizontalLineTo(20.6f)
                lineTo(21.3f, 23f)
                horizontalLineTo(23.2f)
                lineTo(20f, 14f)
                moveTo(17.8f, 19.7f)
                lineTo(19f, 16f)
                lineTo(20.2f, 19.7f)
                horizontalLineTo(17.8f)
                moveTo(7f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                moveTo(7f, 12f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                moveTo(7f, 15f)
                horizontalLineTo(15f)
                verticalLineTo(16.5f)
                lineTo(14.8f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                moveTo(13.7f, 20f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(14.5f)
                lineTo(13.7f, 20f)
                moveTo(16f, 8f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                horizontalLineTo(16.6f)
                lineTo(16.1f, 13.3f)
                lineTo(16f, 13.7f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _WindowShutterAuto!!
    }

@Suppress("ObjectPropertyName")
private var _WindowShutterAuto: ImageVector? = null
