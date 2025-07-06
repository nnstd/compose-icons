package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FridgeVariant: ImageVector
    get() {
        if (_FridgeVariant != null) {
            return _FridgeVariant!!
        }
        _FridgeVariant = ImageVector.Builder(
            name = "FridgeVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 4f)
                verticalLineTo(19f)
                curveTo(19f, 20.11f, 18.11f, 21f, 17f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(12.5f)
                verticalLineTo(2f)
                horizontalLineTo(17f)
                curveTo(18.11f, 2f, 19f, 2.9f, 19f, 4f)
                moveTo(7f, 2f)
                horizontalLineTo(11.5f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                curveTo(5.9f, 21f, 5f, 20.11f, 5f, 19f)
                verticalLineTo(4f)
                curveTo(5f, 2.9f, 5.9f, 2f, 7f, 2f)
                moveTo(10f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _FridgeVariant!!
    }

@Suppress("ObjectPropertyName")
private var _FridgeVariant: ImageVector? = null
