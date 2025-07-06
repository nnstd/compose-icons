package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FridgeVariantAlertOutline: ImageVector
    get() {
        if (_FridgeVariantAlertOutline != null) {
            return _FridgeVariantAlertOutline!!
        }
        _FridgeVariantAlertOutline = ImageVector.Builder(
            name = "FridgeVariantAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2f)
                horizontalLineTo(5f)
                curveTo(3.9f, 2f, 3f, 2.9f, 3f, 4f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                curveTo(16.11f, 21f, 17f, 20.11f, 17f, 19f)
                verticalLineTo(4f)
                curveTo(17f, 2.9f, 16.11f, 2f, 15f, 2f)
                moveTo(9f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                moveTo(15f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                moveTo(19f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                moveTo(21f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _FridgeVariantAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FridgeVariantAlertOutline: ImageVector? = null
