package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeleteAlertOutline: ImageVector
    get() {
        if (_DeleteAlertOutline != null) {
            return _DeleteAlertOutline!!
        }
        _DeleteAlertOutline = ImageVector.Builder(
            name = "DeleteAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 19f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                curveTo(16f, 20.1f, 15.1f, 21f, 14f, 21f)
                horizontalLineTo(6f)
                curveTo(4.9f, 21f, 4f, 20.1f, 4f, 19f)
                moveTo(6f, 9f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                moveTo(13.5f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(6.5f)
                lineTo(7.5f, 3f)
                horizontalLineTo(12.5f)
                lineTo(13.5f, 4f)
                moveTo(19f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                moveTo(19f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _DeleteAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DeleteAlertOutline: ImageVector? = null
