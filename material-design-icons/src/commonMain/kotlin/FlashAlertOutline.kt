package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlashAlertOutline: ImageVector
    get() {
        if (_FlashAlertOutline != null) {
            return _FlashAlertOutline!!
        }
        _FlashAlertOutline = ImageVector.Builder(
            name = "FlashAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 2f)
                horizontalLineTo(15f)
                lineTo(11.5f, 9f)
                horizontalLineTo(15f)
                lineTo(8f, 22f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                moveTo(7f, 4f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(14.66f)
                lineTo(12f, 11f)
                horizontalLineTo(8.24f)
                lineTo(11.76f, 4f)
                moveTo(17f, 15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                moveTo(17f, 7f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _FlashAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlashAlertOutline: ImageVector? = null
