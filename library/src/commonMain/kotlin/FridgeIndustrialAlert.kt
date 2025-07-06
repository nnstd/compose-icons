package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FridgeIndustrialAlert: ImageVector
    get() {
        if (_FridgeIndustrialAlert != null) {
            return _FridgeIndustrialAlert!!
        }
        _FridgeIndustrialAlert = ImageVector.Builder(
            name = "FridgeIndustrialAlert",
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
                moveTo(8f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                moveTo(21f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                moveTo(19f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _FridgeIndustrialAlert!!
    }

@Suppress("ObjectPropertyName")
private var _FridgeIndustrialAlert: ImageVector? = null
