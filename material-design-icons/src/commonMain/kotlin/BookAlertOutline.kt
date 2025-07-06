package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookAlertOutline: ImageVector
    get() {
        if (_BookAlertOutline != null) {
            return _BookAlertOutline!!
        }
        _BookAlertOutline = ImageVector.Builder(
            name = "BookAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(16f)
                curveTo(17.11f, 22f, 18f, 21.11f, 18f, 20f)
                verticalLineTo(4f)
                curveTo(18f, 2.9f, 17.11f, 2f, 16f, 2f)
                moveTo(16f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                lineTo(8.5f, 9.75f)
                lineTo(11f, 12f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                moveTo(20f, 15f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                moveTo(22f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _BookAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookAlertOutline: ImageVector? = null
