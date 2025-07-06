package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FridgeAlertOutline: ImageVector
    get() {
        if (_FridgeAlertOutline != null) {
            return _FridgeAlertOutline!!
        }
        _FridgeAlertOutline = ImageVector.Builder(
            name = "FridgeAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(4f)
                curveTo(3f, 2.9f, 3.9f, 2f, 5f, 2f)
                horizontalLineTo(15f)
                curveTo(16.11f, 2f, 17f, 2.9f, 17f, 4f)
                verticalLineTo(19f)
                curveTo(17f, 20.11f, 16.11f, 21f, 15f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                moveTo(5f, 4f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                moveTo(5f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                moveTo(6f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                moveTo(6f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                moveTo(19f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                moveTo(19f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _FridgeAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FridgeAlertOutline: ImageVector? = null
