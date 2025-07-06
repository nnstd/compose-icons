package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FridgeVariantAlert: ImageVector
    get() {
        if (_FridgeVariantAlert != null) {
            return _FridgeVariantAlert!!
        }
        _FridgeVariantAlert = ImageVector.Builder(
            name = "FridgeVariantAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4f)
                verticalLineTo(19f)
                curveTo(17f, 20.11f, 16.11f, 21f, 15f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(10.5f)
                verticalLineTo(2f)
                horizontalLineTo(15f)
                curveTo(16.11f, 2f, 17f, 2.9f, 17f, 4f)
                moveTo(5f, 2f)
                horizontalLineTo(9.5f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(4f)
                curveTo(3f, 2.9f, 3.9f, 2f, 5f, 2f)
                moveTo(8f, 10f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                moveTo(19f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                moveTo(19f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _FridgeVariantAlert!!
    }

@Suppress("ObjectPropertyName")
private var _FridgeVariantAlert: ImageVector? = null
