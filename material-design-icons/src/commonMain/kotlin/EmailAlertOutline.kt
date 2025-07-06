package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailAlertOutline: ImageVector
    get() {
        if (_EmailAlertOutline != null) {
            return _EmailAlertOutline!!
        }
        _EmailAlertOutline = ImageVector.Builder(
            name = "EmailAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(24f)
                verticalLineTo(7f)
                moveTo(24f, 15f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(24f)
                verticalLineTo(15f)
                moveTo(20f, 6f)
                curveTo(20f, 4.9f, 19.1f, 4f, 18f, 4f)
                horizontalLineTo(2f)
                curveTo(0.9f, 4f, 0f, 4.9f, 0f, 6f)
                verticalLineTo(18f)
                curveTo(0f, 19.1f, 0.9f, 20f, 2f, 20f)
                horizontalLineTo(18f)
                curveTo(19.1f, 20f, 20f, 19.1f, 20f, 18f)
                verticalLineTo(6f)
                moveTo(18f, 6f)
                lineTo(10f, 11f)
                lineTo(2f, 6f)
                horizontalLineTo(18f)
                moveTo(18f, 18f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                lineTo(10f, 13f)
                lineTo(18f, 8f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _EmailAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmailAlertOutline: ImageVector? = null
