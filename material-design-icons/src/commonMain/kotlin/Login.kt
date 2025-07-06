package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Login: ImageVector
    get() {
        if (_Login != null) {
            return _Login!!
        }
        _Login = ImageVector.Builder(
            name = "Login",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 7f)
                lineTo(9.6f, 8.4f)
                lineTo(12.2f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(12.2f)
                lineTo(9.6f, 15.6f)
                lineTo(11f, 17f)
                lineTo(16f, 12f)
                lineTo(11f, 7f)
                moveTo(20f, 19f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                curveTo(21.1f, 21f, 22f, 20.1f, 22f, 19f)
                verticalLineTo(5f)
                curveTo(22f, 3.9f, 21.1f, 3f, 20f, 3f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _Login!!
    }

@Suppress("ObjectPropertyName")
private var _Login: ImageVector? = null
