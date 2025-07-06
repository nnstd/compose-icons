package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FridgeAlert: ImageVector
    get() {
        if (_FridgeAlert != null) {
            return _FridgeAlert!!
        }
        _FridgeAlert = ImageVector.Builder(
            name = "FridgeAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 2f)
                horizontalLineTo(15f)
                curveTo(16.11f, 2f, 17f, 2.9f, 17f, 4f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                curveTo(3f, 2.9f, 3.9f, 2f, 5f, 2f)
                moveTo(17f, 19f)
                curveTo(17f, 20.11f, 16.11f, 21f, 15f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                moveTo(6f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                moveTo(6f, 12f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
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

        return _FridgeAlert!!
    }

@Suppress("ObjectPropertyName")
private var _FridgeAlert: ImageVector? = null
