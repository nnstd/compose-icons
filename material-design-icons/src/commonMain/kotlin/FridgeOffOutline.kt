package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FridgeOffOutline: ImageVector
    get() {
        if (_FridgeOffOutline != null) {
            return _FridgeOffOutline!!
        }
        _FridgeOffOutline = ImageVector.Builder(
            name = "FridgeOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(5f, 6.89f)
                verticalLineTo(19f)
                curveTo(5f, 20.11f, 5.9f, 21f, 7f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                curveTo(17.58f, 21f, 18.1f, 20.75f, 18.46f, 20.35f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(17f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(9.11f)
                lineTo(17f, 18.89f)
                verticalLineTo(19f)
                moveTo(7.2f, 4f)
                lineTo(5.7f, 2.5f)
                curveTo(6.05f, 2.19f, 6.5f, 2f, 7f, 2f)
                horizontalLineTo(17f)
                curveTo(18.11f, 2f, 19f, 2.9f, 19f, 4f)
                verticalLineTo(15.8f)
                lineTo(17f, 13.8f)
                verticalLineTo(11f)
                horizontalLineTo(14.2f)
                lineTo(12.2f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(7.2f)
                moveTo(8f, 12f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _FridgeOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FridgeOffOutline: ImageVector? = null
