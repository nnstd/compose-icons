package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FridgeIndustrialOff: ImageVector
    get() {
        if (_FridgeIndustrialOff != null) {
            return _FridgeIndustrialOff!!
        }
        _FridgeIndustrialOff = ImageVector.Builder(
            name = "FridgeIndustrialOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15.8f)
                lineTo(5.7f, 2.5f)
                curveTo(6.05f, 2.19f, 6.5f, 2f, 7f, 2f)
                horizontalLineTo(17f)
                curveTo(18.11f, 2f, 19f, 2.9f, 19f, 4f)
                verticalLineTo(15.8f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18.46f, 20.35f)
                curveTo(18.1f, 20.75f, 17.58f, 21f, 17f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                curveTo(5.9f, 21f, 5f, 20.11f, 5f, 19f)
                verticalLineTo(6.89f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(10f, 11.89f)
                lineTo(8.11f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(11.89f)
                close()
            }
        }.build()

        return _FridgeIndustrialOff!!
    }

@Suppress("ObjectPropertyName")
private var _FridgeIndustrialOff: ImageVector? = null
