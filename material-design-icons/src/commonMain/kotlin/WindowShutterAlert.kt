package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WindowShutterAlert: ImageVector
    get() {
        if (_WindowShutterAlert != null) {
            return _WindowShutterAlert!!
        }
        _WindowShutterAlert = ImageVector.Builder(
            name = "WindowShutterAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
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
                moveTo(20f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                moveTo(20f, 15f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _WindowShutterAlert!!
    }

@Suppress("ObjectPropertyName")
private var _WindowShutterAlert: ImageVector? = null
