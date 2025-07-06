package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SpiritLevel: ImageVector
    get() {
        if (_SpiritLevel != null) {
            return _SpiritLevel!!
        }
        _SpiritLevel = ImageVector.Builder(
            name = "SpiritLevel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 8f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                moveTo(18f, 14f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                moveTo(11f, 12f)
                horizontalLineTo(13f)
                curveTo(14.1f, 12f, 15f, 11.11f, 15f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                curveTo(9f, 11.11f, 9.9f, 12f, 11f, 12f)
                moveTo(4f, 14f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _SpiritLevel!!
    }

@Suppress("ObjectPropertyName")
private var _SpiritLevel: ImageVector? = null
