package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WindowShutterSettings: ImageVector
    get() {
        if (_WindowShutterSettings != null) {
            return _WindowShutterSettings!!
        }
        _WindowShutterSettings = ImageVector.Builder(
            name = "WindowShutterSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                moveTo(8f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                moveTo(8f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                moveTo(8f, 15f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                moveTo(8f, 18f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                moveTo(13f, 22f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                moveTo(17f, 22f)
                horizontalLineTo(15f)
                verticalLineTo(24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                moveTo(9f, 22f)
                horizontalLineTo(7f)
                verticalLineTo(24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _WindowShutterSettings!!
    }

@Suppress("ObjectPropertyName")
private var _WindowShutterSettings: ImageVector? = null
