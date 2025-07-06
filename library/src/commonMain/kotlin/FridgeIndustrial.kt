package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FridgeIndustrial: ImageVector
    get() {
        if (_FridgeIndustrial != null) {
            return _FridgeIndustrial!!
        }
        _FridgeIndustrial = ImageVector.Builder(
            name = "FridgeIndustrial",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                curveTo(5.9f, 2f, 5f, 2.9f, 5f, 4f)
                verticalLineTo(19f)
                curveTo(5f, 20.11f, 5.9f, 21f, 7f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                curveTo(18.11f, 21f, 19f, 20.11f, 19f, 19f)
                verticalLineTo(4f)
                curveTo(19f, 2.9f, 18.11f, 2f, 17f, 2f)
                moveTo(10f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _FridgeIndustrial!!
    }

@Suppress("ObjectPropertyName")
private var _FridgeIndustrial: ImageVector? = null
