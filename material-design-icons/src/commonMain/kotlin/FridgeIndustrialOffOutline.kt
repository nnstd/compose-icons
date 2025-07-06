package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FridgeIndustrialOffOutline: ImageVector
    get() {
        if (_FridgeIndustrialOffOutline != null) {
            return _FridgeIndustrialOffOutline!!
        }
        _FridgeIndustrialOffOutline = ImageVector.Builder(
            name = "FridgeIndustrialOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.2f, 4f)
                lineTo(5.7f, 2.5f)
                curveTo(6.05f, 2.19f, 6.5f, 2f, 7f, 2f)
                horizontalLineTo(17f)
                curveTo(18.11f, 2f, 19f, 2.9f, 19f, 4f)
                verticalLineTo(15.8f)
                lineTo(17f, 13.8f)
                verticalLineTo(4f)
                horizontalLineTo(7.2f)
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
                moveTo(17f, 18.89f)
                lineTo(10f, 11.89f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(8.11f)
                lineTo(7f, 8.89f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(18.89f)
                close()
            }
        }.build()

        return _FridgeIndustrialOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FridgeIndustrialOffOutline: ImageVector? = null
